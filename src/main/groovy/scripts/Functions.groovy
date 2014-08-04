package scripts

/**
 * User: rgordeev
 * Date: 04.08.14
 * Time: 11:36
 */
def log(x, base = 10)
{
    Math.log(x) / Math.log(base)
}


println log(10)

println log(100)

println log(32, 2)


def tasks(name, ...details)
{
    println "$name - $details"
}

tasks 'task1'

tasks 'task1', 'description1'

tasks 'task1', 'description1', 'description2', 10, 234, [name : 'Ivan']


class Robot
{
    def type, height, width

    def access(location, weight, fragile)
    {
        println "Process fragile? $fragile, weight: $weight, location: $location"
    }
}

Robot r = new Robot(type: 'robot1', height: 20, width: 30)

println "type: $r.type, height: $r.height, width: $r.width"

r.access('location', 10, true)

r.access(20, 30, false)

r.access(50, true, y: 10)

r.access(x: 10, 50, true, y: 10, z: 50)

def external = "External variable"

def func1(name, external, ...descriptions)
{
    println "$external"
    println "$name - $descriptions"
}

def closure1 = {name, ...descriptions ->
    println "$external"
    println "$name - $descriptions"
}


func1('func1', external, 'func details')

closure1('closure1', 'closure details')

closure2 = {name, ...descriptions ->
    println "closure2 external: $external"
    println "closure2: $name - $descriptions"
}

def func2(name, external, ...descriptions)
{
    println "function2 external: $external"
    println "function2: $name - $descriptions"

    closure2(name, descriptions)

    def closure3 = {
        println "closure3 external: $external"
        println "closure3: $name - $descriptions"
    }

    closure3()

}



closure2('closure2', 'closure2 description')

func2('func2', 'func2 external variable', 'function2 description')