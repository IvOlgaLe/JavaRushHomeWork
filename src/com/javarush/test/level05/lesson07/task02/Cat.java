package com.javarush.test.level05.lesson07.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью инициализаторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст неизвестны, это бездомный кот)
- вес, цвет, адрес ( чужой домашний кот)
Задача инициализатора – сделать объект валидным. Например, если вес неизвестен, то нужно указать какой-нибудь средний вес. Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{
    private String fname = null, fcolor=null, faddress=null;
    int fage=2, fweight=5;

    public void initialize(String name)
    {
        this.fname = name;
    }

    public void initialize(String name, int weight, int age)
    {
        this.fname = name;
        this.fweight = weight;
        this.fage = age;
    }

    public void initialize(String name, int age)
    {
        this.fname = name;
        this.fage = age;
    }

    public void initialize(int weight, String color)
    {
        this.fweight = weight;
        this.fcolor = color;
    }

    public void initialize(int weight, String color, String address)
    {
        this.fweight = weight;
        this.fcolor = color;
        this.faddress = address;
    }
//напишите тут ваш код

}
