package com.javarush.test.level07.lesson06.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

/* Самая длинная строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> list1 = new ArrayList<String>();

        for (int i=0; i<5; i++)
        {
            String s = reader.readLine();
            list.add(s);
        }

        int max = list.get(0).length();
               // int c=0;

        for (int i = 1; i < list.size(); i++)
        {
            if (list.get(i).length() > max)
            {
                //c++;
                max = list.get(i).length();

            }

        }
        for (int i = 0; i < list.size(); i++)
            if (list.get(i).length() == max)
            {
                list1.add(list.get(i));
            }

    for (int i = 0; i < list1.size(); i++)
    {
        System.out.println( list1.get(i) );
    }
}
        //напишите тут ваш код

    }

