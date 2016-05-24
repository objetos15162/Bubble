import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Botón para empezar el nivel 3
 * 
 * @author Isai Tovar 
 * @version 24/05/2016
 */
public class BottonLevel3 extends Botton
{
   /**
    * 
    */
   public BottonLevel3()
   {
       super(1);
    }
    /**
     * Act - do whatever the BottonLevel3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this))
        {
            World3 world = new World3();
            Greenfoot.setWorld(world);
        }
        
    }    
}
