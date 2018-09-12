package com.javarush.test.level20.lesson02.task03;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/* Знакомство с properties
В методе fillInPropertiesMap считайте имя файла с консоли и заполните карту properties данными из файла.
Про .properties почитать тут - http://ru.wikipedia.org/wiki/.properties
Реализуйте логику записи в файл и чтения из файла для карты properties.
*/
public class Solution {
    public static Map<String, String> properties = new HashMap<>();
    public static Properties propert = new Properties();

    public void fillInPropertiesMap() throws Exception
    {
        BufferedReader fnread = new BufferedReader(new InputStreamReader(System.in));
        String filename=fnread.readLine();
        fnread.close();
        InputStream fileProperties = new FileInputStream(filename);
        load(fileProperties);   //implement this method - реализуйте этот метод
    }

    public void save(OutputStream outputStream) throws Exception {
        PrintWriter printWriter = new PrintWriter(outputStream);
        if (propert.size() > 0)
            propert.putAll(properties);
        propert.store(outputStream, "");
        printWriter.close();//implement this method - реализуйте этот метод
    }

    public void load(InputStream inputStream) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            propert.load(inputStream);
            Set<String> list = propert.stringPropertyNames();
            for (String x : list)
                properties.put(x, propert.getProperty(x));
            reader.close();
        }//implement this method - реализуйте этот метод
    }
