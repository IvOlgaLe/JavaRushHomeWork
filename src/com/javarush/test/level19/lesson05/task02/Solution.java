package com.javarush.test.level19.lesson05.task02;

/* Считаем слово
Считать с консоли имя файла.
Файл содержит слова, разделенные знаками препинания.
Вывести в консоль количество слов "world", которые встречаются в файле.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        ArrayList<String> list = new ArrayList<String>();
        int count=0;
        String str="";

        BufferedReader strok = new BufferedReader(new FileReader(fileName));
        while (strok.ready())
        {
            char c = (char) strok.read();
            if (((c >= 'a')&&(c <= 'z')) || ((c >= 'A')&&(c <= 'Z')))
            str=str+c;
            else
            {list.add(str);
            str="";}
        }
        strok.close();

        for(String x: list)
    {
        if(x.equals("world"))
            count++;
    }
        System.out.println(count);
    }
}
