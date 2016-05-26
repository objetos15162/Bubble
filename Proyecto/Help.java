import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * La clase Help representa el mundo help del juego en el cual se 
 * muesttra la ayuda del juego asi como un boton de regreso al mundo anterior a el
 * 
 * @author Pedro Negrete
 * @version 30/04/2016
 */
public class Help extends World
{

    /**
     * Constructor for objects of class Help.
     * 
     */
    public Help()
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
