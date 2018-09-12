package com.javarush.test.level20.lesson10.home03;

import java.beans.Transient;
import java.io.*;

/* Найти ошибки
Почему-то при сериализации/десериализации объекта класса B возникают ошибки.
Найдите проблему и исправьте ее.
Класс A не должен реализовывать интерфейсы Serializable и Externalizable.
Сигнатура класса В не содержит ошибку :)
Метод main не участвует в тестировании.
*/
public class Solution implements Serializable
{
    public static class A
    {
        public A() { }
        protected String name = "A";

        public A(String name)
        {
            this.name += name;
        }
    }

    public class B extends A implements Serializable
    {
        public B(String name)
        {
            super(name);
            this.name += name;
        }
        private void writeObject(ObjectOutputStream out) throws IOException
        {
            out.writeObject(name);
        }
        private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException
        {
            name = (String) in.readObject();
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException
    {
        B b = new Solution().new B("B");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(baos);
        out.writeObject(b);
        out.close();
        ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(baos.toByteArray()));
        B b1 = (B) in.readObject();
        System.out.println(b.name);
        System.out.println(b1.name);
        in.close();
    }
}
