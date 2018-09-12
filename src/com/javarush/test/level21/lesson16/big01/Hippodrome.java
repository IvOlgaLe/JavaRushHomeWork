package com.javarush.test.level21.lesson16.big01;

import java.util.ArrayList;

/**
 * Created by Ольга on 13.06.2016.
 */
public class Hippodrome{

    public static void main(String[] args) throws InterruptedException
    {
        game=new Hippodrome();
        Horse alfa=new Horse("Alfa",3,0);
        Horse beta=new Horse("Beta",3,0);
        Horse sigma=new Horse("Sigma",3,0);
        game.horses.add(alfa);
        game.horses.add(beta);
        game.horses.add(sigma);

        game.run();
        game.printWinner();
    }

    ArrayList<Horse> horses=new ArrayList<>();

    public ArrayList<Horse> getHorses(){return horses;}

    public static Hippodrome game;

    public void run() throws InterruptedException
    {
        for(int i=0; i<100;i++)
        {
            move();
            print();
            Thread.sleep(200);
            System.out.println();
            System.out.println();
        }
    }
    public void move(){
        for (Horse horse: getHorses())
            horse.move();}

    public void print(){
        for (Horse horse: getHorses())
            horse.print();}

    public Horse getWinner(){

        Horse winner = new Horse("winner", 0,0);
        for (Horse horse:getHorses()){
            if (horse.getDistance()>winner.getDistance())
            {
                winner = horse;
            }
        }
        return winner;
    }

    public void printWinner(){
        System.out.println("Winner is "+getWinner().getName()+"!");
    }
}
