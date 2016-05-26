import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *La clase BubblePlus es una subclase de Bubble de esta subclase de Bubble 
 * se pueden crear objetos que dan un plus a MainBubble
 * @author Pedro Negretee
 * @author German Isai
 * @version 30/04/2016
 */
public class BubblePlus extends Bubble
{
  
    /**
     * Constructor de la clase BubblePlus
     */
    public BubblePlus()
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
        super.detectRebote();
        moveUp();
        falling(); 
        
    }
    
    /**
     * getDirection - Regresa la direccion de la burbuja
     */
    public String getDirection()
    {
        return super.getDirection(); 
    }
    
}
