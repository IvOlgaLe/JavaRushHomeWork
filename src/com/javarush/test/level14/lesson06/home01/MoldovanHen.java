package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Ольга on 04.04.2016.
 */
public class MoldovanHen extends Hen implements Country
{
    int getCountOfEggsPerMonth(){return 26;}
    String getDescription(){return super.getDescription()+" Моя страна - "+MOLDOVA+". Я несу "+getCountOfEggsPerMonth()+" яиц в месяц.";}
}
