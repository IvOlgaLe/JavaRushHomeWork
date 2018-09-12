package com.javarush.test.level18.lesson10.home08;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* Нити и байты
Читайте с консоли имена файлов, пока не будет введено слово "exit"
Передайте имя файла в нить ReadThread
Нить ReadThread должна найти байт, который встречается в файле максимальное число раз, и добавить его в словарь resultMap,
где параметр String - это имя файла, параметр Integer - это искомый байт.
Закрыть потоки. Не использовать try-with-resources
*/

public class Solution
{
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = "";
        while (!((fileName = reader.readLine()).equals("exit")))
        {
            Thread thread = new ReadThread(fileName);
            thread.start();
        }
        reader.close();
    }

    public static class ReadThread extends Thread
    {
        //implement constructor body
        String fileName;

        public ReadThread(String fileName)
        {
            this.fileName = fileName;
        }

        // implement file reading here - реализуйте чтение из файла тут
        public void run()
        {
            FileInputStream inputStream = null;
            try
            {
                inputStream = new FileInputStream(fileName);
                Map<Integer, Integer> map = new HashMap<Integer, Integer>();

                while (inputStream.available()>0)
                {
                    int key = inputStream.read();
                    if (map.containsKey(key))
                    {
                        int count = map.get(key);
                        map.put(key, count+1);
                    }
                    else map.put(key, 1);
                }

                int max_key = 0;
                int max_value = 0;
                for (Map.Entry<Integer, Integer> pair : map.entrySet())
                {
                    if (pair.getValue()>max_value)
                    {
                        max_key=pair.getKey();
                        max_value=pair.getValue();
                    }
                }

                resultMap.put(fileName, max_key);
                inputStream.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }
}





