package com.javarush.test.level26.lesson02.task03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;

/* Убежденному убеждать других не трудно.
В таблице есть колонки, по которым можно сортировать.
Пользователь имеет возможность настроить под себя список колонок, которые будут сортироваться.
Напишите public static компаратор CustomizedComparator, который будет:
1. в конструкторе принимать список компараторов
2. сортировать данные в порядке, соответствующем последовательности компараторов.
Все переданные компараторы сортируют дженерик тип Т
В конструктор передается как минимум один компаратор
*/
public class Solution {
    public  static class CustomizedComparator<T> implements Comparator<T>{
        ArrayList<Comparator<T>> comp=new ArrayList<Comparator<T>>();
        public CustomizedComparator(Comparator<T>... comparators)
        {
            for (Comparator<T> c: comparators)
                comp.add(c);
        }

        @Override
        public int compare(T o1, T o2)
        {
            int result=0;
            for (int i = 0; i < comp.size(); i++)
            {
                result=comp.get(i).compare(o1,o2);
                if(result!=0) break;
            }
            return result;
        }
    }
}
