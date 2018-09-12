package com.javarush.test.level27.lesson15.big01;
import com.javarush.test.level27.lesson15.big01.kitchen.Order;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * Created by Ольга on 07.08.2016.
 */
public class Tablet
{
    final int number;

    public Tablet(int number)
    {
        this.number = number;
    }

    @Override
    public String toString()
    {
        return "Tablet{number=" + number + "}";
    }

    public static Logger logger = Logger.getLogger(Tablet.class.getName());

    public void createOrder(){
        try {
        ConsoleHelper.writeMessage(new Order(this).toString());
    } catch (IOException e) {
        logger.log(Level.SEVERE, "Console is unavailable.");
    }}
}
