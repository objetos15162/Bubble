import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class World2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
        
    }
    
    
    /**
     * act - Este es el metodo actua de World1.
     * 
     * 
     */
    public void act()
    {
       super.act();
       if(getTimerBee().millisElapsed() > 7000) {
            generateBee();
            getTimerBee().mark();
        }
        if(getCounterScore().getValue() == getLimitScore()){
            World3 world = new World3();
            Greenfoot.setWorld(world);
        }
        
    }
}
