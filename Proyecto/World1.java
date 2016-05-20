import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class World1 here.
 * 
 * @author Pedro Negrete
 * @version 30/04/2016
 */
public class World1 extends WorldPlay
{
    /**
     * Constructor for objects of class World1.
     * 
     */
    public World1()
    {
        super(9.8F,10);
    }
    
    /**
     * act - Este es el metodo actua de World1.
     * 
     * 
     */
    public void act()
    {
        super.act();

        if(getCounterScore().getValue() == getLimitScore()){
            World2 world = new World2();
            Greenfoot.setWorld(world);
        }
    }
    
}
