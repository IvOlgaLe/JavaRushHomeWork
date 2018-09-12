package com.javarush.test.level10.lesson11.home08;

import java.util.ArrayList;

/* Массив списков строк
Создать массив, элементами которого будут списки строк. Заполнить массив любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<String>[] arrayOfStringList =  createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList()
    {
        ArrayList<String>[] array = new ArrayList[5];
        ArrayList<String> list1 = new ArrayList<String>();
        ArrayList<String> list2 = new ArrayList<String>();
        ArrayList<String> list3 = new ArrayList<String>();
        ArrayList<String> list4 = new ArrayList<String>();
        ArrayList<String> list5 = new ArrayList<String>();

        for(int i=0; i<3; i++)
        {
            list1.add("элемент" + i);
            list2.add("элемент" + i * 2);
            list3.add("элемент" + i * 3);
            list4.add("элемент" + i * 4);
            list5.add("элемент" + i * 5);
        }

            array[0]=list1;
            array[1]=list2;
            array[2]=list3;
            array[3]=list4;
            array[4]=list5;

        //напишите тут ваш код

        return array;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList)
    {
        for (ArrayList<String> list: arrayOfStringList)
        {
            for (String s : list)
            {
                System.out.println(s);
            }
        }
    }
}