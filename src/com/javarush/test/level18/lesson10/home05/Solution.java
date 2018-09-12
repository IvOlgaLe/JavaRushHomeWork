package com.javarush.test.level18.lesson10.home05;

/* Округление чисел
Считать с консоли 2 имени файла
Первый файл содержит вещественные(дробные) числа, разделенные пробелом. Например, 3.1415
Округлить числа до целых и записать через пробел во второй файл
Закрыть потоки. Не использовать try-with-resources
Принцип округления:
3.49 - 3
3.50 - 4
3.51 - 4
-3.49 - -3
-3.50 - -3
-3.51 - -4
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename1 = reader.readLine();
        String filename2 = reader.readLine();
        reader.close();
        Writer outStream = new FileWriter(filename2);

        try
        {
            BufferedReader text = new BufferedReader(new FileReader(filename1));
            String stroka = "";
            String stroka2 = "";
            while (text.ready())
            {
                String str = text.readLine();
                stroka = stroka + str +" ";
            }
            String[] arr = stroka.split(" ");
            for (int i = 0; i < arr.length; i++)
            {
                stroka2 = stroka2+String.format(Math.round(Double.parseDouble(arr[i])) + " ");
            }
            text.close();
            outStream.write(stroka2);
            outStream.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
