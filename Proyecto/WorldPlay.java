import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clase empleada para todos los mundos en los que se puede jugar
 * Maneja la creación de obstaculos y el score para pasar de nivel
 * 
 * @author Pedro Negrete
 * @version 30/04/2016
 */
public class WorldPlay extends ScrollWorld
{

    private float gravity;
    private Counter countScore;
    private Counter countRes;
   /// private Counter countTotalScore;
    private MainBubble playerBubble;
    private SimpleTimer timeBubRes;
    private SimpleTimer timeBubScore;
    private SimpleTimer timePincho;
    private SimpleTimer timeBubPlus;
    private Ventilador ventilador;
    private SimpleTimer timeBee ;
    private int limitScore; 
    private GreenfootImage backgroundWin;
    private GreenfootImage backgroundLose;
    private int totalScore;
    
    /**
     * Constructor for objects of class WorldPlay.
     * @param worldGravity Gravedad del mundo
     */
    public WorldPlay(float worldGravity,int limitScore)
    {    
        super(1000, 545, 1, 160000, 545);
        gravity = worldGravity;
        this.limitScore = limitScore;
        countRes = new Counter("Resistencia: ");
        countScore = new Counter("Score: ");
        /*countTotalScore = new Counter("Total: ");
        countTotalScore.setImage("Counter.png");*/
        countRes.setImage("counterplus.png");
        countScore.setImage("counterplus.png");
        playerBubble = new MainBubble();
        addObject(playerBubble,500,250);
        ventilador = new Ventilador();
        backgroundWin = null;
        backgroundLose = null;
        initializesTimers();
        countScore.setRemaining(limitScore);
        totalScore = 0;
        prepare();
    }
    
    /**
     * setImagesBackgrounds - pone imagenes de ganar o perder
     * @Param nameImageWin - nombre de la imagen de ganador.
     * @Param nameImageLose - nombre de la imagen de perder
     */
    public void setImagesBackgrounds(String nameImageWin,String nameImageLose)
    {
        backgroundWin = new GreenfootImage(nameImageWin);
        backgroundLose = new GreenfootImage(nameImageLose);   
    }
    
    /**
     * Este es el metodo act de la clase WorldPlay
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
        
      /*  setTotalScore(countScore.getValue());
        countTotalScore.setValue(totalScore);
        */
    }
    
    /**
     * setTotalScore - va acumulando la puntuacion total
     * @Param - La acumulacion de Score.
     */
    public void setTotalScore(int newScore)
    {
        totalScore += newScore ;
    }
    
    /**
     * getBackgroundWin - regresa la imagen o fondo de ganador
     */
    public GreenfootImage getBackgroundWin()
    {
        return backgroundWin;
    }
    
    /**
     * getBackgroundLose - regresa la imagen o fondo de perdedor
     */
    public GreenfootImage getBackgroundLose()
    {
        return backgroundLose;
    }
    
    /**
     * initializesTimers - Inicializa todos los contadores del mundo 
     * 
     */
    public void initializesTimers()
    {
        timeBubRes = new SimpleTimer();
        timeBubScore = new SimpleTimer();
        timePincho = new SimpleTimer();
        timeBubPlus = new SimpleTimer();
        timeBee = new SimpleTimer();
    }
    
    /**
     * getTimeBee - regresa el tiempo de la abeja
     * @param - timeBee -tiempo de la abeja
     */
    public SimpleTimer getTimerBee(){
          return timeBee;
    }
    /**
     * getLimitScore - Regresa el limite de puntos del nivel
     * @Param limitScore - limite de puntos
     */
    public int getLimitScore()
    {
        return limitScore;
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
           addObject(newPinchos,getCameraX()+getCameraX(),Greenfoot.getRandomNumber(getHeight()+ 100));      
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
        //addObject(countTotalScore,getWidth()-100,65);
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
    
    /**
     * gnerateBee - genera Abejas aleatoriamente
     */
    public void generateBee()
    {
         Bee newBee = new Bee();
        addObject(newBee,getCameraX()+getCameraX(),Greenfoot.getRandomNumber(getHeight())+200);    
    }
    
    /**
     * evaluatedScore - Evalua si se han conseguido los puntos necesarios para
     * pasar de un nivel a otro retorna un booleano.
     * @Return  estatus- Estado de la puntuacion "true" o "false".
     */
    public boolean evaluatedScore()
    {
        
        boolean estatus  = false;
        
        if(countScore.getValue() == limitScore) {
            estatus = true;
        }
        return estatus;
    } 
    
    /**
     * removeAllObjects - Elimina todos los onjetos del mundo
     */
     public void removeAllObjects()
     {
         removeObjects(getObjects(Actor.class));
     }
}
