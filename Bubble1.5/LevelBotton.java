import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LevelBotton here.
 * 
 * @author Pedro Negrete
 * @version 30/04/2016
 */
public class LevelBotton extends Botton
{
    /**
     * Act - do whatever the levelBotton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            setImage("levelbreak.png");
            Greenfoot.delay(5);
            Level screen = new Level();
            Greenfoot.setWorld(screen);
        }
        
    }    
}
