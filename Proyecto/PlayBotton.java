import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Botón para empezar a jugar
 * 
 * @author Pedro Negrete
 * @version 30/04/2016
 */
public class PlayBotton extends Botton
{

    
    /**
     * Este es el constructor de la clase dentro de el se hace una llamada 
     * al constructor de la superclase
     */
    public PlayBotton()
    {
        super(1);
    }
   
    /**
     * Act - do whatever the playBotton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       super.act();
       
        if(Greenfoot.mouseClicked(this))
        {
            setImage("playbreak.png");
            Greenfoot.delay(5);
            World1 world = new World1();
            Greenfoot.setWorld(world);
        }
     
        
    }    
}
