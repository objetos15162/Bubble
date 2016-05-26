import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *La clase BubbleResistance es una subclase de Bubble esta subclase de Bubble 
 *genera una Resistencia.
 *
 * @author Pedro Negretee
 * @author German Isai
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
