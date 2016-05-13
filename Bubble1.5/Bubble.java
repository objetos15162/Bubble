import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bubble here.
 * 
 * @author Pedro Negrete
 * @version 30/04/2016
 */
 public class Bubble extends Actor
{
    private float gravityResistance;
    private float burstStrength;
    private String direction;
    
    
    /**
     * Asigna los valores principales de cada burbuja
     * @param gravity Resistencia a la gravedad
     * @param burst Resistencia a reventarse
     */
    public Bubble(float gravity, float burst,String direction)
    {
        gravityResistance = gravity;
        burstStrength = burst;
        this.direction = direction; 
    }
    
    /**
     * Act - do whatever the Bubble wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
        /*if(detectRebote()) {
          moveUp();
        }*/    
    }
    
    /**
     * setDirection - pone una direccion de la burbuja
     */
    public void setDirection(String direction)
    {
        this.direction = direction; 
    }
     
    /**
     * getDirection - Regresa la direccion de la burbuja
     */
    public String getDirection()
    {
        return direction; 
    }
    
    
    /**
     * @return gravityResistance Resistencia a la gravedad
     */
    public float getGravityResistance()
    {
        return gravityResistance;
    } 
    
    /**
     * moveUpIsKeyDown -  eleva la burbuja  
     */  
    public void moveUpIsKeyDown()
    {
        if(Greenfoot.isKeyDown("up")){
            setLocation(getX(),getY()-1);
        }
    }
    
    /**
     *  falling - Hace que la burbuja caiga libremente
     */
    public void falling()
    {
        World mundo = getWorld();
        WorldPlay subMundo = (WorldPlay)mundo;
        if(getGravityResistance() < subMundo.getGravity() && direction == "down") {
            setLocation(getX(),getY() - Math.round(getGravityResistance() - subMundo.getGravity()));
        }
    }
    
    /**
     *  moveUp - El metodo mueve hacia arriba a la burbuja
     */
    public void moveUp()
    {
        if( direction == "up") {
             setLocation(getX(),getY()-1);
        }
    }
}
