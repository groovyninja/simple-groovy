package model

/**
 * User: rgordeev
 * Date: 04.08.14
 * Time: 10:15
 */
class Person {
    private int     age;
    private String  name;

    int getAge() {
        return age
    }

    void setAge(int age) {
        this.age = age
    }

    String getName() {
        return name
    }

    void setName(String name) {
        this.name = name
    }

    @Override
    public String toString()
    {
        return "$name, $age"
    }
}
