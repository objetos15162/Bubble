import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Pantalla para seleccionar un nivel especifico
 * 
 * @author Pedro Negrete, Isai Tovar
 * @version 24/05/2016
 */
public class Level extends World
{

    /**
     * Constructor for objects of class Level.
     * 
     */
    public Level()
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
        ReturnBotton returnbotton = new ReturnBotton();
        addObject(returnbotton,55,492);
        returnbotton.setLocation(55,492);
        BottonLevel1 bottonlevel1 = new BottonLevel1();
        addObject(bottonlevel1,129,241);
        BottonLevel2 bottonlevel2 = new BottonLevel2();
        addObject(bottonlevel2,441,248);
        bottonlevel2.setLocation(438,235);
        BottonLevel3 bottonlevel3 = new BottonLevel3();
        addObject(bottonlevel3,780,241);
        bottonlevel3.setLocation(773,239);
        BottonLevel4 bottonlevel4 = new BottonLevel4();
        addObject(bottonlevel4,139,431);
        bottonlevel4.setLocation(131,424);
        returnbotton.setLocation(942,481);
    }
}
