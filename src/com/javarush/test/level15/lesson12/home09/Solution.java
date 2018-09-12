package com.javarush.test.level15.lesson12.home09;

/* Парсер реквестов
Считать с консоли URl ссылку.
Вывести на экран через пробел список всех параметров (Параметры идут после ? и разделяются &, например, lvl=15).
URL содержит минимум 1 параметр.
Если присутствует параметр obj, то передать его значение в нужный метод alert.
alert(double value) - для чисел (дробные числа разделяются точкой)
alert(String value) - для строк

Пример 1
Ввод:
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
Вывод:
lvl view name

Пример 2
Ввод:
http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo
Вывод:
obj name
double 3.14
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//add your code here
        String s = reader.readLine();
        String s2 = s.substring(s.indexOf("?"));
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < s2.length(); i++)
        {
            if (s2.charAt(i) == '?' || s2.charAt(i) == '&')
            {
                try
                {
                    for (int j = i + 1; j < s2.length() + 1; j++)
                    {
                        if (s2.charAt(j) == '&' || s2.charAt(j) == '=')
                        {
                            if (s2.substring(i + 1, j).equals("obj"))
                            {
                                try
                                {
                                    list.add(s2.substring(j + 1, s2.indexOf('&', j + 1)));
                                }
                                catch (Exception e1)
                                {
                                    list.add(s2.substring(j + 1, s2.length()));
                                }
                            }

                            System.out.print(s2.substring(i + 1, j) + " ");
                            break;
                        }
                    }
                }
                catch(Exception e2)
                {
                    System.out.print(s2.substring(i + 1));
                }
            }
        }

        System.out.println();
        for (String s1 : list)
        {
            try
            {
                alert(Double.parseDouble(s1));
            }
            catch (Exception e)
            {
                alert(s1);
            }
        }
    }

    public static void alert(double value)
    {
        System.out.println("double " + value);
    }

    public static void alert(String value)
    {
        System.out.println("String " + value);
    }
}
