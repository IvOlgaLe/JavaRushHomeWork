package com.javarush.test.level05.lesson09.task01;

/* Создать класс Friend
Создать класс Friend (друг) с тремя конструкторами:
- Имя
- Имя, возраст
- Имя, возраст, пол
*/

public class Friend
{
    private String fname = null, sex=null;
    int age=0;

    public Friend(String name)
    {
        this.fname = name;
    }

    public Friend(String name, int age)
    {
        this.fname = name;
        this.age = age;
    }
    public Friend(String name, int age, String sex)
    {
        this.fname = name;
        this.age = age;
        this.sex = sex;
    }//напишите тут ваш код

}