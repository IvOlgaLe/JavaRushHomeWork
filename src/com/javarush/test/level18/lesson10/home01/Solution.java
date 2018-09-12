package com.javarush.test.level18.lesson10.home01;

/* Английские буквы
В метод main первым параметром приходит имя файла.
Посчитать количество букв английского алфавита, которое есть в этом файле.
Вывести на экран число (количество букв)
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader text = new BufferedReader(new FileReader(args[0]));
        int n=0;
        int symbol =  text.read();
        while (symbol != -1)
        {  // Когда дойдём до конца файла, получим '-1'
            if (symbol >='a' && symbol<='z' || symbol >='A' && symbol<='Z' )
                n++;
            symbol = text.read();
        }
        System.out.println(n);
        text.close();
    }
}
