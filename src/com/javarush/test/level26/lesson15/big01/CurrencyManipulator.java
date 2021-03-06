package com.javarush.test.level26.lesson15.big01;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Ольга on 04.08.2016.
 */
public class CurrencyManipulator
{
    private String currencyCode;
    private Map<Integer, Integer> denominations=new HashMap<>();

    public CurrencyManipulator(String currencyCode)
    {
        this.currencyCode = currencyCode;
    }

    public String getCurrencyCode()
    {
        return currencyCode;
    }

    public void addAmount(int denomination, int count){
        if(denominations.containsKey(denomination)){
            denominations.put(denomination,denominations.get(denomination)+count);
        }else{
            denominations.put(denomination,count);
        }
    }

    public int getTotalAmount()
    {
        int totalAmount = 0;
        for (Map.Entry<Integer, Integer> pair : denominations.entrySet())
        {
            totalAmount += pair.getKey() * pair.getValue();
        }
        return totalAmount;
    }

    public boolean  hasMoney()
    {
        boolean result = true;
        if (denominations.isEmpty()) result = false;
        else
        {
            int zerosCount = 0;
            for (Map.Entry<Integer, Integer> pair : denominations.entrySet())
            {
                if (pair.getValue() == 0) zerosCount++;
            }
            if (zerosCount == denominations.size()) result = false;
        }
        return result;
    }
}
