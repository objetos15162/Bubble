import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *La clase Obstacle es una clase definida para crear objetos que representen obstaculos
 *esta clase contiene metodos para finalizar el juego
 *
 * @author Pedro Negretee
 * @author German Isai
 * @version 30/04/2016
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
       // move(-2);
       
    }    
    
    /**
     * endGame -finaliza el juego
     */
    public void endGame()
    {
            WorldPlay world = (WorldPlay)getWorld();
            World worldShow = new WorldShow(world.getBackgroundLose());
            Greenfoot.setWorld(worldShow);
            Greenfoot.delay(500);
            BubbleWorld world2 = new BubbleWorld();
            Greenfoot.setWorld(world2);
            
    }
}
