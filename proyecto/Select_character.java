import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Select_character here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Select_character extends World
{
    //private int raza;
    /**
     * Constructor for objects of class Select_character.
     * 
     */
    public Select_character()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        //raza = c;
        select();
    }
    public void select()
    {
        addObject(new Pesado(), 150, 350);
        addObject(new Medio(), 400, 350);
        addObject(new Ligero(), 650, 350);
    }
}
