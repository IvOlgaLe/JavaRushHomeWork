package com.javarush.test.level19.lesson03.task02;

/* Адаптер
Используйте класс AdapterFileOutputStream, чтобы адаптировать FileOutputStream к новому интерфейсу AmigoStringWriter
*/

import java.io.FileOutputStream;
import java.io.IOException;

public class AdapterFileOutputStream implements AmigoStringWriter{

    private FileOutputStream obj;
    AdapterFileOutputStream(FileOutputStream obj)
    {
        this.obj = obj;
    }
    @Override
    public void flush() throws IOException
    {
            this.obj.flush();
    }

    @Override
    public void writeString(String s) throws IOException
    {
        this.obj.write(s.getBytes());
    }

    @Override
    public void close() throws IOException
    {
            this.obj.close();
    }
}

