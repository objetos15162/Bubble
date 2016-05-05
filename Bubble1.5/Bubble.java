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
    
    /**
     * Asigna los valores principales de cada burbuja
     * @param gravity Resistencia a la gravedad
     * @param burst Resistencia a reventarse
     */
    public Bubble(float gravity, float burst)
    {
        gravityResistance = gravity;
        burstStrength = burst;
    }
    
    /**
     * Act - do whatever the Bubble wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        turn(1);
    }
    
    /**
     * @return gravityResistance Resistencia a la gravedad
     */
    public float getGravityResistance()
    {
        return gravityResistance;
    } 
}
