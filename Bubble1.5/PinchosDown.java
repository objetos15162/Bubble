import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PinchosDown here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PinchosDown extends Pinchos
{
   
    
    private GreenfootImage imagePinchos; 
    
    /**
     * Constructor de la clase PinchosUp.
     */
    public void PinchosUp()
    {
         imagePinchos = new GreenfootImage("pinchosDown.png");
         setImage(imagePinchos);
    }
    
    /**
     * Act - do whatever the PinchosDown wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        move(-1);
        deleteBubbles();
    } 
    /**
     * deleteBubbles - Elimina burbujas si choca con ellas 
     */
    public void deleteBubbles()
    {   
        if(isTouching(MainBubble.class)) {
            removeTouching(MainBubble.class); 
        }
    }

}
