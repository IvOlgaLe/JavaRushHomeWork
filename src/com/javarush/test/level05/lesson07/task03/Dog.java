package com.javarush.test.level05.lesson07.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя инициализаторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    private String fname = null, fcolor=null;
    int fheight=1;

    public void initialize(String name)
    {
        this.fname = name;
    }

    public void initialize(String name, int height)
    {
        this.fname = name;
        this.fheight = height;
    }

    public void initialize(String name, int height, String color)
    {
        this.fname = name;
        this.fheight = height;
        this.fcolor = color;
    }
   //напишите тут ваш код

}
