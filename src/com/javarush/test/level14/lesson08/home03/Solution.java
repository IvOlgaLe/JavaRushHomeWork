package com.javarush.test.level14.lesson08.home03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* User, Looser, Coder and Proger
1. Ввести [в цикле] с клавиатуры несколько строк (ключей).
Строки(ключи) могут быть такими: "user", "looser", "coder", "proger".
Ввод окончен, когда строка не совпадает ни с одной из выше указанных.

2. Для каждой введенной строки нужно:
2.1. Создать соответствующий объект [см Person.java], например, для строки "user" нужно создать объект класса User.
2.2. Передать этот объект в метод doWork.

3. Написать реализацию метода doWork, который:
3.1. Вызывает метод live() у переданного обекта, если этот объект (person) имеет тип User.
3.2. Вызывает метод doNothing(), если person имеет тип Looser.
3.3. Вызывает метод coding(), если person имеет тип Coder.
3.4. Вызывает метод enjoy(), если person имеет тип Proger.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;
        ArrayList list = new ArrayList();
        ArrayList<Person> list2 = new ArrayList();

        for(;true;)
        {
            key = reader.readLine();
            if(key.equals("user") || key.equals("looser") || key.equals("coder") || key.equals("proger"))
                list.add(key);
            else break;
        }
        //тут цикл по чтению ключей, пункт 1
        {
            for (int i=0; i<list.size(); i++)
            {
                if(list.get(i).equals("user"))
                   list2.add(new Person.User());
                if(list.get(i).equals("looser"))
                    list2.add(new Person.Looser());
                if(list.get(i).equals("coder"))
                    list2.add(new Person.Coder());
                if(list.get(i).equals("proger"))
                    list2.add(new Person.Proger());
            }

            //создаем объект, пункт 2
            for (int i=0; i<list2.size(); i++)
                { doWork(list2.get(i));} //вызываем doWork

        }
    }

    public static void doWork(Person person)
    {
        if(person instanceof Person.User)
            Person.User.live();
        if(person instanceof Person.Looser)
            Person.Looser.doNothing();
        if(person instanceof Person.Coder)
            Person.Coder.coding();
        if(person instanceof Person.Proger)
            Person.Proger.enjoy();// пункт 3
    }
}
