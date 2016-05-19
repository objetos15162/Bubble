import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ScoreBotton here.
 * 
 * @author Pedro Negrete 
 * @version 30/04/2016
 */
public class ScoreBotton extends Botton
{
    
    /**
     * Este es el constructor de la clase dentro de el se hace una llamada 
     * al constructor de la superclase
     */
    public ScoreBotton()
    {
        super(1);
    }
    
    /**
     * Act - do whatever the scoreBotton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        super.act();
        
        if(Greenfoot.mouseClicked(this))
        {
            setImage("scorebreak.png");
            Greenfoot.delay(5);
            Score screen = new Score();
            Greenfoot.setWorld(screen);
        }
        
    }  
}
