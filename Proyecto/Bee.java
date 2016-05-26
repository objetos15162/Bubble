import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


/**
 *La clase Obstacle es una subclase definida para eliminar ciertos
 *objetos de la clase bubble
 *
 * @author Pedro Negretee
 * @author German Isai
 * @version 30/04/2016
 */
public class Bee extends Obstacle
{
    private int initPosX;
    private int initPosY;
    private String direction;
    /**
     * Act - do whatever the Bee wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        deleteBubbles();
        moveBeeUpDown();
        move(-4);
    }    
    /**
     * deleteBubbles - Elimina burbujas si choca con ellas 
     */
    public void deleteBubbles()
    {   
       Actor myAct ;
        
        
          if(isTouching(MainBubble.class)) {
          World mundo = this.getWorld();
          WorldPlay myWorld =(WorldPlay) mundo;
          

          if(myWorld.getCounterRes().getValue() == 0 ) {
            endGame();
          }
          else {
             myAct = getOneIntersectingObject(MainBubble.class);
             MainBubble myBubb = (MainBubble) myAct;
             myBubb.decreaseResistance();
          }
           setLocation(getX(),getWorld().getHeight()+200); 
          
          }
            
      }
     
     
     /**
      * moveBeeUpDown- Mueve la abeja hacia arriba y hacia abajo
      */
     public void moveBeeUpDown()
     {
         
         if(Greenfoot.getRandomNumber(20)<10) {
         setLocation(getX(),getY()+2);
         }
         else {
         setLocation(getX(),getY()-2);
        }
             
        
     }
}
