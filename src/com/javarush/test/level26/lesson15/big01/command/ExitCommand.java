package com.javarush.test.level26.lesson15.big01.command;

import com.javarush.test.level26.lesson15.big01.ConsoleHelper;
import com.javarush.test.level26.lesson15.big01.exception.InterruptOperationException;

/**
 * Created by Ольга on 06.08.2016.
 */
class ExitCommand implements Command
{
    @Override
    public void execute() throws InterruptOperationException
    {
        ConsoleHelper.writeMessage("Вы действительно хотите выйти(y/n)?");
        String answer=ConsoleHelper.readString();
        if(answer.equalsIgnoreCase("y"))
        ConsoleHelper.writeMessage("Благодарим Вас. До свидания.");
    }
}
