package com.javarush.test.level26.lesson15.big01.command;

import com.javarush.test.level26.lesson15.big01.ConsoleHelper;
import com.javarush.test.level26.lesson15.big01.CurrencyManipulator;
import com.javarush.test.level26.lesson15.big01.CurrencyManipulatorFactory;

/**
 * Created by Ольга on 06.08.2016.
 */
class InfoCommand implements Command
{
    @Override
    public void execute()
    {
        if (CurrencyManipulatorFactory.getAllCurrencyManipulators().isEmpty())
            System.out.println("No money available.");
        else
        {
            int count = 0;
            for (CurrencyManipulator manipulator : CurrencyManipulatorFactory.getAllCurrencyManipulators())
            {
                if (manipulator.hasMoney() && manipulator.getTotalAmount() > 0)
                {
                    ConsoleHelper.writeMessage(manipulator.getCurrencyCode() + " - " + manipulator.getTotalAmount());
                    count++;
                }
            }
            if (count == 0)
                ConsoleHelper.writeMessage("No money available.");
        }
    }
}
