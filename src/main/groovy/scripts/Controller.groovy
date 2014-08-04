package scripts

import static java.lang.Math.*

/**
 * User: rgordeev
 * Date: 04.08.14
 * Time: 12:06
 */
class ControllerC {

    def list = {
        println "names: $names"
    }

    def listf()
    {
        println "names: $names"
    }

    def names;
}


def c1 = new ControllerC(names: ['name1', 'name2', 'name3'])
def c2 = new ControllerC(names: ['name3', 'name4', 'name5'])


println c1.list()

ControllerC.metaClass.name = {
    delegate.names[0]
}

def c3 = new ControllerC(names: ['name6', 'name7'])

println c3.name()

c1.metaClass.name = {
    delegate.names[1]
}

println c1.name()