import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Burbuja para aumentar el tamaño de la burbuja principal
 * 
 * @author Pedro Negrete, Isai Tovar
 * @version 24/05/2016
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
