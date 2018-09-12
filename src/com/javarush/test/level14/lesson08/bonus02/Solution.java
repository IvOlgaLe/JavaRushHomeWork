package com.javarush.test.level14.lesson08.bonus02;

/* НОД
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.
*/

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        int n1 = Integer.parseInt(s1);
        String s2 = reader.readLine();
        int n2 = Integer.parseInt(s2);

        int max=n1; int min=n2;
        if(n2>n1)
        {max=n2; min=n1;}

        int del=1;
        for(int i=0; i<min; i++)
        {
            if(max%(min-i)==0 && min%(min-i)==0)
            {
                del=(min-i);
                break;
            }
        }
        System.out.println(del);
    }
}
