import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MainBubble here.
 * 
 * @author Pedro Negrete
 * @version 30/04/2016
 */
public class MainBubble extends Bubble
{
    private int resistance;
    private int score;
    /**
     * Constructor de la clase MainBubble
     */
    public MainBubble()
    {
        super(9.8F, 1,"");
        score = 0;
        resistance = 0;
    }
    
    /**
     * Act - do whatever the MainBubble wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        super.act();
        moveBubble();
        detectRebote();
        removeBubbleResistance();
        removeBubbleScore();
        updateCounters();
    }
    
    /**
     * updateCounters - actualiza la informacionde los contadores de resistencia y 
     * puntuacion para que se muestre en la pantalla 
     */
    public void updateCounters()
    {
          World mundo = this.getWorld();
          World1 myWorld =(World1) mundo;
          myWorld.getCounterScore().setValue(score);
          myWorld.getCounterRes().setValue(resistance);
    }
    
    
    /**
     * moveBubble - El metodo mueve la burbuja dependiendo de la direccion del viento
     */
    public void moveBubble()
    {
        if(isTouching(Ventilador.class)) {
           Actor ventNew;
           ventNew = new Ventilador();
           ventNew = getOneIntersectingObject(Ventilador.class);  
           setRotation( ventNew.getRotation());
           move(1);
        }

    }
    /**
     * detectRebote - el metodo detecta si la burbuja reboto con algo
     */
    public void detectRebote()
    {
       World world;
       world = getWorld();
       
       if(getX() == world.getWidth()) {
       
        if(getRotation() < 90 && getRotation() > 0) {
               setRotation(getRotation()+180);
        }
        
        else if(getRotation() < 180 && getRotation() > 90) {
               setRotation(getRotation() + getRotation());
        }    
       }
      
       if(getY() == world.getHeight()) {
       
        if(getRotation() < 359 && getRotation() > 275) {
               setRotation(getRotation()+180);
        }
        
        else if(getRotation() < 275 && getRotation() > 180) {
               setRotation(getRotation() + getRotation());
        }    
       }
    }
    
    /**
     * removeBubbleResistance - Elimina un objeto de la clase BubbleResistance si lo
     * toca eincrementa resistance
     */
    public void removeBubbleResistance()
    {        
        if(isTouching(BubbleResistance.class)) {
            removeTouching(BubbleResistance.class);
            resistance++;
        }
    }
    
    /**
     * removeBubbleScore - Elimina un objeto de la clase Score si lo
     * toca y incrementa Score
     */
    public void removeBubbleScore()
    {        
        if(isTouching(BubbleScore.class)) {
            removeTouching(BubbleScore.class);
            score++;
           
        }
    }
}
