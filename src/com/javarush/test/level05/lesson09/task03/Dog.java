package com.javarush.test.level05.lesson09.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя конструкторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    private String fname = null, fcolor=null;
    int fheight=0;

    public Dog(String name)
    {
        this.fname = name;
    }

    public Dog(String name, int height)
    {
        this.fname = name;
        this.fheight = height;
    }

    public Dog(String name, int height, String color)
    {
        this.fname = name;
        this.fheight = height;
        this.fcolor = color;
    }//напишите тут ваш код

}
