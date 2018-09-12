package com.javarush.test.level19.lesson10.home03;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* Хуан Хуанович
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя день месяц год
где [имя] - может состоять из нескольких слов, разделенных пробелами, и имеет тип String
[день] - int, [месяц] - int, [год] - int
данные разделены пробелами

Заполнить список PEOPLE импользуя данные из файла
Закрыть потоки. Не использовать try-with-resources

Пример входного файла:
Иванов Иван Иванович 31 12 1987
Вася 15 5 2013
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException, ParseException
    {
        ArrayList<String> list = new ArrayList<>();

        FileInputStream reader = new FileInputStream(args[0]);
        BufferedReader r = new BufferedReader(new InputStreamReader(reader));

        while (r.ready())
        {
            String str = r.readLine();
            list.add(str);
        }
        reader.close();
        r.close();

        Person person = null;
        String name = "";
        String bd = "";
        for (String x : list)
        {
            String[] data = x.split(" ");
            int dlina = data.length;
            switch (dlina)
            {
                case 4:
                    name = data[0];
                    bd = data[1] + "/" + data[2] + "/" + data[3];
                    break;
                case 5:
                    name = data[0] + " " + data[1];
                    bd = data[2] + "/" + data[3] + "/" + data[4];
                    break;
                case 6:
                    name = data[0] + " " + data[1] + " " + data[2];
                    bd = data[3] + "/" + data[4] + "/" + data[5];
                    break;
            }
            person = new Person(name, new SimpleDateFormat("dd/MM/yyyy").parse(bd));
            PEOPLE.add(person);
        }
       /* for (Person x : PEOPLE)
        {
            name = x.getName();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
            String date = simpleDateFormat.format(x.getBirthday());
            System.out.println(name +" " + date);
        } */
    }
    }
