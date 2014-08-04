package scripts

import model.IPerson
import model.Person
import model.Person1
import model.Person2

/**
 * User: rgordeev
 * Date: 04.08.14
 * Time: 10:08
 */

def var1 = 0;
def var2 = 'Ivan'
def var3 = "Hello, $var2!"


println ([var1, var2, var3])


Person p = new Person()

p.setAge(30)
p.setName("Ivan")

println p


Person1 p1 = new Person1(age : 40, name: 'Petr')

println "$p1.name, $p1.age"

Person1 p2 = [age : 70] as Person1

println "$p2.name, $p2.age"


IPerson p3 = [
        getAge : { 90 },
        getName : { 'Sidor' }
] as IPerson

def printPerson(IPerson person)
{
    println("${person.getName()}, ${person.getAge()}")
}

printPerson(p3)

printPerson(p as IPerson)

