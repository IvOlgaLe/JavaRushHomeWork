package com.javarush.test.level05.lesson07.task01;

/* Создать класс Friend
Создать класс Friend (друг) с тремя инициализаторами (тремя методами initialize):
- Имя
- Имя, возраст
- Имя, возраст, пол
*/

public class Friend
{
    private String fname = null, sex=null;
    int age=0;

    public void initialize(String name)
    {
        this.fname = name;
    }

    public void initialize(String name, int age)
    {
        this.fname = name;
        this.age = age;
    }
    public void initialize(String name, int age, String sex)
    {
        this.fname = name;
        this.age = age;
        this.sex = sex;
    }
        //напишите тут ваш код
}
