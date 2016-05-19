import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BubblePlus here.
 * 
 * @author Pedro Negrete, Isai Tovar
 * @version (a version number or a date)
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
