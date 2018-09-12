package com.javarush.test.level19.lesson03.task04;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/* И еще один адаптер
Адаптировать Scanner к PersonScanner.
Классом-адаптером является PersonScannerAdapter.
Данные в файле хранятся в следующем виде:
Иванов Иван Иванович 31 12 1950

В файле хранится большое количество людей, данные одного человека находятся в одной строке. Метод read() должен читать данные одного человека.
*/

public class Solution {
    public static class PersonScannerAdapter implements PersonScanner{

        Scanner obj;
        PersonScannerAdapter(Scanner obj)
        {
            this.obj=obj;
        }

        @Override
        public Person read() throws IOException
        {
            String[] list = obj.nextLine().split(" ");
            Calendar date = new GregorianCalendar(Integer.parseInt(list[5]),Integer.parseInt(list[4]) - 1, Integer.parseInt(list[3]));
            Person person = new Person(list[1], list[2], list[0], date.getTime());
            return person;
        }

        @Override
        public void close() throws IOException
        {
            this.obj.close();
        }
    }
}
