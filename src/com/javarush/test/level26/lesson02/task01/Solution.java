package com.javarush.test.level26.lesson02.task01;

import java.util.Arrays;
import java.util.Comparator;

/* Почитать в инете про медиану выборки
Реализовать логику метода sort, который должен сортировать данные в массиве по удаленности от его медианы
Вернуть отсортированный массив от минимального расстояния до максимального
Если удаленность одинаковая у нескольких чисел, то выводить их в порядке возрастания
*/
public class Solution
{
    public static Integer[] sort(Integer[] array)
    {
        //implement logic here
       Arrays.sort(array);
        final double mediana;
        if(array.length%2!=0)
            mediana=array[array.length / 2];
        else
            mediana=(array[(array.length/2)-1]+array[(array.length/2)])/2.0;

        Comparator<Integer> comparatorByR = new Comparator<Integer>()
        {
            @Override
            public int compare(Integer o1, Integer o2)
            {
                int result =(int) ((Math.abs(o1- mediana)) - (Math.abs(o2 - mediana)));
                return result == 0 ? o1-o2 : result;
            }
        };
        Arrays.sort(array, comparatorByR);

        return array;
    }

    public static void main (String[] args) {
        Integer[] mass = new Integer[] {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(Arrays.toString(sort(mass)));
    }
}
