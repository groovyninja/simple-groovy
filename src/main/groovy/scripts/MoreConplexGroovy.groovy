package scripts

/**
 * User: rgordeev
 * Date: 04.08.14
 * Time: 10:56
 */

def (v1, v2) = ['Hello!', 'Ivan', 90, 100]

println ([v1, v2])


def (v3, v4, v5) = [20, 10]

println ([v3, v4, v5])


def f1(Double v1, Double v2)
{
    Double result = v1 + v2

    [result, v1, v2]
}

def result = f1(10, 40)

println result

def (result1, var1, var2) = f1(10, 40)

println "result1: " + result1
println "var1: " + var1
println "var2: " + var2


def (result2) = f1(10, 40)

println "result2: " + result2

Double result3 = f1(10, 40)[0]

println "result3: " + result3

