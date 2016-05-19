import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BubblePoint here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BubblePoint extends Bubble
{
    private String direccion;
    /**
     * Constructor de la burbuja de resistencia
     */
    public BubblePoint()
    {
        super(9, 3);
        direccion = "down";
    }
    
    /**
     * Act - do whatever the BubbleResistence wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        super.act();
        detectRebote();
        World mundo = getWorld();
        WorldPlay subMundo = (WorldPlay)mundo;
        if(getGravityResistance() < subMundo.getGravity() && direccion == "down") {
            setLocation(getX(),getY() - Math.round(getGravityResistance() - subMundo.getGravity()));
        }
        else if( direccion == "up") {
             setLocation(getX(),getY()-1);
        }
    }
    
    /**
     * detectRebote - Detecta si se genero un rebote con un PinchoDown
     */
    public void detectRebote()
    {
        if(isTouching(PinchosDown.class)) {
              direccion = "up";
        }
    }
}
