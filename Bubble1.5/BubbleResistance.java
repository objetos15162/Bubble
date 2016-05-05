import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BubbleResistance here.
 * 
 * @author Pedro Negrete 
 * @version 30/04/2016
 */
public class BubbleResistance extends Bubble
{
    /**
     * Constructor de la burbuja de resistencia
     */
    public BubbleResistance()
    {
        super(9, 3);
    }
    
    /**
     * Act - do whatever the BubbleResistence wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        super.act();
        World mundo = getWorld();
        WorldPlay subMundo = (WorldPlay)mundo;
        if(getGravityResistance() < subMundo.getGravity()) {
            setLocation(getX(),
                        getY() - Math.round(getGravityResistance() - subMundo.getGravity()));
        }
    }   
}
