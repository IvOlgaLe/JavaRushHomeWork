package com.javarush.test.level28.lesson06.home01;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Ольга on 08.08.2016.
 */
public class MyThread extends Thread
{
    static AtomicInteger priorityNumber = new AtomicInteger(0);
    public void setPr(){

        int i=priorityNumber.incrementAndGet();
        if(i==10) priorityNumber.set(0);
            if (i<getThreadGroup().getMaxPriority())
            this.setPriority(i);
            else this.setPriority(getThreadGroup().getMaxPriority());
    }

    public MyThread()
    {
        this.setPr();
    }

    public MyThread(Runnable target)
    {
        super(target);
        this.setPr();
    }

    public MyThread(ThreadGroup group, Runnable target)
    {
        super(group, target);
        this.setPr();
    }

    public MyThread(String name)
    {
        super(name);
        this.setPr();
    }

    public MyThread(ThreadGroup group, String name)
    {
        super(group, name);
        this.setPr();
    }

    public MyThread(Runnable target, String name)
    {
        super(target, name);
        this.setPr();
    }

    public MyThread(ThreadGroup group, Runnable target, String name)
    {
        super(group, target, name);
        this.setPr();
    }

    public MyThread(ThreadGroup group, Runnable target, String name, long stackSize)
    {
        super(group, target, name, stackSize);
        this.setPr();
    }
}
