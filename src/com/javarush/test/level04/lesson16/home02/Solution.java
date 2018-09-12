package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        int n1 = Integer.parseInt(s1);//напишите тут ваш код
        String s2 = reader.readLine();
        int n2 = Integer.parseInt(s2);//напишите тут ваш код
        String s3 = reader.readLine();
        int n3 = Integer.parseInt(s3);
        int m1=0, m2=0, m3=0;

        if(n1>n2) m1=n1; else m1=n2;
        if(n3>m1) m1=n3;
        if(n1<n2) m3=n1; else m3=n2;
        if(n3<m3) m3=n3;

        if(n1<m1 && n1>m3) m2=n1;
        if(n2<m1 && n2>m3) m2=n2;
        if(n3<m1 && n3>m3) m2=n3;

        System.out.println(m2);




        //напишите тут ваш код
    }
}
