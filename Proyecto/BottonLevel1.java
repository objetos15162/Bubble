import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Botón para empezar el nivel 1
 * 
 * @author Isai Tovar 
 * @version 24/05/2016
 */
public class BottonLevel1 extends Botton
{
   /**
    * 
    */
   public BottonLevel1()
   {
       super(1);
    }
    /**
     * Act - do whatever the BottonLevel1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this))
        {
            World1 world = new World1();
            Greenfoot.setWorld(world);
        }
        
    }    
}
