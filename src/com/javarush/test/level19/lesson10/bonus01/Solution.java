package com.javarush.test.level19.lesson10.bonus01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Отслеживаем изменения
Считать в консоли 2 имени файла - file1, file2.
Файлы содержат строки, file2 является обновленной версией file1, часть строк совпадают.
Нужно создать объединенную версию строк, записать их в список lines
Операции ADDED и REMOVED не могут идти подряд, они всегда разделены SAME
Пример:
оригинальный   редактированный    общий
file1:         file2:             результат:(lines)

строка1        строка1            SAME строка1
строка2                           REMOVED строка2
строка3        строка3            SAME строка3
строка4                           REMOVED строка4
строка5        строка5            SAME строка5
строка0                           ADDED строка0
строка1        строка1            SAME строка1
строка2                           REMOVED строка2
строка3        строка3            SAME строка3
строка5                           ADDED строка5
строка4        строка4            SAME строка4
строка5                           REMOVED строка5
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<>();
    public static List<String> linesf1 = new ArrayList<>();
    public static List<String> linesf2 = new ArrayList<>();

    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        reader.close();

        BufferedReader file1 = new BufferedReader(new FileReader(fileName1));
        while (file1.ready())
        {
            String str = file1.readLine();
            linesf1.add(str);
        }
        file1.close();

        BufferedReader file2 = new BufferedReader(new FileReader(fileName2));
        while (file2.ready())
        {
            String str = file2.readLine();
            linesf2.add(str);
        }
        file2.close();

        while(linesf1.size()<linesf2.size())
            linesf1.add("0");
        while(linesf1.size()>linesf2.size())
            linesf2.add("0");

        int count=0;

            for (int i = 0; i < linesf1.size(); i++)
            {
                try
                {
                if (linesf1.get(i).equals(linesf2.get(i + count)))
                    lines.add(new LineItem(Type.SAME, linesf1.get(i)));
                else
                {
                    count++;
                    if (linesf1.get(i).equals(linesf2.get(i + count)))
                    {lines.add(new LineItem(Type.ADDED, linesf2.get(i+count-1)));
                        lines.add(new LineItem(Type.SAME, linesf1.get(i)));}
                    else
                    {
                        count = count - 2;
                        lines.add(new LineItem(Type.REMOVED, linesf1.get(i)));
                    }
                }
            }
                catch (Exception e)
                {
                    if (linesf1.get(i-1).equals(linesf2.get(linesf2.size()-2)))
                    lines.add(new LineItem(Type.ADDED, linesf2.get(linesf2.size()-1)));
                }
        }


      //  for(LineItem x:lines)
       //     System.out.println(x.type.toString()+" "+x.line);
    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
