import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Portada here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Portada extends World
{
    public int band;
    /**
     * Constructor for objects of class Portada.
     * 
     */
    public Portada()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        addObject(new Presentacion(), 400, 300);
        Greenfoot.playSound("WeWerentAngels.mp3");
        //Imprimir la portada de nombres y esperar al usuario
    }
}
