package com.javarush.test.level16.lesson03.task03;

import java.util.ArrayList;
import java.util.List;

/* Список и нити
В методе main добавить в статический объект list 5 нитей SpecialThread - различных объектов.
*/

public class Solution {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {
        SpecialThread spthread1=new SpecialThread();
        Thread thread1=new Thread(spthread1);
        list.add(thread1);

        SpecialThread spthread2=new SpecialThread();
        Thread thread2=new Thread(spthread2);
        list.add(thread2);

        SpecialThread spthread3=new SpecialThread();
        Thread thread3=new Thread(spthread3);
        list.add(thread3);

        SpecialThread spthread4=new SpecialThread();
        Thread thread4=new Thread(spthread4);
        list.add(thread4);

        SpecialThread spthread5=new SpecialThread();
        Thread thread5=new Thread(spthread5);
        list.add(thread5);
        //Add your code here - добавьте свой код тут
    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's run method inside SpecialThread");
        }
    }
}
