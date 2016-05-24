import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Botón para mostrar la pantalla de ayuda
 * 
 * @author Pedro Negrete
 * @version 30/04/2016
 */
public class HelpBotton extends Botton
{
    
    /**
     * Este es el constructor de la clase dentro de el se hace una llamada 
     * al constructor de la superclase
     */
    public HelpBotton()
    {
        super(-1);
    }
    
    /**
     * Act - do whatever the helpBotton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        super.act();
        
        if(Greenfoot.mouseClicked(this))
        {
            setImage("helpbreak.png");
            Greenfoot.delay(5);
            Help screen = new Help();
            Greenfoot.setWorld(screen);
        }
        
    }    
}
