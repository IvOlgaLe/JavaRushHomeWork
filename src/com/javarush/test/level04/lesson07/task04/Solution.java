package com.javarush.test.level04.lesson07.task04;

/* Положительные и отрицательные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и количество отрицательных чисел в исходном наборе,
в следующем виде:
"количество отрицательных чисел: а", "количество положительных чисел: б", где а, б - искомые значения.
Пример для чисел 2 5 6:
количество отрицательных чисел: 0
количество положительных чисел: 3
Пример для чисел -2 -5 6:
количество отрицательных чисел: 2
количество положительных чисел: 1
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
        int n2 = Integer.parseInt(s2);
        String s3 = reader.readLine();
        int n3 = Integer.parseInt(s3);
        int p1=0,p2=0;
        if(n1>0) p1=p1+1;
        if(n2>0) p1=p1+1;//напишите тут ваш код
        if(n3>0) p1=p1+1;
        if(n1<0) p2=p2+1;
        if(n2<0) p2=p2+1;//напишите тут ваш код
        if(n3<0) p2=p2+1;
        System.out.println("количество отрицательных чисел: "+p2);
        System.out.println("количество положительных чисел: "+p1);//напишите тут ваш код

    }
}
