package com.javarush.test.level18.lesson05.task03;

/* Разделение файла
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать бОльшую часть.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream inputStream = new FileInputStream(reader.readLine());
        FileOutputStream outputStream1 = new FileOutputStream(reader.readLine());
        FileOutputStream outputStream2 = new FileOutputStream(reader.readLine());
        reader.close();

        byte[] buffer = new byte[inputStream.available()];
        while (inputStream.available() > 0) //пока остались непрочитанные байты
        {
            int count = inputStream.read(buffer);
            int count1;
            if(count%2==0)
                count1=count/2;
            else count1=count/2+1;
            outputStream1.write(buffer, 0, count1);
            outputStream2.write(buffer, count1, count-count1);//записать блок(часть блока) во второй поток
        }
        inputStream.close();
        outputStream1.close();// закрываем поток
        outputStream2.close();// закрываем поток

    }
}
