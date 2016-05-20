import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BottonLevel2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
