import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Nivel #5
 * 
 * @author Isai Tovar
 * @version 24/05/2016
 */
public class World5 extends WorldPlay
{

    /**
     * Constructor for objects of class World5.
     * 
     */
    public World5()
    {
      super(30,30);
      super.setImagesBackgrounds("ganaste5.png","perdiste5.png");
      
    }
    /**
     * act de World5
     */
    public void act()
    {
        super.act();
       if(getTimerBee().millisElapsed() > 7000) {
            generateBee();
            getTimerBee().mark();
        }
        
        if(evaluatedScore() == true) {
            
            setBackground(super.getBackgroundWin());
            Greenfoot.delay(500);
            World worldMain = new BubbleWorld();
            Greenfoot.setWorld(worldMain);           
        }
        
    }

}
