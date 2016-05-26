import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Esta clase representa el cuarto nivel del juego y hereda de la superclase worldPlay
 * en ella se crean obstaculos y cambia al siguiente mundo.
 * 
 * @author Pedro Negretee
 * @author German Isai
 * @version 30/04/2016
 */
public class World4 extends WorldPlay
{

    /**
     * Constructor for objects of class World4.
     * 
     */
    public World4()
    {
        super(25,25);
        super.setImagesBackgrounds("ganaste4.png","perdiste4.png");
        
    }    /**
     * act - Este es el metodo actua de World1.
     * 
     * 
     */
    public void act()
    {
     super.act();
       if(getTimerBee().millisElapsed() > 3000) {
            generateBee();
            getTimerBee().mark();
        }
        
        if(evaluatedScore() == true) {
            WorldPlay myWorld = this; 
            removeAllObjects();
            setBackground(super.getBackgroundWin());
            Greenfoot.delay(500);
            World5 world = new World5();
            world.setTotalScore(myWorld.getLimitScore());
            Greenfoot.setWorld(world);
        }
        
    }}
