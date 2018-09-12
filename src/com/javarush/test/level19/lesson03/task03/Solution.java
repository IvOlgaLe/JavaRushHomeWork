package com.javarush.test.level19.lesson03.task03;

/* Адаптация нескольких интерфейсов
Адаптировать IncomeData к Customer и Contact.
Классом-адаптером является IncomeDataAdapter.
Инициализируйте countries перед началом выполнения программы. Соответствие кода страны и названия:
UA Ukraine
RU Russia
CA Canada
Дополнить телефонный номер нулями до 10 цифр при необходимости (смотри примеры)
Обратите внимание на формат вывода фамилии и имени человека
*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static Map<String, String> countries = new HashMap<String, String>();

    static
    {
        countries.put("UA", "Ukraine");
        countries.put("RU", "Russia");
        countries.put("CA", "Canada");
    }

    public static class IncomeDataAdapter implements Customer, Contact{
        private IncomeData obj;
        IncomeDataAdapter(IncomeData obj)
        {
            this.obj=obj;
        }

        @Override
        public String getName()
        {
            return this.obj.getContactLastName()+", "+this.obj.getContactFirstName();
        }

        @Override
        public String getPhoneNumber()
        {
            String zero="";
            if(String.format(String.valueOf(this.obj.getPhoneNumber())).length()<10)
            {
                for(int i=0; i<(10-String.valueOf(this.obj.getPhoneNumber()).length()); i++)
                zero += "0";
            }

            String number= zero+this.obj.getPhoneNumber();
            return "+"+this.obj.getCountryPhoneCode()+"("+number.substring(0,3)+")"+number.substring(3,6)+"-"+number.substring(6,8)+"-"+number.substring(8);
        }

        @Override
        public String getCompanyName()
        {
            return this.obj.getCompany();
        }

        @Override
        public String getCountryName()
        {
            return countries.get(this.obj.getCountryCode());
        }
    }

    public static interface IncomeData {
        String getCountryCode();        //example UA

        String getCompany();            //example JavaRush Ltd.

        String getContactFirstName();   //example Ivan

        String getContactLastName();    //example Ivanov

        int getCountryPhoneCode();      //example 38

        int getPhoneNumber();           //example 501234567
    }

    public static interface Customer {
        String getCompanyName();        //example JavaRush Ltd.

        String getCountryName();        //example Ukraine
    }

    public static interface Contact {
        String getName();               //example Ivanov, Ivan

        String getPhoneNumber();        //example +38(050)123-45-67
    }
}