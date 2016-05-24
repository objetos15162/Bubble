import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Nivel #2
 * 
 * @author Isai Tovar
 * @version 24/05/2016
 */
public class World2 extends WorldPlay
{
    /**
     * Constructor for objects of class World2.
     * 
     */
    public World2()
    {
        super(14,15);
        super.setImagesBackgrounds("ganaste2.png","perdiste2.png");
        
    }
    
    /**
     * act - Este es el metodo actua de World1.  
     */
    public void act()
    {
       super.act();
       if(getTimerBee().millisElapsed() > 7000) {
            generateBee();
            getTimerBee().mark();
        }
        
        if(evaluatedScore() == true) {
            WorldPlay myWorld = this; 
            removeAllObjects();
            setBackground(super.getBackgroundWin());
            Greenfoot.delay(500);
            World3 world = new World3();
            world.setTotalScore(myWorld.getLimitScore());
            Greenfoot.setWorld(world);
        }
        
    }
}
