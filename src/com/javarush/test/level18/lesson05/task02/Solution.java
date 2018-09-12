package com.javarush.test.level18.lesson05.task02;

/* Подсчет запятых
С консоли считать имя файла
Посчитать в файле количество символов ',', количество вывести на консоль
Закрыть потоки. Не использовать try-with-resources

Подсказка: нужно сравнивать с ascii-кодом символа ','
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        BufferedReader bufferedReader = new BufferedReader(new FileReader(s));

        int zap=(int)',';
        int n=0;
        int symbol =  bufferedReader.read();
        while (symbol != -1)
        {  // Когда дойдём до конца файла, получим '-1'
            if (symbol == zap)
                n++;// Что-то делаем с прочитанным символом
            symbol = bufferedReader.read();
        }
        System.out.println(n);
        reader.close();
        bufferedReader.close();
    }
}
