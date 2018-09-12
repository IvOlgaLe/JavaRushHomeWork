package com.javarush.test.level04.lesson13.task01;

/* Четные числа
Используя цикл for вывести на экран чётные числа от 1 до 100 включительно.
Через пробел либо с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //    for(int i=1; i<=100;i++) {if(i%2==0) System.out.println(i);} //напишите тут ваш код
/*
FizzBuzz

Print out the numbers from 1 to 100, each number on its own line, with the following exceptions:
* if the number is divisible by 3, print out "Fizz" instead of the number
* if the number is divisible by 5, print out "Buzz" instead of the number
* if the number is divisible by both 3 and 5, print out "FizzBuzz" instead of the number

*/
        for (int i = 1; i <= 100; i++)
        {
            if (i % 3 == 0)
            {
                if (i % 5 == 0)
                {
                    System.out.println("FizzBuzz");
                } else System.out.println("Fizz");
            }
            if (i % 5 == 0)
            {
                System.out.println("Buzz");
            } else if (i % 3 != 0) System.out.println(i);
        }
    }
}