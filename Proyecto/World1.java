import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Nivel #1
 * 
 * @author Pedro Negrete
 * @version 30/04/2016
 */
public class World1 extends WorldPlay
{
    /**
     * Constructor for objects of class World1.
     * Hace una llamada al constructor de la superclase
     * WorldPlay.
     * 
     */
    public World1()
    {
        super(9.8F,10);
        super.setImagesBackgrounds("ganaste1.png","perdiste1.png");
    }
    
    /**
     * act - Este es el metodo actua de la la clase  World
     * 
     */
    public void act()
    {
        super.act();

        if(evaluatedScore() == true){
            WorldPlay myWorld = this; 
            removeAllObjects();
            setBackground(super.getBackgroundWin());
            Greenfoot.delay(500);
            World2 world = new World2();
            world.setTotalScore(myWorld.getLimitScore());
            Greenfoot.setWorld(world);
        }
    }
    
}
