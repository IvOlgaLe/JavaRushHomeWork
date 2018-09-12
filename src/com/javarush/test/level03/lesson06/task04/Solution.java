package com.javarush.test.level03.lesson06.task04;

/* Экранирование символов
Про экранирование символов в Java читайте в дополнительном материале к лекции.
Вывести на экран следующий текст - две строки:

It's Windows path: "C:\Program Files\Java\jdk1.7.0\bin"
It's Java string: \"C:\\Program Files\\Java\\jdk1.7.0\\bin\"
*/

public class Solution
{
    public static void main(String[] args)
    {
       String s1="\"";
       String s2="\\";
        System.out.println("It's Windows path: "+s1+"C:"+s2+"Program Files"+s2+"Java"+s2+"jdk1.7.0"+s2+"bin"+s1);
        System.out.println("It's Java string: "+s2+s1+"C:"+s2+s2+"Program Files"+s2+s2+"Java"+s2+s2+"jdk1.7.0"+s2+s2+"bin"+s2+s1);//напишите тут ваш код
        System.out.println("It's Windows path: C:\\Program Files"+s2+"Java"+s2+"jdk1.7.0"+s2+"bin"+s1);
        System.out.println("It's Java string: \\C:\\\\Program Files"+s2+s2+"Java"+s2+s2+"jdk1.7.0"+s2+s2+"bin"+s2+s1);//напишите тут ваш код

    }
}