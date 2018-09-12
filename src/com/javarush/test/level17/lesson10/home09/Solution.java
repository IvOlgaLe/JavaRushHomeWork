package com.javarush.test.level17.lesson10.home09;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Транзакционность
Сделать метод joinData транзакционным, т.е. если произошел сбой, то данные не должны быть изменены.
1. Считать с консоли 2 имени файла
2. Считать построчно данные из файлов. Из первого файла - в allLines, из второго - в forRemoveLines
В методе joinData:
3. Если список allLines содержит все строки из forRemoveLines, то удалить из списка allLines все строки, которые есть в forRemoveLines
4. Если список allLines НЕ содержит каких-либо строк, которые есть в forRemoveLines, то
4.1. очистить allLines от данных
4.2. выбросить исключение CorruptedDataException
Метод joinData должен вызываться в main. Все исключения обработайте в методе main.
*/

public class Solution
{
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        reader.close();

        try
        {
            BufferedReader text1 = new BufferedReader(new FileReader(fileName1));
            while (text1.ready())
            {
                String str = text1.readLine();
                allLines.add(str);
            }
            text1.close();

            BufferedReader text2 = new BufferedReader(new FileReader(fileName2));
            while (text2.ready())
            {
                String str = text2.readLine();
                forRemoveLines.add(str);
            }
            text2.close();

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        try
        {
        new Solution().joinData();
        }
        catch (CorruptedDataException e)
        {
            e.printStackTrace();
        }

    }

    public void joinData() throws CorruptedDataException
    {
        boolean flag=false;
        for (String x:forRemoveLines)
        {
            if(allLines.contains(x))
                allLines.remove(x);
            else
            {
               flag=true;
            }
        }
        if(flag)
        {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
