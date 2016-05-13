import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BubbleResistance here.
 * 
 * @author Pedro Negrete 
 * @version 30/04/2016
 */
public class BubbleResistance extends Bubble 
{
    private String direccion;
    /**
     * Constructor de la burbuja de resistencia
     */
    public BubbleResistance()
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
     * detectRebote - Detecta si se genero un rebote con un PinchoDown.
     */
    public void detectRebote()
    {
        if(isTouching(PinchosDown.class)) {
              super.setDirection("up");
              
              
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
