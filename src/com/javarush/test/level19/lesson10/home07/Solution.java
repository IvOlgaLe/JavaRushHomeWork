package com.javarush.test.level19.lesson10.home07;

/* Длинные слова
В метод main первым параметром приходит имя файла1, вторым - файла2
Файл1 содержит слова, разделенные пробелом.
Записать через запятую в Файл2 слова, длина которых строго больше 6
Закрыть потоки. Не использовать try-with-resources

Пример выходных данных:
длинное,короткое,аббревиатура
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        FileInputStream f = new FileInputStream(args[0]);
        BufferedReader r = new BufferedReader(new InputStreamReader(f));
        Writer w = new FileWriter(args[1]);
        ArrayList<String> list=new ArrayList<>();

        while (r.ready())
        {
            String str = r.readLine();
            String[] slovo=str.split(" ");
            for(String x: slovo)
            {
                if(x.length()>6)
                    list.add(x);
            }
        }

        for(int i=0;i<list.size()-1;i++)
        {w.write(list.get(i) + ",");}
        w.write(list.get(list.size()-1));

        f.close();
        r.close();
        w.close();
    }
}
