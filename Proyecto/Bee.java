import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


/**
 * Write a description of class Bee here.
 * 
 * @author Pedro Negrete 
 * @version (a version number or a date)
 */
public class Bee extends Obstacle
{
    private int move;
    private int direction;
    
    /**
     * Constructor de la clase Bee
     */
    public Bee()
    {
        move = Greenfoot.getRandomNumber(2);
        direction = 1;
    }
    
    /**
     * Act - do whatever the Bee wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(move == 1){
            moveHorizontal();
        }else{
            moveVertical();
        }
    }
    
    /**
     * moveHorizontal- Se encarga del movimiento de las abejas en las que su 
     * variable move fue 1, estas se moveran horizontalmente
     */
    public void moveHorizontal()
    {
        setLocation(getX()+1, getY());
    }
    
    /**
     * moveVertical- Se encarga del movimiento de las abejas en las que su 
     * variable move fue diferente de 1, estas se moveran verticalmente
     */
    public void moveVertical()
    {
        if(getY() > 10 && direction == 1){
            setLocation(getX(),getY()-1);
        }else if(getY() <= 10){
            direction = 0;
        }
        if(getY()<500 && direction ==0){
            setLocation(getX(),getY()+1);
        }else if(getY()>=500){
            direction = 1;
        }
    }

}
