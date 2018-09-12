package com.javarush.test.level14.lesson08.bonus03;

/**
 * Created by Ольга on 07.04.2016.
 */
public class Singleton
{
    static Singleton single=null;
    private Singleton(){}
    static Singleton getInstance(){
        if(single==null)
        {single= new Singleton();}
        return single;
    }
}
