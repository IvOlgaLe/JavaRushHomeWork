package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {
        new Human("Ally");
        new Human("Ally", 5);
        new Human("Ally", 5, 6);
        new Human("Ally", 5, 6, 7);
        new Human("Ally", 5, 6, 7, "TR");
        new Human("Ally", 5, 6, 7, "TR", 2);
        new Human("Ally", "TR");
        new Human("Ally", 5, "TR");
        new Human("Ally", "TR",6);
        new Human("Ally", "TR",6, 7);

    }

    public static class Human
    {
        String name;
        int age;
        int weight;
        int tall;
        String face;
        int force;

        public Human(String name){}
        public Human(String name, int age){}
        public Human(String name, int age, int weight){}
        public Human(String name, int age, int weight, int tall){}
        public Human(String name, int age, int weight, int tall, String face){}
        public Human(String name, int age, int weight, int tall, String face, int force){}
        public Human(String name, String face){}
        public Human(String name, int age, String face){}
        public Human(String name, String face, int weight){}
        public Human(String name, String face, int weight, int tall){}
        //напишите тут ваши переменные и конструкторы
    }
}
