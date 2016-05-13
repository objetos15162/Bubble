import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BubblePoint here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class BubbleScore extends Bubble
{
    /**
     * Constructor de la burbuja de resistencia
     */
    public BubbleScore()
    {
        super(9, 3,"down");
    }
    
    /**
     * Act - do whatever the BubbleResistence wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        turn(1);
        super.act();
        detectRebote();
        moveUp();
        falling(); 
    }
    
    /**
     * detectRebote - Detecta si se genero un rebote con un PinchoDown
     */
    public void detectRebote()
    {
        if(isTouching(PinchosDown.class)) {
              super.setDirection("up");       
        }
    }
}
