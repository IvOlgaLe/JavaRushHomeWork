package com.javarush.test.level26.lesson15.big01;

import com.javarush.test.level26.lesson15.big01.command.CommandExecutor;
import com.javarush.test.level26.lesson15.big01.exception.InterruptOperationException;

import java.util.Locale;

/**
 * Created by Ольга on 04.08.2016.
 */
public class CashMachine
{
        public static void main (String args[])
        {
            try{
            Locale.setDefault(Locale.ENGLISH);
            Operation op;
            do
            {
                op = ConsoleHelper.askOperation();
                CommandExecutor.execute(op);
            }
            while (op != Operation.EXIT);
        }
            catch (InterruptOperationException e){
                ConsoleHelper.writeMessage("Благодарим Вас. До свидания.");
            }
    }

}