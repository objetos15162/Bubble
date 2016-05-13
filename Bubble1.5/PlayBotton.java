import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayBotton here.
 * 
 * @author Pedro Negrete
 * @version 30/04/2016
 */
public class PlayBotton extends Botton
{
    /**
     * Act - do whatever the playBotton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       super.act();
       
        if(Greenfoot.mouseClicked(this))
        {
            setImage("playbreak.png");
            Greenfoot.delay(5);
            World1 world = new World1();
            Greenfoot.setWorld(world);
        }
     
        
    }    
}
