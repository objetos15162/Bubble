import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ReturnBotton here.
 * 
 * @author Pedro Negrete 
 * @version 30/04/2016
 */
public class ReturnBotton extends Botton
{
    /**
     * Act - do whatever the returnBotton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.delay(5);
            BubbleWorld world = new BubbleWorld();
            Greenfoot.setWorld(world);
            
        }
    }    
}
