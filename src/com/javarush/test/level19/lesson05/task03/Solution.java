package com.javarush.test.level19.lesson05.task03;

/* Выделяем числа
Считать с консоли 2 имени файла.
Вывести во второй файл все числа, которые есть в первом файле.
Числа выводить через пробел.
Закрыть потоки. Не использовать try-with-resources

Пример тела файла:
12 text var2 14 8v 1

Результат:
12 14 1
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        reader.close();

        String str="";

        FileInputStream inputStream = new FileInputStream(fileName1);
        Writer outStream = new FileWriter(fileName2);
        int cs=0;

        while (inputStream.available() > 0)
        {
            char c = (char) inputStream.read();
            if(((c >= '0')&&(c <= '9')))
            {str=str+c; cs=0;}

            else
            {
                cs++;
                if (cs == 1)
                {
                    outStream.write(str + " ");
                    str = "";
                }
            }
            }

        outStream.flush();
        outStream.close();
        inputStream.close();
    }
}
