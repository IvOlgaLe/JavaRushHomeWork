package com.javarush.test.level17.lesson10.home02;

/* Comparable
Реализуйте интерфейс Comparable<Beach> в классе Beach, который будет использоваться нитями.
*/

import java.util.ArrayList;
import java.util.Collections;

public class Beach implements Comparable<Beach>{
    private String name;      //название
    private float distance;   //расстояние
    private int quality;    //качество

    public Beach(String name, float distance, int quality) {
        this.name = name;
        this.distance = distance;
        this.quality = quality;
    }

    public String getName() {
        return name;
    }

    public synchronized void setName(String name) {
        this.name = name;
    }

    public float getDistance() {
        return distance;
    }

    public synchronized void setDistance(float distance) {
        this.distance = distance;
    }

    public int getQuality() {
        return quality;
    }

    public synchronized void setQuality(int quality) {
        this.quality = quality;
    }

    @Override
    public synchronized int compareTo(Beach o)
    {
        if((getQuality()*200+(int)getDistance()*100+getName().length())>(o.getQuality()*200+(int)o.getDistance()*100+o.getName().length()))
        return ((getQuality()*200+(int)getDistance()*100+getName().length())-(o.getQuality()*200+(int)o.getDistance()*100+o.getName().length()));
        else {if((getQuality()*200+(int)getDistance()*100+getName().length())<(o.getQuality()*200+(int)o.getDistance()*100+o.getName().length()))
            return ((getQuality()*200+(int)getDistance()*100+getName().length())-(o.getQuality()*200+(int)o.getDistance()*100+o.getName().length()));
        else return 0;}
    }

    public static void main(String[] args)
    {
        ArrayList<Beach> beaches = new ArrayList<Beach>();
        beaches.add(new Beach("b1", 15f, 5));
        beaches.add(new Beach("b2", 12f, 2));
        beaches.add(new Beach("b3", 11f, 4));
        beaches.add(new Beach("b4", 40f, 5));
        beaches.add(new Beach("b5",  5f, 1));

        System.out.println(beaches);
        Collections.sort(beaches);
        System.out.println(beaches);
    }
}
