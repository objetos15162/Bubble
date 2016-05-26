import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BottonLevel1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
