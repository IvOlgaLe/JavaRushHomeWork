package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {
        Man man1 = new Man("vasya",20,"a");
        Man man2 = new Man("petya",21,"b");
        Woman woman1 = new Woman("masha", 20,"a");
        Woman woman2 = new Woman("galya", 20, "b");

        //создай по два объекта каждого класса тут

        System.out.println(man1.name+" "+man1.age+" "+man1.address);//выведи их на экран тут
        System.out.println(man2.name+" "+man2.age+" "+man2.address);//выведи их на экран тут
        System.out.println(woman1.name+" "+woman1.age+" "+woman1.address);//выведи их на экран тут
        System.out.println(woman2.name+" "+woman2.age+" "+woman2.address);//выведи их на экран тут
    }

    public static class Man
    {
        String name;
        int age;
        String address;
        public Man(String n, int a, String ad)
        {this.name=n;
            this.age=a;
            this.address=ad;
        }

    }
    public static class Woman
    {
        String name;
        int age;
        String address;
        public Woman(String n, int a, String ad)
        {this.name=n;
            this.age=a;
            this.address=ad;
        }

    }//добавьте тут ваши классы
}
