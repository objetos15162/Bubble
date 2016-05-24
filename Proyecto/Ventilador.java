import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Sirve para dar dirección a la burbuja, su movimiento es a base del drone
 * 
 * @author Isai Tovar
 * @version 24/05/2016
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
        addedToWorld(getWorld());
    }
    
    /**
     * Act - do whatever the Ventilador wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        giraVentilador();
        enciendeVentilador();
        apagaVentilador();
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
            turn(4);
        }
        if(Greenfoot.isKeyDown("s")) {
            turn(-4);
        }
        
    }
}
