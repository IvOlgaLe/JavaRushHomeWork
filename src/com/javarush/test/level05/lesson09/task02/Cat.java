package com.javarush.test.level05.lesson09.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью конструкторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст – неизвестные. Кот - бездомный)
- вес, цвет, адрес ( чужой домашний кот)
Задача конструктора – сделать объект валидным. Например, если вес не известен, то нужно указать какой-нибудь средний вес. Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{
    private String fname = null, fcolor=null, faddress=null;
    int fage=2, fweight=5;

    public Cat(String name)
    {
        this.fname = name;
    }

    public Cat(String name, int weight, int age)
    {
        this.fname = name;
        this.fweight = weight;
        this.fage = age;
    }

    public Cat(String name, int age)
    {
        this.fname = name;
        this.fage = age;
    }

    public Cat(int weight, String color)
    {
        this.fweight = weight;
        this.fcolor = color;
    }

    public Cat(int weight, String color, String address)
    {
        this.fweight = weight;
        this.fcolor = color;
        this.faddress = address;
    }//напишите тут ваш код

}
