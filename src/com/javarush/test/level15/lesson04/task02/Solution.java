package com.javarush.test.level15.lesson04.task02;

/* ООП - Перегрузка
Перегрузите метод printMatrix 8 различными способами. В итоге должно получиться 10 различных методов printMatrix.
*/

public class Solution
{
    public static void main(String[] args)
    {
        printMatrix(2, 3, "8");
    }

    public static void printMatrix(int m, int n, String value)
    { //1
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Object value)
    { //2
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                System.out.print(value);
            }
            System.out.println();
        }
    }

    public static void printMatrix(int m, int n, char value)
    { //3
        for (int i = 0; i < m + n; i++)
        {
            System.out.print(value);
        }
        System.out.println();
    }

    public static void printMatrix(int m, int n, int value)
    { //4
        for (int i = 0; i < m; i++)
        {
            System.out.print(value + n);
        }
        System.out.println();
    }

    public static void printMatrix(int m, int n, Short value)
    { //5
        for (int i = 0; i < m; i++)
        {
            System.out.print(value);
        }
        System.out.println();
    }

    public static void printMatrix(int m, int n, Integer value)
    { //6
        for (int i = 0; i < m; i++)
        {
            System.out.print(value*n);
        }
        System.out.println();
    }

    public static void printMatrix(int m, int n, double value)
{ //7
    for (int i = 0; i < m; i++)
    {
        System.out.print(value+n);
    }
    System.out.println();
}

    public static void printMatrix(int m, int n, long value)
    { //8
        for (int i = 0; i < m; i++)
        {
            System.out.print(value+2*n);
        }
        System.out.println();
    }

    public static void printMatrix(int m, int n, byte value)
    { //9
        for (int i = 0; i < m; i++)
        {
            System.out.print(value+n);
        }
        System.out.println();
    }

    public static void printMatrix(int m, int n, float value)
    { //10
        for (int i = 0; i < m; i++)
        {
            System.out.print(value+3*n);
        }
        System.out.println();
    }
}
