import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


/**
 *La clase Obstacle es una subclase definida para eliminar ciertos
 *objetos de la clase bubble
 *
 * @author Pedro Negretee
 * @author German Isai
 * @version 30/04/2016
 */
public class Tree extends Obstacle
{
    /**
     * Act - do whatever the Arbol wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        move(-1);
        deleteBubbles();
        super.act();
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
              
            removeTouching(MainBubble.class); 
            endGame();

          }
        }
     }
}
