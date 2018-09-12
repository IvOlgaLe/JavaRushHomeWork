package com.javarush.test.level14.lesson08.home09;

public abstract class Money
{
    public Money(double amount)
    {
        summa=amount;
    }
    private double summa;
    public double getAmount(){return summa;}
    public abstract String getCurrencyName();
}

