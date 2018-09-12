package com.javarush.test.level18.lesson10.home10;

/* Собираем файл
Собираем файл из кусочков
Считывать с консоли имена файлов
Каждый файл имеет имя: [someName].partN. Например, Lion.avi.part1, Lion.avi.part2, ..., Lion.avi.part37.
Имена файлов подаются в произвольном порядке. Ввод заканчивается словом "end"
В папке, где находятся все прочтенные файлы, создать файл без приставки [.partN]. Например, Lion.avi
В него переписать все байты из файлов-частей используя буфер.
Файлы переписывать в строгой последовательности, сначала первую часть, потом вторую, ..., в конце - последнюю.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true)
        {
            String fn = reader.readLine();
            if (fn.equals("end"))
                break;
            list.add(fn);
        }
        reader.close();

        for (int i = 0; i < list.size(); i++)
        {
            for (int j = 0; j < list.size() - i - 1; j++)
            {
                int indj = Integer.parseInt(list.get(j).substring(list.get(j).lastIndexOf("t") + 1, list.get(j).length()));
                int indj1 = Integer.parseInt(list.get(j + 1).substring(list.get(j + 1).lastIndexOf("t") + 1, list.get(j + 1).length()));
                if (indj > indj1)
                {
                    String t = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, t);
                }
            }
        }

        String filePath = list.get(0).substring(0, list.get(0).lastIndexOf("."));
        BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
        BufferedReader read;
        for (String n : list)
        {
            read = new BufferedReader(new FileReader(n));
            while (read.ready())
                writer.write(read.readLine());
            read.close();
        }
        writer.close();
    }
}
