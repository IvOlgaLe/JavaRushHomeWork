package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Ольга on 04.04.2016.
 */
public class UkrainianHen extends Hen implements Country
{
    int getCountOfEggsPerMonth(){return 28;}
    String getDescription(){return super.getDescription()+" Моя страна - "+UKRAINE+". Я несу "+getCountOfEggsPerMonth()+" яиц в месяц.";}
}
