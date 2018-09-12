package com.javarush.test.level04.lesson16.home03;

import java.io.*;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.  -1 должно учитываться в сумме.
*/
public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        int m =0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (;true;)
        {
            String s1 = reader.readLine();
            int ss1 = Integer.parseInt(s1);
            m = m + ss1;
            if(s1.equals("-1")) break;
        }
        System.out.print(m);
    }
}
    //напишите тут ваш код



