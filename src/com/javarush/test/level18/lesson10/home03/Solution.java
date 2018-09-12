package com.javarush.test.level18.lesson10.home03;

/* Два в одном
Считать с консоли 3 имени файла
Записать в первый файл содержимого второго файла, а потом дописать в первый файл содержимое третьего файла
Закрыть потоки. Не использовать try-with-resources
*/


import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String f1=reader.readLine();
        String f2=reader.readLine();
        String f3=reader.readLine();
        FileOutputStream file1 = new FileOutputStream(f1);
        FileInputStream file2 = new FileInputStream(f2);
        FileInputStream file3 = new FileInputStream(f3);

        while (file2.available() > 0) //пока есть еще непрочитанные байты
        {
            int data = file2.read(); // прочитать очередной байт в переменную data
            file1.write(data); // и записать его во второй поток
        }

        while (file3.available() > 0) //пока есть еще непрочитанные байты
        {
            int data = file3.read(); // прочитать очередной байт в переменную data
            file1.write(data); // и записать его во второй поток
        }

        reader.close();
        file1.close();
        file2.close();
        file3.close();
    }
}
