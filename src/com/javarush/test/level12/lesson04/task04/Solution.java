package com.javarush.test.level12.lesson04.task04;

/* Три метода возвращают минимальное из двух переданных в него чисел
Написать public static методы: int min(int, int), long min(long, long), double min(double, double).
Каждый метод должен возвращать минимальное из двух переданных в него чисел.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static int min(int o1, int o2)
    {
        if(o1<o2)   return o1;
        else  return o2;
    }

    public static long min(long o1, long o2)
    {
        if(o1<o2)   return o1;
        else  return o2;
    }

    public static double min(double o1, double o2)
    {
        if(o1<o2)   return o1;
        else  return o2;
    }


    //Напишите тут ваши методы
}
