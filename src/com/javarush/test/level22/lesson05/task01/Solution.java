package com.javarush.test.level22.lesson05.task01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Найти подстроку
Метод getPartOfString должен возвращать подстроку начиная с символа после 1-го пробела и до конца слова,
которое следует после 4-го пробела.
Пример: "JavaRush - лучший сервис обучения Java."
Результат: "- лучший сервис обучения"
На некорректные данные бросить исключение TooShortStringException (сделать исключением).
Сигнатуру метода getPartOfString не менять.
Метод main не участвует в тестировании.
*/
public class Solution
{
    public static String getPartOfString(String string) throws TooShortStringException
    {
        if (string == null) throw new TooShortStringException();
        String pstring = "";
        int n = string.indexOf(" ") + 1;
        if (n == 0) throw new TooShortStringException();
        int m = 0, count = 0;
        for (int i = 0; i < string.length(); i++)
        {
            if (string.charAt(i) == ' ')
                count++;
            if (count == 4)
            {
                m = i+1;
                if(m>string.length()) throw new TooShortStringException();
                break;
            }
        }
        if (count < 4) throw new TooShortStringException();
        for (int j = m; j < string.length(); j++)
        {
            if (!Character.isAlphabetic(string.charAt(j)))
            {
                m = j;
                break;
            }
        }
        pstring = string.substring(n, m);
        return pstring;
    }

    public static class TooShortStringException extends Exception
    {
    }

    public static void main(String[] args) throws IOException, TooShortStringException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        {
            String stroka = reader.readLine();
            String podstroka = getPartOfString(stroka);
            System.out.println(podstroka);
        }
    }
}
