import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level here.
 * 
 * @author Pedro Negrete 
 * @version 30/04/2016
 */
public class Level extends World
{

    /**
     * Constructor for objects of class Level.
     * 
     */
    public Level()
    {    
        super(1000, 545, 1);
      prepare();  
    }
     /**
    * Prepare the world for the start of the program.
    * That is: create the initial objects and add them to the world.
    */
   private void prepare()  
   {
      ReturnBotton returnbotton = new ReturnBotton();
      addObject(returnbotton,55,492);
      returnbotton.setLocation(55,492);
   }
}
