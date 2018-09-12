package com.javarush.test.level05.lesson12.bonus03;

import java.io.*;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum;

        String N1 = reader.readLine();
        int N = Integer.parseInt(N1);
        if(N>0) {String s1 = reader.readLine();
            int n1 = Integer.parseInt(s1); maximum=n1;
            for(int i=0; i<(N-1);i++) {
                String s = reader.readLine();
                int n = Integer.parseInt(s); if(n>maximum) maximum=n;}
            System.out.println(maximum);}


    }
}
