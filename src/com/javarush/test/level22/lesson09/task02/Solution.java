package com.javarush.test.level22.lesson09.task02;

import java.util.LinkedHashMap;
import java.util.Map;

/* Формируем Where
Сформируйте часть запроса WHERE используя StringBuilder.
Если значение null, то параметр не должен попадать в запрос.
Пример:
{"name", "Ivanov", "country", "Ukraine", "city", "Kiev", "age", null}
Результат:
"name = 'Ivanov' and country = 'Ukraine' and city = 'Kiev'"
*/
public class Solution {

    public static StringBuilder getCondition(Map<String, String> params) {
        StringBuilder str = new StringBuilder();
            for (Map.Entry<String, String> pair : params.entrySet())
            {
                String key = pair.getKey();
                String value = pair.getValue();
                if (key != null)
                if (value != null)
                        str.append(key).append(" = '").append(value).append("' and ");
            }
        if(str.length()>5)
            str.delete(str.length()-5, str.length());
        return str;
    }

   /* public static void main (String[] args) throws Exception{
        Map<String, String> map = new LinkedHashMap<>();
       // map.put("name", "Ivanov");
       //map.put(null, "Ivanov");
       // map.put("country", "Ukraine");
        map.put("", "");
        map.put("1", null);
        //map.put(null, null);
        System.out.println(getCondition(map).toString());
    }*/
}
