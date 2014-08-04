package model

/**
 * User: rgordeev
 * Date: 04.08.14
 * Time: 10:36
 */
class Person2 implements IPerson
{
    private int age
    private String name

    @Override
    String getName() {
        return name
    }

    @Override
    int getAge() {
        return age
    }
}
