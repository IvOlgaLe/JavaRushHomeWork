package com.javarush.test.level19.lesson10.bonus02;

/* Свой FileWriter
Реализовать логику FileConsoleWriter
Должен наследоваться от FileWriter
При записи данных в файл, должен дублировать эти данные на консоль
*/

import java.io.FileWriter;
import java.io.IOException;

public class FileConsoleWriter extends FileWriter{

    public FileConsoleWriter(String fileName) throws IOException
    {
        super(fileName);
    }


    public void write(char[] cbuf, int off, int len) throws IOException
    {
        System.out.print(String.copyValueOf(cbuf).substring(off, off+len));
        super.write(cbuf, off, len);
    }


    public void write(String str, int off, int len) throws IOException {
        if(len < 0) {
            throw new IndexOutOfBoundsException();
        } else {
            char[] var4 = new char[len];
            str.getChars(off, off + len, var4, 0);
            this.write((char[])var4, 0, len);
        }
    }


    public void write(int c) throws IOException
    {
        char[] var2 = new char[]{(char)c};
        write((char[])var2, 0, 1);
    }
}


