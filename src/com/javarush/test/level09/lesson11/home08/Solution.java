package com.javarush.test.level09.lesson11.home08;

import java.util.ArrayList;

/* Список из массивов чисел
Создать список, элементами которого будут массивы чисел. Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно. Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList()
    {
        ArrayList<int[]> list1 = new ArrayList<>();
        int[] s1={1,2,3,4,5};
        int[] s2={1,2};
        int[] s3={1,2,3,4};
        int[] s4={1,2,3,4,5,6,7};
        int[] s5={};
        list1.add(s1);
        list1.add(s2);
        list1.add(s3);
        list1.add(s4);
        list1.add(s5);
            return list1;
            //напишите тут ваш код
    }

    public static void printList(ArrayList<int[]> list)
    {
        for (int[] array: list )
        {
            for (int x: array)
            {
                System.out.println(x);
            }
        }
    }
}
