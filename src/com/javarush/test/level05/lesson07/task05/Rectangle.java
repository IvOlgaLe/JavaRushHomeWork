package com.javarush.test.level05.lesson07.task05;

/* Создать класс прямоугольник (Rectangle)
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (левая координата, верхняя, ширина и высота). Создать для него как можно больше методов initialize(…)
Примеры:
-	заданы 4 параметра: left, top, width, height
-	ширина/высота не задана (оба равны 0)
-	высота не задана (равно ширине) создаём квадрат
-	создаём копию другого прямоугольника (он и передаётся в параметрах)
*/

public class Rectangle
{
    int ftop=0, fleft=0, fheight=0, fwidth=0;

    public void initialize(int top, int left, int height, int width)
    {
        this.ftop = top;
        this.fleft = left;
        this.fheight = height;
        this.fwidth = width;
    }

    public void initialize(int top, int left)
    {
        this.ftop = top;
        this.fleft = left;
    }

    public void initialize(int top, int left, int width)
    {
        this.ftop = top;
        this.fleft = left;
        this.fheight = width;
        this.fwidth = width;
    }

    public void initialize(Rectangle rect)
    {
        rect = this;
    }



}
