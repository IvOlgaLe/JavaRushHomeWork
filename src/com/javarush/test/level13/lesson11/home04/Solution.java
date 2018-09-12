package com.javarush.test.level13.lesson11.home04;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой стороки.
*/

import java.io.*;
import java.sql.Array;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s = reader.readLine();
        Writer outStream = new FileWriter(s);

        while (true)
        {
            String str = reader.readLine();
            outStream.write(str);
            outStream.write(System.getProperty("line.separator"));
            if (str.equals("exit")) break;
        }
        outStream.flush();
        outStream.close();

    }
}
