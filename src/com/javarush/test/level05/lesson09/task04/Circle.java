package com.javarush.test.level05.lesson09.task04;

/* Создать класс Circle
Создать класс (Circle) круг, с тремя конструкторами:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius, width, color
*/

public class Circle
{
    private String fcolor=null;
    int fcenterX=0, fcenterY=0, fradius=0, fwidth=0;

    public Circle(int centerX, int centerY, int radius)
    {
        this.fcenterX = centerX;
        this.fcenterY = centerY;
        this.fradius = radius;
    }

    public Circle(int centerX, int centerY, int radius, int width)
    {
        this.fcenterX = centerX;
        this.fcenterY = centerY;
        this.fradius = radius;
        this.fwidth = width;
    }

    public Circle(int centerX, int centerY, int radius, int width, String color)
    {
        this.fcenterX = centerX;
        this.fcenterY = centerY;
        this.fradius = radius;
        this.fwidth = width;
        this.fcolor = color;
    }//напишите тут ваш код

}
