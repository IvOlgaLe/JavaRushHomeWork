package com.javarush.test.level19.lesson10.home05;

/* Слова с цифрами
В метод main первым параметром приходит имя файла1, вторым - файла2.
Файл1 содержит строки со слов, разделенные пробелом.
Записать через пробел в Файл2 все слова, которые содержат цифры, например, а1 или abc3d
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        FileInputStream f =  new FileInputStream(args[0]);
        BufferedReader r = new BufferedReader(new InputStreamReader(f));
        Writer w = new FileWriter(args[1]);

        while (r.ready())
        {
            int count=0;
            String str = r.readLine();
            String[] n=str.split(" ");
                for(int i=0; i<n.length;i++)
                {
                    for (int j = 0; j < n[i].length(); j++)
                    {
                        if (Character.isDigit(n[i].charAt(j)))
                        {
                            w.write(n[i] + " "); break;
                        }
                    }
                }
            }

        f.close();
        r.close();
        w.close();
    }
}
