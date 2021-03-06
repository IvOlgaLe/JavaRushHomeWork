package com.javarush.test.level18.lesson08.task03;

import java.io.*;

/* AmigoOutputStream
1 Измените класс AmigoOutputStream так, чтобы он стал Wrapper-ом для класса FileOutputStream. Используйте наследование.
2 При вызове метода close() должны выполняться следующая последовательность действий:
2.1 вызвать метод flush()
2.2 дописать следующий текст [JavaRush © 2012-2013 All rights reserved.], используйте метод getBytes()
2.3 закрыть поток методом close()
*/

public class AmigoOutputStream extends FileOutputStream{
    public static String fileName = "C:/tmp/result.txt";

    private FileOutputStream obj;
    public AmigoOutputStream(FileOutputStream obj) throws FileNotFoundException
    {
        super(fileName);
        this.obj = obj;
    }
    public void flush() throws IOException
    {obj.flush();}

    public void write(int b) throws IOException
    {obj.write(b);}

    public void write(byte[] b) throws IOException
    {obj.write(b);}

    public void write(byte[] b, int off, int len) throws IOException
    {obj.write(b,off,len);}

    public void close() throws IOException
    {
        new FileOutputStream(fileName, true);
        obj.flush();
        obj.write(new String("JavaRush © 2012-2013 All rights reserved.").getBytes());
        obj.close();
    }
    public static void main(String[] args) throws FileNotFoundException {
        new AmigoOutputStream(new FileOutputStream(fileName));
    }
}
