import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BottonLevel5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BottonLevel5 extends Botton
{
   /**
    * 
    */
   public BottonLevel5()
   {
       super(1);
    }
    /**
     * Act - do whatever the BottonLevel5 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this))
        {
            World5 world = new World5();
            Greenfoot.setWorld(world);
        }
        
    }    
}
