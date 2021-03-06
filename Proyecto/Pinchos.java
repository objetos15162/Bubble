import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


/**
 *La clase Obstacle es una subclase definida para eliminar ciertos
 *objetos de la clase bubble
 *
 * @author Pedro Negretee
 * @author German Isai
 * @version 30/04/2016
 */
public class Pinchos extends Obstacle
{
    private String dirPincho;
    private GreenfootImage imagePincho;
    
    /**
     * Constructor de la clase Pinchos
     */
    public Pinchos(String directionPincho)
    {
        super();
        dirPincho = directionPincho;
        if( dirPincho == "up") {
             imagePincho = new GreenfootImage("pinchosUp.png");
        }
        else if( dirPincho == "down") {
             imagePincho = new GreenfootImage("pinchosDown.png");
        }
        setImage(imagePincho);
    }
    
    /**
     * Act - do whatever the Pinchos wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(-2);
        deleteBubbles();
        super.act();
    }
    
    /**
     * deleteBubbles - Elimina burbujas si choca con ellas 
     */
    public void deleteBubbles()
    {   
       Actor myAct ;
        
       
        if(isTouching(BubbleResistance.class)) {
            myAct = getOneIntersectingObject(BubbleResistance.class);
            BubbleResistance myBubb = (BubbleResistance)myAct;
            
            if( myBubb.getDirection() == "down" && dirPincho == "up" || myBubb.getDirection() == "up" && dirPincho == "down") {
                 removeTouching(BubbleResistance.class);
            
            }
            
        }
        
        if(isTouching(BubbleScore.class)) {
            myAct = getOneIntersectingObject(BubbleScore.class);
            BubbleScore myBubb = (BubbleScore)myAct;
            
            if( myBubb.getDirection() == "down" && dirPincho == "up" || myBubb.getDirection() == "up" && dirPincho == "down") {
                 removeTouching(BubbleScore.class);
         
            }  
        }
        
             
        if(isTouching(BubblePlus.class)) {
            myAct = getOneIntersectingObject(BubblePlus.class);
            BubblePlus myBubb = (BubblePlus)myAct;
            
            if( myBubb.getDirection() == "down" && dirPincho == "up" || myBubb.getDirection() == "up" && dirPincho == "down") {
                 removeTouching(BubblePlus.class);
               
            } 
        }
        
          if(isTouching(MainBubble.class)) {
          World mundo = this.getWorld();
          WorldPlay myWorld =(WorldPlay) mundo;
               
          if(myWorld.getCounterRes().getValue() == 0 ) {
             System.out.println(myWorld.getCounterRes().getValue());
             
             endGame();
          }
          else if(myWorld.getCounterRes().getValue() >  0) {
              
             myAct = getOneIntersectingObject(MainBubble.class);
             MainBubble myBubb = (MainBubble) myAct;
             myBubb.decreaseResistance();          
          }
          setLocation(getX(),getWorld().getHeight()+200); 
          
        }
     }
     
      /**
      * getDirectionPincho - Regresa una cadena con la direccion del pincho 
      * ya sea "up" o "down".
      * @Return dirPincho - Direcciondel pincho.  
      */
      public String getDirectionPincho()
      {
            return dirPincho;
      }
  
          
}
