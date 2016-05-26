import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BottonLevel3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
