package com.javarush.test.level26.lesson15.big01.command;

import com.javarush.test.level26.lesson15.big01.exception.InterruptOperationException;

/**
 * Created by Ольга on 06.08.2016.
 */
public interface Command
{
    void execute() throws InterruptOperationException;
}
