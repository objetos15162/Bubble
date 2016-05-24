import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Botón para empezar el nivel 4
 * 
 * @author Isai Tovar
 * @version 24/05/2016
 */
public class BottonLevel4 extends Botton
{
   /**
    * 
    */
   public BottonLevel4()
   {
       super(1);
    }
    /**
     * Act - do whatever the BottonLevel4 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this))
        {
            World4 world = new World4();
            Greenfoot.setWorld(world);
        }
        
    }    
}
