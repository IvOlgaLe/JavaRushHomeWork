package com.javarush.test.level04.lesson06.task07;

/* Три числа
Ввести с клавиатуры три целых числа. Одно из чисел отлично от двух других, равных между собой.
Вывести на экран порядковый номер числа, отличного от остальных.
Пример для чисел 4 6 6:
1
Пример для чисел 6 6 3:
3
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
        int n3 = Integer.parseInt(s3);
        int m=0;
        if (n1==n2) m=3;
        if (n1==n3) m=2;
        if (n2==n3) m=1;

            System.out.println(m);

        //напишите тут ваш код

    }
}
