import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clase que da movimiento a los botones
 * 
 * @author Isai Tovar 
 * @version 24/05/2016
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
