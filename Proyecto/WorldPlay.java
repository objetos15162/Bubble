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
    private SimpleTimer timeBubRes;
    private SimpleTimer timeBubScore;
    private SimpleTimer timePincho;
    private SimpleTimer timeBubPlus;
    private Ventilador ventilador;
    
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
        ventilador = new Ventilador();
        timeBubRes = new SimpleTimer();
        timeBubScore = new SimpleTimer();
        timePincho = new SimpleTimer();
        timeBubPlus = new SimpleTimer();
        prepare();
    }
    
    /**
     * 
     */
    public void act(){
         if(timeBubRes.millisElapsed() > 3000) {
            generateBubbleResistance();
            timeBubRes.mark();
        }
        if(timeBubScore.millisElapsed() > 3050) {
            generateBubbleScore();
            timeBubScore.mark();
        }
        if(timePincho.millisElapsed() > 5200) {
            generateObstaclePinchos();
            timePincho.mark();
        }
        if(timeBubPlus.millisElapsed() > 3900) {
            generateBubblePlus();
            timeBubPlus.mark();
        }
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
    
    /**
     * generateBubbleResistance - crea varias burbujas de resistencia
     */
    public void generateBubbleResistance()
    {
        BubbleResistance bubRes = new BubbleResistance();
        addObject(bubRes,Greenfoot.getRandomNumber(getWidth()),0);        
    }
    
    /**
     * generateBubbleScore - crea varias burbujas de bonificacion
     */
    public void generateBubbleScore()
    {
        BubbleScore bubScore = new BubbleScore();
        addObject(bubScore,Greenfoot.getRandomNumber(getWidth()),0);        
    }
    
    
     /**
     * generateObstaclePinchos - crea varios  obstaculos pinchos 
     */
    public void generateObstaclePinchos()
    {
        Pinchos newPinchos = null;
        if(Greenfoot.getRandomNumber(2) == 1) {    
           newPinchos = new Pinchos("up");
        }
        else {
           newPinchos = new Pinchos("down");
        }
           addObject(newPinchos,getWidth(),Greenfoot.getRandomNumber(getHeight()+ 100));      
    }
    
    /**
     * generateBubblePlus - crea varias burbujas Plus
     */
    public void generateBubblePlus()
    {
        BubblePlus bubPlus = new BubblePlus();
        addObject(bubPlus,Greenfoot.getRandomNumber(getWidth()),0);        
    }
    
    /**
     * 
     */
    public Ventilador getVentilador()
    {
        return ventilador;
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        addCameraFollower(new Drone(), 0, 0);

        addObject(ventilador,501,296);
        addObject(getCounterScore(),172,80);
        addObject(getCounterRes(),172,50);

        IconBR iconbr = new IconBR();
        addObject(iconbr,107,53);
        iconbr.setLocation(104,48);
        IconBS iconbs = new IconBS();
        addObject(iconbs,112,87);
        iconbs.setLocation(102,77);
        iconbs.setLocation(104,76);
        iconbs.setLocation(104,77);
        iconbs.setLocation(105,78);
    }
}
