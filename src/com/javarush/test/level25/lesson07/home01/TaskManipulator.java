package com.javarush.test.level25.lesson07.home01;

public class TaskManipulator implements Runnable, CustomThreadManipulator {
    Thread thread;
    String threadName;

    @Override
    public void run() {
        try
            {
                Thread.sleep(0);
                while (!thread.isInterrupted())
            {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(90);     //87 у меня работает
            }
            }
            catch (InterruptedException e)
            {
            }
        }

    @Override
    public void start(String threadName)
    {
        this.threadName=threadName;
        thread=new Thread(this);
        thread.setName(threadName);
        thread.start();
    }

    @Override
    public void stop()
    {
        thread.interrupt();
    }
}
