package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        Human gf1 = new Human("Дед1", true, 60, null, null);
        Human gf2 = new Human("Дед2", true, 62, null, null);
        Human gm1 = new Human("Баба1", false, 55, null, null);
        Human gm2 = new Human("Баба2", false, 57, null, null);
        Human m = new Human("Мама", false, 35, gf2, gm2);
        Human f = new Human("Папа", true, 37, gf1, gm1);
        Human k1 = new Human("Деть1", true, 12, f, m);
        Human k2 = new Human("Деть2", false, 10, f, m);
        Human k3 = new Human("Деть3", true, 8, f, m);

        System.out.println(gf1.toString());//напишите тут ваш код
        System.out.println(gf2.toString());//напишите тут ваш код
        System.out.println(gm1.toString());//напишите тут ваш код
        System.out.println(gm2.toString());//напишите тут ваш код
        System.out.println(f.toString());//напишите тут ваш код
        System.out.println(m.toString());//напишите тут ваш код
        System.out.println(k1.toString());//напишите тут ваш код
        System.out.println(k2.toString());//напишите тут ваш код
        System.out.println(k3.toString());//напишите тут ваш код
    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String n, boolean s, int a, Human f, Human m)
        {
            name=n;
            sex=s;
            age=a;
            father=f;
            mother=m;
        }

        //напишите тут ваш код

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
