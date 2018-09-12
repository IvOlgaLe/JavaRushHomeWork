package com.javarush.test.level22.lesson13.task01;

import java.util.ArrayList;
import java.util.StringTokenizer;

/* StringTokenizer
Используя StringTokenizer разделить query на части по разделителю delimiter.
Пример,
getTokens("level22.lesson13.task01", ".") == {"level22", "lesson13", "task01"}
*/
public class Solution {
    public static String [] getTokens(String query, String delimiter) {
        ArrayList<String> list=new ArrayList();
        StringTokenizer tokenizer =
                new StringTokenizer(query,delimiter);
        while (tokenizer.hasMoreTokens())
        {
            String token = tokenizer.nextToken();
            list.add(token);
        }
        String[] stockArr = new String[list.size()];
        stockArr = list.toArray(stockArr);
        return stockArr;
    }

  /*  public static void main(String args[])
    {
        String [] list2=getTokens("level22.lesson13.task01", ".");
        System.out.println(list2[0]+" "+list2[1]+" "+list2[2]);
    }  */
}
