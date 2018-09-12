package com.javarush.test.level14.lesson08.bonus01;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;
import java.util.NoSuchElementException;

/* Нашествие эксепшенов
Заполни массив exceptions 10 различными эксепшенами.
Первое исключение уже реализовано в методе initExceptions.
*/

public class Solution
{
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) throws Exception
    {
        initExceptions();

        for (Exception exception : exceptions)
        {
            System.out.println(exception);
        }
    }

    private static void initExceptions()
    {   //it's first exception
        try
        {
            float i = 1 / 0;

        } catch (Exception e)
        {
            exceptions.add(e);
        }

        try
        {
            throw new EmptyStackException();

        } catch (EmptyStackException e)
        {
            exceptions.add(e);
        }

        int[] nNulArray = new int[5];
        nNulArray = null;
        try
        {
            int i = nNulArray.length;

        } catch (NullPointerException e)
        {
            exceptions.add(e);
        }

        FileInputStream fis = null;
        try
        {
            fis = new FileInputStream("C:\try.txt");

            } catch (FileNotFoundException  e)
        {
            exceptions.add(e);
        }

        Object szStr[] = new String[10];
        try
        {
            szStr[0] = new Character('*');

        } catch (ArrayStoreException e)
        {
            exceptions.add(e);
        }

        try
        {
            throw new IllegalStateException();

        } catch (IllegalStateException e)
        {
            exceptions.add(e);
        }

        String szShortString = "12345";
        try
        {
            char chr = szShortString.charAt(10);

        } catch (StringIndexOutOfBoundsException e)
        {
            exceptions.add(e);
        }

        try
        {
            int[] m = {-1,0,1};
            System.out.println(m[3]);

        } catch (ArrayIndexOutOfBoundsException e)
        {
            exceptions.add(e);
        }

        Object ch = new Character('*');
        try
        {
            System.out.println((Byte)ch);

        } catch (ClassCastException e)
        {
            exceptions.add(e);
        }

        try
        {
            int[] nNegArray = new int[-5];

        } catch (NegativeArraySizeException e)
        {
            exceptions.add(e);
        }
        //Add your code here

    }
}
