package com.javarush.test.level03.lesson06.task01;

/* Мама мыла раму
Вывести на экран все возможные комбинации слов «Мама», «Мыла», «Раму».
Подсказка: их 6 штук. Каждую комбинацию вывести с новой строки. Слова не разделять. Пример:
МылаРамуМама
РамуМамаМыла
...
*/

public class Solution
{
    public static void main(String[] args)
    {
        System.out.println ("Мама"+"Мыла"+"Раму");
        System.out.println ("Мыла"+"Раму"+"Мама");        //напишите тут ваш код
        System.out.println ("Раму"+"Мама"+"Мыла");
        System.out.println ("Мама"+"Раму"+"Мыла");
        System.out.println ("Мыла"+"Мама"+"Раму");        //напишите тут ваш код
        System.out.println ("Раму"+"Мыла"+"Мама");

    }
}