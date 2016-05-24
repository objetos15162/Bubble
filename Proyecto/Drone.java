import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Drone, sirve para darle movimiento a la burbuja y al ventilador
 * 
 * @author Pedro Negrete, Isai Tovar
 * @version 19/05/2016
 */
public class Drone extends ScrollActor
{
    private static final int MOVE_AMOUNT = 1;
    private GreenfootImage droneIzq;
    private GreenfootImage droneDer;
    private GreenfootImage drone;
    private Ventilador ventilador;
    
    /**
     * Este es el Constructor de Drone
     */
    public Drone()
    {
       super();
       droneIzq = new GreenfootImage("droneizq.png");
       droneDer = new GreenfootImage("droneder.png");
       drone = new GreenfootImage("drone.png");
       ventilador = new Ventilador();
    }
    
    /**
     * Act - do whatever the Drone wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act() 
    {
        moveRight();
        moveLeft();
        moveUp();
        moveDown();
        getWorld().moveCamera(MOVE_AMOUNT);
        //Greenfoot.delay(8);
        setImage(drone);
        turnTowards(getX(), getY());
        getWorld().setCameraDirection(getRotation());
    }
    
        /**
     * moveRight - mueve el Dron hacia la derecha y 
     * realiza la animacion del movimiento
     *
     */
    public void moveRight()
    {
        if(Greenfoot.isKeyDown("right")) {
            setImage(droneDer);
            move(2);  
            Greenfoot.delay(1);
            setImage(drone);
            setPosVentilador(2, 0);
        }
    }
    
    /**
     * moveLeft- mueve el Dron hacia la izquierda y 
     * realiza la animacion del movimiento
     */  
    public void moveLeft()
    {
        if(Greenfoot.isKeyDown("left")) {
            setImage(droneIzq);
            move(-2);

            Greenfoot.delay(1);
            setImage(drone);
            setPosVentilador(-2,0);
        }
    }
    
    /**
     * moveUp -  eleva el dron  
     */  
    public void moveUp()
    {
        if(Greenfoot.isKeyDown("up")) {
            setLocation(getX(),getY()-1);
            setPosVentilador(0,-1);
        }
    }
    
     /**
     * moveDown - hace descender el dron
     */  
    public void moveDown()
    {
        if(Greenfoot.isKeyDown("down")) {
            setLocation(getX(),getY()+4);
            setPosVentilador(0,4);
        }
    }
    
    /**
     * setPosVentilador - cambia la posicion en la que se encuentra el ventilador
     */
    public void setPosVentilador(int a, int b)
    {
        WorldPlay w = getWorldOfType(WorldPlay.class);
        ventilador = w.getVentilador();
        ventilador.setLocation(ventilador.getX()+a, ventilador.getY()+b);
    }
}
