import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Obstaculos del juego
 * Se encarga de dar por terminado el juego
 * 
 * @author Isai Tovar
 * @version 24/05/2016
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
        move(-2);
    }    
    
    /**
     * endGame -finaliza el juego
     */
    public void endGame()
    {
            WorldPlay world = (WorldPlay)getWorld();
            world.removeAllObjects();
            world.setBackground(world.getBackgroundLose());
            Greenfoot.delay(500);
            BubbleWorld world2 = new BubbleWorld();
            Greenfoot.setWorld(world2);
            
    }
}
