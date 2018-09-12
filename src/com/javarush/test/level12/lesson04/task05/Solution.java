package com.javarush.test.level12.lesson04.task05;

/* Три метода возвращают максимальное из двух переданных в него чисел
Написать public static методы: int max(int, int), long max (long, long), double max (double, double).
Каждый метод должен возвращать максимальное из двух переданных в него чисел.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static int max(int o1, int o2)
    {
        if(o1>o2)   return o1;
        else  return o2;
    }

    public static long max(long o1, long o2)
    {
        if(o1>o2)   return o1;
        else  return o2;
    }

    public static double max(double o1, double o2)
    {
        if(o1>o2)   return o1;
        else  return o2;
    }
    //Напишите тут ваши методы
}
