import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 *La clase MainBubble es una subclase de Bubble esta subclase de Bubble 
 *representa la burbuja principal del juego y tiene metodos para  
 *incrementar su tamaño o decrementarlo, eliminar otras burbujas, e ir acumulando 
 *puntuacion y resistencia
 *
 * @author Pedro Negretee
 * @author German Isai
 * @version 30/04/2016
 */
public class MainBubble extends Bubble 
{
    private int resistance;
    private int score;
    private ArrayList < GreenfootImage > images;//almacena una coleccion de imagenes de la burbuja de diferentes tamaños
    private int sizeBubble;
    private GreenfootSound bubbleSound;
    /**
     * Constructor de la clase MainBubble
     */
    public MainBubble()
    {
        //llamada al constructor de la superclase e inicializacion de variables
        super(9.8F, 1,"");
        score = 0;
        resistance = 0;
        sizeBubble = 0;
        images = new ArrayList < GreenfootImage>();
        bubbleSound = new GreenfootSound("bubbleSound.mp3");
        addImages();
    }
    
    /**
     * addImages - agrega ala  en la coleccion "images" varias imagenes de 
     * distintos tamaños de la burbuja.
     */
    public void addImages()
    {
        int numImage = 0; 
        for(; numImage <= 10 ; numImage++) {
           images.add(new GreenfootImage("bubbleTam"+numImage+".png"));
        }
    }
    
    /**
     * setSizeBubble - pone un tamaño para la burbuja.
     * @param newSize - es el nuevo tamalo de la burbuja
     */
    public void setSizeBubble(int newSize)
    {
        sizeBubble = newSize;
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
        decreaseSizeBubble();
        if(isTouching(Pinchos.class) && resistance > 0) {
            resistance--;
        }
        
        if(isTouching(BubblePlus.class)) {
             bubbleSound.play();
            removeTouching(BubblePlus.class);
            increaseSizeBubble();
        }
        
        if( getRotation() <  180 ) {
            super.setDirection("down");
        }
        else {
            super.setDirection("up");
        }    
        
        updateCounters();
        
    }
    
    /**
     * updateCounters - actualiza la informacionde los contadores de resistencia y 
     * puntuacion para que se muestre en la pantalla 
     */
    public void updateCounters()
    {
          World mundo = this.getWorld();
          WorldPlay myWorld =(WorldPlay) mundo;
          myWorld.getCounterScore().setValue(score);
          myWorld.getCounterRes().setValue(resistance);
          myWorld.getCounterRes().updateBar();
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
           move(2);
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
           bubbleSound.play();
            removeTouching(BubbleResistance.class);
            if(resistance <10) {
              resistance++;
            }
        }
    }
    
    /**
     * removeBubbleScore - Elimina un objeto de la clase Score si lo
     * toca e incrementa Score
     */
    public void removeBubbleScore()
    {        
        if(isTouching(BubbleScore.class)) {
           bubbleSound.play();
            removeTouching(BubbleScore.class);
            score++;
           
        }
    }
    
    
    /**
     * icreaseSizeBubble - incrementa el tamaño de la burbuja
     */
    public void increaseSizeBubble()
    {
        if(sizeBubble < 10) {
           sizeBubble++;    
           setImage(images.get(sizeBubble));
        }
    }
    
    /**
     * getDirection - Regresa la direccion de la burbuja
     */
    public String getDirection()
    {
        return super.getDirection(); 
    }
    
    /**
     * decreaseSizeBubble - disminuye el tamaño de la burbuja
     */
    public void decreaseSizeBubble()
    {
        if(isTouching(Pinchos.class) && sizeBubble > 0 && resistance > 0) {
           Actor newAct;
           newAct = getOneIntersectingObject(Pinchos.class);
           Pinchos myAct = (Pinchos)newAct;
           
           if(myAct.getDirectionPincho() == "up" && super.getDirection() == "down" 
                                || myAct.getDirectionPincho() == "down" && super.getDirection() == "up")
            resistance--;    
           setImage(images.get(sizeBubble));               
        }

    }
    
    /**
     * decreaseResistance - Disminuye la resistencia 
     */
    public void decreaseResistance()
    {
        resistance--;
    }
    
}
