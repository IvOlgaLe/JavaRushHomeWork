package com.javarush.test.level18.lesson03.task05;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;




/* Сортировка байт
Ввести с консоли имя файла
Считать все байты из файла.
Не учитывая повторений - отсортировать их по байт-коду в возрастающем порядке.
Вывести на экран
Закрыть поток ввода-вывода

Пример байт входного файла
44 83 44

Пример вывода
44 83
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        FileInputStream inputStream = new FileInputStream(s);

        ArrayList<Integer> list = new ArrayList<Integer>();

        while (inputStream.available() > 0) //пока остались непрочитанные байты
        {
            int data = inputStream.read(); //прочитать очередной байт
            list.add(data);
        }

        ArrayList<Integer> list2 = new ArrayList<Integer>(new HashSet<Integer>(list));

            for (int i = 0; i < list2.size(); i++) {
                for (int j = 0; j < list2.size() - i - 1; j++) {
                    if (list2.get(j) > list2.get(j + 1)) {
                        int t = list2.get(j);
                        list2.set(j,list2.get(j + 1));
                        list2.set(j+1, t);
                    }
                }
            }

        for (int x:list2)
        {
            System.out.print(x+" ");
        }

        inputStream.close();
    }
}
