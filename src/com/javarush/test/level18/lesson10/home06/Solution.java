package com.javarush.test.level18.lesson10.home06;

/* Встречаемость символов
Программа запускается с одним параметром - именем файла, который содержит английский текст.
Посчитать частоту встречания каждого символа.
Отсортировать результат по возрастанию кода ASCII (почитать в инете). Пример: ','=44, 's'=115, 't'=116
Вывести на консоль отсортированный результат:
[символ1]  частота1
[символ2]  частота2
Закрыть потоки. Не использовать try-with-resources

Пример вывода:
, 19
- 7
f 361
*/

import javax.management.ObjectName;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader text = new BufferedReader(new FileReader(args[0]));
        ArrayList<Character> list = new ArrayList<Character>();
        Map<Character, Integer> map = new HashMap<Character, Integer>();

        int symbol =  text.read();
        while (symbol != -1)
        {  // Когда дойдём до конца файла, получим '-1'
            list.add((char)symbol);
            symbol = text.read();
        }
        text.close();

        ArrayList<Character> list2 = new ArrayList<Character>(new HashSet<Character>(list));

        for(int i=0;i<list2.size();i++)
        {
            int count=0;
            for(int j=0;j<list.size();j++)
            {
                if(list2.get(i)==list.get(j))
                    count++;}
            map.put(list2.get(i),count);
        }

        Collections.sort(list2, new Comparator<Character>() {
            public int compare(Character o1, Character o2) {
                return o1.toString().compareTo(o2.toString());
            }
        });

        for(char v:list2)
        {
            System.out.println(v+" "+map.get(v));
        }
    }
}
