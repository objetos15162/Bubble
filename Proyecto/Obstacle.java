import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Obstacle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
abstract public class Obstacle extends ScrollActor
{
    /**
     * Act - do whatever the Obstacle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        move(-1);
    }    
    
    /**
     * endGame -finaliza el juego
     */
    public void endGame()
    {
            World world = getWorld();
            world.setBackground("perdiste1.png");
            Greenfoot.delay(100);
            BubbleWorld world2 = new BubbleWorld();
            Greenfoot.setWorld(world2);
            
    }
}
