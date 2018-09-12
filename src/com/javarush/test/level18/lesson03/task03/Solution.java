package com.javarush.test.level18.lesson03.task03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* Самые частые байты
Ввести с консоли имя файла
Найти байт или байты с максимальным количеством повторов
Вывести их на экран через пробел
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        FileInputStream inputStream = new FileInputStream(s);

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        while (inputStream.available() > 0) //пока остались непрочитанные байты
        {
          int data = inputStream.read(); //прочитать очередной байт
            list.add(data);
        }

        for(int i=0;i<list.size();i++)
        {
            int count=0;
            for(int j=0;j<list.size();j++)
            {
                if(list.get(i)==list.get(j))
                    count++;}
            map.put(list.get(i),count);
        }

        int max=0;
        for (Map.Entry<Integer, Integer> pair : map.entrySet())
        {
            if(pair.getValue()>max)
                max=pair.getValue();
        }

        for (Map.Entry<Integer, Integer> pair : map.entrySet())
        {
            if(pair.getValue()==max)
                list2.add(pair.getKey()) ;
        }

        for (int x:list2)
        {
            System.out.println(x+" ");
        }

        inputStream.close(); // закрываем поток
    }
}
