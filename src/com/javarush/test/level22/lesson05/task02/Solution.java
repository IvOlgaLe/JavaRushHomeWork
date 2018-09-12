package com.javarush.test.level22.lesson05.task02;

/* Между табуляциями
Метод getPartOfString должен возвращать подстроку между первой и второй табуляцией.
На некорректные данные бросить исключение TooShortStringException.
Класс TooShortStringException не менять.
*/
public class Solution {
    public static String getPartOfString(String string) throws TooShortStringException
    {
        if (string == null) throw new TooShortStringException();
        String pstring = "";
        int n = string.indexOf('\t') + 1;
        int m = 0, count = 0;
        for (int i = 0; i < string.length(); i++)
        {
            if (string.charAt(i) == '\t')
                count++;
            if (count == 2)
            {
                m = i;
                break;
            }
        }
        if(count<2) throw new TooShortStringException();
        if(n==0 || m==0) throw new TooShortStringException();

        pstring = string.substring(n, m);
        return pstring;
    }

    public static class TooShortStringException extends Exception {
    }

    public static void main(String[] args) throws TooShortStringException {
        System.out.println(getPartOfString("tab0\ttab\ttab1\t"));       //tab
        System.out.println(getPartOfString("\t\t"));                    //
        System.out.println(getPartOfString("123\t123"));                //Exception
        System.out.println(getPartOfString(null));                      //Exception
    }
}
