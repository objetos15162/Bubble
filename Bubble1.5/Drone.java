import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Drone here.
 * 
 * @author Pedro Negrete 
 * @version 30/04/2016
 */
public class Drone extends Actor
{
    /**
     * Act - do whatever the Drone wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.isKeyDown("right")){
            setImage("droneder.png");
            move(4);
        }
        if(Greenfoot.isKeyDown("left")) {
            setImage("droneizq.png");
            move(-4);
        }
        Greenfoot.delay(8);
        setImage("drone.png");
    }    
}
