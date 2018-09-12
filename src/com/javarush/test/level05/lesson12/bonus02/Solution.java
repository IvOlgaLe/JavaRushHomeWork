package com.javarush.test.level05.lesson12.bonus02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Нужно добавить в программу новую функциональность
Задача: Программа вводит два числа с клавиатуры и выводит минимальное из них на экран.
Новая задача: Программа вводит пять чисел с клавиатуры и выводит минимальное из них на экран.
*/

public class Solution
{

    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a1 = reader.readLine();
        int a = Integer.parseInt(a1);
        String b1 = reader.readLine();
        int b = Integer.parseInt(b1);
        String c1 = reader.readLine();
        int c = Integer.parseInt(c1);
        String d1 = reader.readLine();
        int d = Integer.parseInt(d1);
        String e1 = reader.readLine();
        int e = Integer.parseInt(e1);
        int minimum = min(a, b, c, d, e);

        System.out.println("Minimum = " + minimum);
    }


    public static int min(int a, int b, int c, int d, int e)
    {
       int m1=0, m2=0, m3=0, m=0;
        if(a<b) m1=a; else m1=b;
        if(c<d) m2=c; else m2=d;
        if(m1<m2) m3=m1; else m3=m2;
        if(e<m3) m=e; else m=m3;

        return m;
    }

}
