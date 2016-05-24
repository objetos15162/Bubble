import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Botón para empezar el nivel 2
 * 
 * @author Isai Tovar 
 * @version 24/05/2016
 */
public class BottonLevel2 extends Botton
{
   /**
    * 
    */
   public BottonLevel2()
   {
       super(1);
    }
    /**
     * Act - do whatever the BottonLevel2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this))
        {
            World2 world = new World2();
            Greenfoot.setWorld(world);
        }
        
    }    
}
