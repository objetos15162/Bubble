import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Botton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Botton extends Actor
{
    /**
     * Act - do whatever the Botton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        turnAleatory();
        
    }    
    /**
     * TurnAleatory - Hace que la burbuja gire aleatoriamente
     */
    public void turnAleatory()
    {
       if(Greenfoot.getRandomNumber(100)%2 == 0) {
         turn(1);
       }
       else if( Greenfoot.getRandomNumber(100)%2 == 1) {
         turn(-1);
       }
    }
    
}
