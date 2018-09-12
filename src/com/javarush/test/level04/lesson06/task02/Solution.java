package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        int n1 = Integer.parseInt(s1);//напишите тут ваш код
        String s2 = reader.readLine();
        int n2 = Integer.parseInt(s2);//напишите тут ваш код
        String s3 = reader.readLine();
        int n3 = Integer.parseInt(s3);//напишите тут ваш код
        String s4 = reader.readLine();
        int n4 = Integer.parseInt(s4);//напишите тут ваш код
        int m,m1,m2;
        if(n1>n2) m1 = n1; else m1=n2;
        if(n3>n4) m2=n3; else m2=n4;
        if(m1>m2) m=m1; else m=m2;
        System.out.println(m);

    }
}
