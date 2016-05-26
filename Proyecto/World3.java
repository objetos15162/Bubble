import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Esta clase representa el tercer  nivel del juego y hereda de la superclase worldPlay
 * en ella se crean obstaculos y cambia al siguiente mundo.
 * 
 * @author Pedro Negretee
 * @author German Isai
 * @version 30/04/2016
 */
public class World3 extends WorldPlay
{

    private SimpleTimer timeTrees;
    /**
     * Constructor for objects of class World2.
     * 
     */
    public World3()
    {
        super(17,20);
        super.setImagesBackgrounds("ganaste3.png","perdiste3.png");
        timeTrees = new SimpleTimer();
    }
    
    
    /**
     * act - Este es el metodo actua de World1.
     * 
     * 
     */
    public void act()
    {
        super.act();

        
        if(timeTrees.millisElapsed() > 5000) {
            generateTree();
            timeTrees.mark();
        }
        if(getTimerBee().millisElapsed() > 4000) {
            generateBee();
            getTimerBee().mark();
        }
        

        if(evaluatedScore() == true) {
            WorldPlay myWorld = this; 
            removeAllObjects();
            setBackground(super.getBackgroundWin());
            Greenfoot.delay(500);
            World4 world = new World4();
            world.setTotalScore(myWorld.getLimitScore());
            Greenfoot.setWorld(world);
        }
    }
    
    /**
     * gnerateTrees - genera arboles aleatoriamente
     */
    public void generateTree()
    {
         Tree newTree = new Tree();
        addObject(newTree,getCameraX()+getCameraX(),461);    
    }
    
    

}
