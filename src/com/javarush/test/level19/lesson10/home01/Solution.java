package com.javarush.test.level19.lesson10.home01;

/* Считаем зарплаты
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя значение
где [имя] - String, [значение] - double. [имя] и [значение] разделены пробелом

Для каждого имени посчитать сумму всех его значений
Все данные вывести в консоль, предварительно отсортировав в возрастающем порядке по имени
Закрыть потоки. Не использовать try-with-resources

Пример входного файла:
Петров 2
Сидоров 6
Иванов 1.35
Петров 3.1

Пример вывода:
Иванов 1.35
Петров 5.1
Сидоров 6.0
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
            Map<String, Double> map=new TreeMap();

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

        for (String key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }
    }
}
