package com.javarush.test.level26.lesson15.big01;

/**
 * Created by Ольга on 04.08.2016.
 */
public enum  Operation
{
    INFO,
    DEPOSIT,
    WITHDRAW,
    EXIT;

    public static Operation getAllowableOperationByOrdinal(Integer i)
    {
        switch (i)
        {
            case 1:
                return INFO;
            case 2:
                return DEPOSIT;
            case 3:
                return WITHDRAW;
            case 4:
                return EXIT;
            default: throw new IllegalArgumentException();
        }
    }
}


