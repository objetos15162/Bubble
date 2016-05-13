import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WorldPlay here.
 * 
 * @author Pedro Negrete
 * @version 30/04/2016
 */
public class WorldPlay extends ScrollWorld
{

    private float gravity;
    private Counter countScore;
    private Counter countRes;
    private MainBubble playerBubble;
    
    /**
     * Constructor for objects of class WorldPlay.
     * @param worldGravity Gravedad del mundo
     */
    public WorldPlay(float worldGravity)
    {    
        super(1000, 545, 1, 8000, 545);
        gravity = worldGravity;
        countRes = new Counter("Resistencia: ");
        countScore = new Counter("Score: ");
        playerBubble = new MainBubble();
        addObject(playerBubble,500,250);
        
        
    }
    
    /**
     * @return gravity Gravedad del mundo
     */
    public float getGravity()
    {
        return gravity;
    }
    
    /**
     * getCounterScore - regresa un objeto contador de score
     * @Param countScore - contador de puntuacion.
     */
    public Counter getCounterScore()
    {
        return countScore;
    }
    
     /**
     * getCounterRes - regresa un objeto contador de resistencia
     * @Param countRes - contador de resistencia.
     */
    public Counter getCounterRes()
    {
        return countRes;
    }
}
