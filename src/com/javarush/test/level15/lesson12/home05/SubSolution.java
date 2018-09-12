package com.javarush.test.level15.lesson12.home05;

/**
 * Created by Ольга on 13.04.2016.
 */
public class SubSolution extends Solution
{
    public SubSolution(int fan)
    {
        super(fan);
    }

    public SubSolution(String fan)
    {
        super(fan);
    }

    public SubSolution(double fan)
    {
        super(fan);
    }

    protected SubSolution(float fan, int f)
    {
        super(fan, f);
    }

    protected SubSolution(boolean fan, int f)
    {
        super(fan, f);
    }

    protected SubSolution(byte fan, int f)
    {
        super(fan, f);
    }

    SubSolution(int fan, int f)
    {
        super(fan, f);
    }

    SubSolution(String fan, int f)
    {
        super(fan, f);
    }

    SubSolution(double fan, int f)
    {
        super(fan, f);
    }

    private SubSolution(float fan){super(fan);}
    private SubSolution(Integer fan){super(fan);}
    private SubSolution(byte fan){super(fan);}
}
