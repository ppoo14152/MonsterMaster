import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TheBackGround here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TheBackGround extends World
{
    protected String nombre;
    /**
     * Constructor for objects of class TheBackGround.
     * 
     */
    public TheBackGround()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        addObject(new jugador(), 400, 550);
        addObject(new enemigo_1(), 600, 550);
    }
}
