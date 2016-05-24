import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Obstaculo del tipo árbol
 * 
 * @author Isai Tovar 
 * @version 24/05/2016
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
