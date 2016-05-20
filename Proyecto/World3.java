import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class World3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class World3 extends WorldPlay
{

    private SimpleTimer timeTrees;
    private SimpleTimer timeBee;
    /**
     * Constructor for objects of class World2.
     * 
     */
    public World3()
    {
        super(17,20);
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
        

        if(getCounterScore().getValue() == getLimitScore()){
            setBackground("ganaste1.png");
            Greenfoot.stop();
            World3 world = new World3();
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
