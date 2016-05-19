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
        super(10);
    }
    
    /**
     * act - Este es el metodo actua de World2.
     * 
     */
    public void act()
    {
        super.act();
        Counter cont = new Counter();
        cont = getCounterScore();
        if(cont.getValue() == 10){
            World3 world = new World3();
            Greenfoot.setWorld(world);
        }
    }
}
