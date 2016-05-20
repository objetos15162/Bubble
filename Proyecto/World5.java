import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class World5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
      
    }
    public void act()
    {
        super.act();
       if(getTimerBee().millisElapsed() > 7000) {
            generateBee();
            getTimerBee().mark();
        }
        
        if(getCounterScore().getValue() == getLimitScore()){
            // setBackground("ganaste1.png");
             Greenfoot.stop();
             
        }
        
    }

}
