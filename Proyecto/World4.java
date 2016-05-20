import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class World4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class World4 extends WorldPlay
{

    /**
     * Constructor for objects of class World4.
     * 
     */
    public World4()
    {
        super(25,25);
        
    }    /**
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
            World5 world = new World5();
            Greenfoot.setWorld(world);
        }
        
    }}
