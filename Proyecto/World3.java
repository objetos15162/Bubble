import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class World3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class World3 extends WorldPlay
{

    /**
     * Constructor for objects of class World3.
     * 
     */
    public World3()
    {
        super(25);
        Counter cont = new Counter();
        cont = getCounterScore();
        if(cont.getValue() == 10){
            World3 world = new World3();
            Greenfoot.setWorld(world);
        }
    }
    
    /**
     * act - Este es el metodo actua de World3.
     * 
     */
    public void act()
    {
        super.act();
    }
}
