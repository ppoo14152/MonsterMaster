import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class dNivel1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class dNivel1 extends World
{

    /**
     * Constructor for objects of class dNivel1.
     * 
     */
    public dNivel1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        pinta_mundo();
    }

    private void pinta_mundo()
    {
        addObject(new dJugLight(), 400, 550);
        addObject(new hEnemLight(), 600, 550);
    }
}
