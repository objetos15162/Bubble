import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Esta clase representa el ultimo nivel del juego y hereda de la superclase worldPlay
 * en ella se crean obstaculos y cambia a MainBubble.
 * 
 * @author Pedro Negretee
 * @author German Isai
 * @version 30/04/2016
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
     * metodo act de la clase World5.
     */
    public void act()
    {
        super.act();
       if(getTimerBee().millisElapsed() > 2000) {
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
