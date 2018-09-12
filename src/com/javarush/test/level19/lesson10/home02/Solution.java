package com.javarush.test.level19.lesson10.home02;

/* Самый богатый
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя значение
где [имя] - String, [значение] - double. [имя] и [значение] разделены пробелом

Для каждого имени посчитать сумму всех его значений
Вывести в консоль имена, у которых максимальная сумма
Имена разделять пробелом либо выводить с новой строки
Закрыть потоки. Не использовать try-with-resources

Пример входного файла:
Петров 0.501
Иванов 1.35
Петров 0.85

Пример вывода:
Петров
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        Map<String, Double> map=new TreeMap();
        ArrayList<Double> list=new ArrayList<>();

        FileInputStream reader =  new FileInputStream(args[0]);
        BufferedReader r = new BufferedReader(new InputStreamReader(reader));

        while (r.ready())
        {
            String str = r.readLine();
            String[] n=str.split(" ");
            if(map.containsKey(n[0]))
                map.put(n[0], map.get(n[0]) + Double.parseDouble(n[1]));
            else
            {
                map.put(n[0], Double.parseDouble(n[1]));
            }
        }
        reader.close();
        r.close();

        for (String key : map.keySet())
            {list.add(map.get(key));}

        double max=0;
        for(double v: list)
        {
            if(v>max)
                max=v;
        }

        for (String key : map.keySet()) {
            if(max==map.get(key))
                System.out.println(key);
        }
    }
}
