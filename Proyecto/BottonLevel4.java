import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BottonLevel4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
