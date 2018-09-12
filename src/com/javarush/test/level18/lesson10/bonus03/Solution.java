package com.javarush.test.level18.lesson10.bonus03;

/* Прайсы 2
CrUD для таблицы внутри файла
Считать с консоли имя файла для операций CrUD
Программа запускается с одним из следующих наборов параметров:
-u id productName price quantity
-d id
Значения параметров:
где id - 8 символов
productName - название товара, 30 chars (60 bytes)
price - цена, 8 символов
quantity - количество, 4 символа
-u  - обновляет данные товара с заданным id
-d  - производит физическое удаление товара с заданным id (все данные, которые относятся к переданному id)

В файле данные хранятся в следующей последовательности (без разделяющих пробелов):
id productName price quantity
Данные дополнены пробелами до их длины

Пример:
19846   Шорты пляжные синие           159.00  12
198478  Шорты пляжные черные с рисунко173.00  17
19847983Куртка для сноубордистов, разм10173.991234
*/

import java.io.*;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static String fileName="";
    public static TreeMap<String,String> map=new TreeMap<>();

    public static void main(String[] args) throws IOException
    {
        //args = new String[] {"-u", "2134567", "asdaskjфыдфлдыдфлыо", "121", "12"};
        //args = new String[] {"-d", "1234567 "};

        if(!(args[0]=="-u"&&args.length==5 || args[0]=="-d"&&args.length==2))
        {System.out.println("Invalid param"); return;}

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        fileName = reader.readLine();
        reader.close();

        String id = padRight(args[1], 8);

        switch (args[0])
        {
            case "-u":
                update(id, args);
                break;
            case "-d":
                delete(id);
                break;
        }
    }

    public static void update(String id, String[] args) throws IOException
        {
            String productName = padRight(args[2], 30);
            String price = padRight(args[3], 8);
            String quantity = padRight(args[4], 4);
            String line=productName+price+quantity;

            ReadFile();

            for (Map.Entry<String, String> pair : map.entrySet())
            { if(pair.getKey().equals(id))
                    map.put(id,line);
            }

            WriteFile();
        }

    public static void delete(String id) throws IOException
    {
        ReadFile();

        try{
            map.remove(id);
        }
        catch (Exception n)
        {System.out.println("Not found ID");}

        WriteFile();
    }

    private static void ReadFile() throws IOException
    {
        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
        while (fileReader.ready())
        {
            String stroka=fileReader.readLine();
            System.out.println(stroka);
            if(stroka.length()>1)
            {String idf=stroka.substring(0,8);
            String product=stroka.substring(8);
            map.put(idf, product);}
        }
        fileReader.close();
    }

    private static void WriteFile() throws IOException
    {
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileName));
        for (Map.Entry<String, String> pair : map.entrySet())
        {
            fileWriter.write(pair.getKey()+pair.getValue());
            fileWriter.newLine();
        }
        fileWriter.close();
    }

    private static String padRight(String param, int tlength) {
        if (param.length() < tlength) {
            return String.format("%1$-" + tlength + "s", param);
        } else {
            return param.substring(0, tlength);
        }
    }
}
