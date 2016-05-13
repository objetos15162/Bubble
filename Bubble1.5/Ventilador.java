import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ventilador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ventilador extends Actor
{
    private GreenfootImage ventiladorOn;
    private GreenfootImage ventiladorOff;
    private int angleRotation;
    /**
     * Constructor de la clase Ventilador
     */
    
    public Ventilador()
    {
        super();   
        ventiladorOn = new GreenfootImage("ventEnc.png");
        ventiladorOff = new GreenfootImage("vent.png");
        angleRotation = 0;
    }
    
    /**
     * Act - do whatever the Ventilador wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        giraVentilador();
        moveRight();
        moveLeft();
        moveUp();
        moveDown();
        enciendeVentilador();
        apagaVentilador();
        //setImage(ventilador);
        
    }
    
    /**
     * enciendeVentilador - cambia la imagen y prende ventilador 
     */
    public void enciendeVentilador()
    {
        if(Greenfoot.isKeyDown("d")) {
            setImage(ventiladorOn);
        }
    }
    
    /**
     * apagaVentilador - cambia la imagen y apaga ventilador
     */
    public void apagaVentilador()
    {
        if(Greenfoot.isKeyDown("f")) {
            setImage(ventiladorOff);
        }
    }
    /**
     * giraVentilador - Gira la turbina si se presiona una tecla 
     */
    public void giraVentilador()
    {
        if(Greenfoot.isKeyDown("a")) {
            turn(1);
        }
        if(Greenfoot.isKeyDown("s")) {
            turn(-1);
        }
        
    }
    
    /**
     * moveRight - mueve el ventilador al en funcion del Dron hacia la derecha. 
     */
    public void moveRight()
    {
        if(Greenfoot.isKeyDown("right")){
            setLocation(getX()+2,getY());    
        }
    }
    
    /**
     * moveLeft-  mueve el ventilador al en funcion del Dron hacia la derecha.
     */  
    public void moveLeft()
    {
        if(Greenfoot.isKeyDown("left")) {
            setLocation(getX()-2,getY()); 
        }
    }
    
        /**
     * moveUp -  eleva el dron  
     */  
  
    public void moveUp()
    {
        if(Greenfoot.isKeyDown("up")){
            setLocation(getX(),getY()-1);
        }
    }
    
    /**
     * moveDown - hace descender el dron
     */  
    public void moveDown()
    {
        if(Greenfoot.isKeyDown("down")){
            setLocation(getX(),getY()+4);
        }
    }
    

    
    
}
