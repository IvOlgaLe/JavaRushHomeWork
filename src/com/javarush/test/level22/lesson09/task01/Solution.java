package com.javarush.test.level22.lesson09.task01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/* Обращенные слова
В методе main с консоли считать имя файла, который содержит слова, разделенные пробелами.
Найти в тексте все пары слов, которые являются обращением друг друга. Добавить их в result.
Порядок слов first/second не влияет на тестирование.
Использовать StringBuilder.
Пример содержимого файла
рот тор торт о
о тот тот тот
Вывод:
рот тор
о о
тот тот
*/
public class Solution {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> slova=new ArrayList<String>();
        BufferedReader read = new BufferedReader(new FileReader(reader.readLine()));
        while(read.ready()){
            slova.addAll(Arrays.asList((read.readLine().split(" "))));
        }
        reader.close();
        read.close();

        for (int i=0; i<slova.size(); i++)
        {
            for (int j=i+1; j<slova.size(); j++)
            {
                StringBuilder s = new StringBuilder(slova.get(j));
                String rev = s.reverse().toString();
                if (slova.get(i).equals(rev))
                {
                    Pair pair = new Pair();
                    pair.first = slova.get(i);
                    pair.second = slova.get(j);
                    result.add(pair);
                    System.out.println(pair.first+" "+pair.second);
                    slova.remove(j);
                    slova.remove(i);
                    i--;
                    break;
                }
            }
        }
    }

    public static class Pair {
        String first;
        String second;

        @Override
        public String toString() {
            return  first == null && second == null ? "" :
                    first == null && second != null ? second :
                    second == null && first != null ? first :
                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }

}
