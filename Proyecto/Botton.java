import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Botton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Botton extends Actor
{
    private int turnDirection;  
    /**
     * Act - do whatever the Botton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Botton(int turnDirection)
    {
        super();
        this.turnDirection = turnDirection;
    }
    
    public void act() 
    {
        turn(turnDirection);
    }    

    
}
