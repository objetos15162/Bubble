import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Drone here.
 * 
 * @author Pedro Negrete 
 * @version 30/04/2016
 */
public class Drone extends ScrollActor
{
    private static final int MOVE_AMOUNT = 3;
    
    /**
     * Act - do whatever the Drone wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.isKeyDown("right")){
            setImage("droneder.png");
            getWorld().moveCamera(MOVE_AMOUNT);
        }
        if(Greenfoot.isKeyDown("left")) {
            setImage("droneizq.png");
            getWorld().moveCamera(-MOVE_AMOUNT);
        }
        Greenfoot.delay(8);
        setImage("drone.png");
        turnTowards(getX(), getY());
        getWorld().setCameraDirection(getRotation());
    }
}
