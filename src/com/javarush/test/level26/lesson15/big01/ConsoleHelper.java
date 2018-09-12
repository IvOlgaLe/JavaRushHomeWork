package com.javarush.test.level26.lesson15.big01;

import com.javarush.test.level26.lesson15.big01.exception.InterruptOperationException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Ольга on 04.08.2016.
 */
public class ConsoleHelper
{
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void writeMessage(String message){
        System.out.println(message);
    }
    public static  String readString() throws InterruptOperationException
    {
        String string = "";
        try {
            string = bufferedReader.readLine();
            if(string.equalsIgnoreCase("EXIT"))
                 throw new InterruptOperationException();}
        catch (IOException e) {}
        return string;
    }
    public static String askCurrencyCode() throws InterruptOperationException
    {
        writeMessage("Введите код валюты(3 символа):");
        String currencyCod=readString();
        while (currencyCod.length() != 3)
        {
            writeMessage("Некорректный код валюты. Введите код валюты(3 символа):");
            currencyCod=readString();
        }
            return currencyCod.toUpperCase();
    }

    public static String[] getValidTwoDigits(String currencyCode) throws InterruptOperationException
    {
        writeMessage("Введите номинал и количество банкнот(два числа через пробел):");
        String nom_count = "";
        String[] nc = nom_count.split(" ");
        while (true)
        {
            try
            {
                nom_count = readString();
                nc = nom_count.split(" ");
                int nom = Integer.parseInt(nc[0]);
                int count = Integer.parseInt(nc[1]);

                if (nc.length != 2 || nom <= 0 || count <= 0)
                {
                    writeMessage("Некорректный ввод. Введите номинал и количество банкнот(два числа через пробел):");
                    continue;
                } else break;
            }
            catch (Exception e)
            {
                writeMessage("Некорректный ввод. Введите номинал и количество банкнот(два числа через пробел):");
                continue;
            }
        }
        return nc;
    }

    public  static Operation askOperation() throws InterruptOperationException
    {
        writeMessage("Введите номер операции 1 - INFO, 2 - DEPOSIT, 3 - WITHDRAW, 4 - EXIT:");
        while (true)
        {
            try
            {
                String number = readString();
                int n = Integer.parseInt(number);
                Operation chOperation = Operation.getAllowableOperationByOrdinal(n);
                return chOperation;
            }
            catch (IllegalArgumentException e)
            {
                writeMessage("Некорректный ввод. Введите номер операции 1 - INFO, 2 - DEPOSIT, 3 - WITHDRAW, 4 - EXIT:");
                continue;
            }
        }
    }
}
