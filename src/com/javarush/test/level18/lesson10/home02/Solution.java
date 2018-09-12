package com.javarush.test.level18.lesson10.home02;

/* Пробелы
В метод main первым параметром приходит имя файла.
Вывести на экран соотношение количества пробелов к количеству всех символов. Например, 10.45
1. Посчитать количество всех символов.
2. Посчитать количество пробелов.
3. Вывести на экран п2/п1*100, округлив до 2 знаков после запятой
4. Закрыть потоки. Не использовать try-with-resources
*/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader text = new BufferedReader(new FileReader(args[0]));
        int n=0, m=0;
        int symbol =  text.read();
        while (symbol != -1)
        {  // Когда дойдём до конца файла, получим '-1'
            m++;
            if (symbol == ' ')
                n++;
            symbol = text.read();
        }
        int n1=n*10000/m;
        System.out.println((double)n1/100);
        text.close();
    }
}
