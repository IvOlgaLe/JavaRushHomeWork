package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        Human ch1=new Human("Деть1", true, 8);
        Human ch2=new Human("Деть2", false, 6);
        Human ch3=new Human("Деть3", true, 4);
        ArrayList<Human> ch= new ArrayList<Human>();
        ch.add(ch1);
        ch.add(ch2);
        ch.add(ch3);
        Human f=new Human("Папа",true,31,ch);
        Human m=new Human("Мама",false,29,ch);
        ArrayList<Human> fAr= new ArrayList<Human>();
        fAr.add(f);
        ArrayList<Human> mAr= new ArrayList<Human>();
        mAr.add(m);
        Human gf1=new Human("Дед1",true,56,fAr);//напишите тут ваш код
        Human gf2=new Human("Дед2",true,58,mAr);
        Human gm1=new Human("Баба1",false,51,fAr);
        Human gm2=new Human("Баба2",false,53,mAr);

        System.out.println(gf1.toString());
        System.out.println(gf2.toString());
        System.out.println(gm1.toString());
        System.out.println(gm2.toString());
        System.out.println(f.toString());
        System.out.println(m.toString());

       for(int i=0; i<ch.size(); i++)
       {System.out.println(ch.get(i).toString());
       }
    }

    public static class Human
    {
        String  name;
        boolean sex;
        int age;
        ArrayList<Human> children=new ArrayList<Human>();
        public Human(String name,boolean sex,int age, ArrayList<Human> children)
        {
            this.name=name;
            this.sex=sex;
            this.age=age;
            this.children=children;
        };//напишите тут ваш код

        public Human(String name, boolean sex, int age)
        {
            this.name=name;
            this.sex=sex;
            this.age=age;
        }
        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
