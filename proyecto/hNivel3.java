import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nivel3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class hNivel3 extends World
{

    /**
     * Constructor for objects of class Nivel3.
     * 
     */
    public hNivel3()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        pinta_mundo();
    }

    private void pinta_mundo()
    {
        addObject(new jugador(), 400, 550);
        addObject(new enemPesado(), 600, 550);
    }
    
}
