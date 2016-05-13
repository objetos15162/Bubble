import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BubbleWorld here.
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
        ScoreBotton scorebotton = new ScoreBotton();
        addObject(scorebotton,888,386);
        levelbotton.setLocation(78,348);
        playbotton.setLocation(345,346);
        helpbotton.setLocation(571,342);
        scorebotton.setLocation(799,343);
    }
}
