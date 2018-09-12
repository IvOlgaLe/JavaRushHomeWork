package com.javarush.test.level19.lesson10.home08;

/* Перевертыши
1 Считать с консоли имя файла.
2 Для каждой строки в файле:
2.1 переставить все символы в обратном порядке
2.2 вывести на экран
3 Закрыть потоки. Не использовать try-with-resources

Пример тела входного файла:
я - программист.
Амиго

Пример результата:
.тсиммаргорп - я
огимА
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        reader.close();

        FileInputStream f = new FileInputStream(s);
        BufferedReader r = new BufferedReader(new InputStreamReader(f));

        ArrayList<String> list=new ArrayList<>();
        ArrayList<String> list1=new ArrayList<>();

        while (r.ready())
        {
            String str = r.readLine();
            list.add(str);
        }

        for(String x:list)
        {
            String str1="";
            for(int i=x.length()-1; i>=0; i--)
            {
                str1=str1+x.charAt(i);
            }
            list1.add(str1);
        }

        for(String v:list1)
        {
            System.out.println(v);
        }
        f.close();
        r.close();
    }
}
