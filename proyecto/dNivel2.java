import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class dNivel2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class dNivel2 extends World
{

    /**
     * Constructor for objects of class dNivel2.
     * 
     */
    public dNivel2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        pinta_mundo();
    }

    private void pinta_mundo()
    {
        addObject(new dJug(), 400, 550);
        addObject(new hEnem(), 600, 550);
    }
    
}
