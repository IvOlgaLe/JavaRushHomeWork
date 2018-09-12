package com.javarush.test.level14.lesson08.home05;

/**
 * Created by Ольга on 04.04.2016.
 */
public class Computer
{

    private Keyboard keyboard;
    private Mouse mouse;
    private Monitor monitor;

    public Computer() {
        keyboard = new Keyboard();
        mouse = new Mouse();
        monitor = new Monitor();}

    public Monitor getMonitor()  {return monitor;}
    public Mouse getMouse()  {return mouse;}
    public Keyboard getKeyboard()  {return keyboard;}

}
