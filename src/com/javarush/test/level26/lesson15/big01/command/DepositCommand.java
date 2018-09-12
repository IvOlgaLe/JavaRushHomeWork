package com.javarush.test.level26.lesson15.big01.command;

import com.javarush.test.level26.lesson15.big01.ConsoleHelper;
import com.javarush.test.level26.lesson15.big01.CurrencyManipulatorFactory;
import com.javarush.test.level26.lesson15.big01.exception.InterruptOperationException;

/**
 * Created by Ольга on 06.08.2016.
 */
class DepositCommand implements Command
{
    @Override
    public void execute() throws InterruptOperationException
    {
        try
        {
            String curCode = ConsoleHelper.askCurrencyCode();
            String[] nc = ConsoleHelper.getValidTwoDigits(curCode);
            CurrencyManipulatorFactory.getManipulatorByCurrencyCode(curCode).addAmount(Integer.parseInt(nc[0]), Integer.parseInt(nc[1]));
        }
        catch (NumberFormatException ex)
        {
            ex.printStackTrace();
        }
    }
}
