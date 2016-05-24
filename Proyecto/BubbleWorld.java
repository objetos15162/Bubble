import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Pantalla principal, menú.
 * 
 * @author Pedro Negrete
 * @version 30/04/2016
 */
public class BubbleWorld extends World
{

    /**
     * Constructor for objects of class BubbleWorld.
     * 
     */
    public BubbleWorld()
    {   
        super(1000, 545, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        LevelBotton levelbotton = new LevelBotton();
        addObject(levelbotton,96,387);
        PlayBotton playbotton = new PlayBotton();
        addObject(playbotton,396,386);
        HelpBotton helpbotton = new HelpBotton();
        addObject(helpbotton,641,387);
        levelbotton.setLocation(78,348);
        playbotton.setLocation(345,346);
        helpbotton.setLocation(571,342);
        helpbotton.setLocation(695,355);
        playbotton.setLocation(317,517);
        levelbotton.setLocation(359,355);
        levelbotton.setLocation(360,352);
        helpbotton.setLocation(704,355);
        playbotton.setLocation(99,353);
        levelbotton.setLocation(359,356);
        playbotton.setLocation(97,359);
        helpbotton.setLocation(704,359);
        levelbotton.setLocation(359,359);
        levelbotton.setLocation(359,358);
        levelbotton.setLocation(366,352);
        levelbotton.setLocation(362,358);
    }
}
