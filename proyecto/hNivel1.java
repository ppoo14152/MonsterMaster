import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TheBackGround here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class hNivel1 extends World
{
    private int mundo = 0;
    private int hiterInicio = 0;
    //private Counter puntaje = new Counter("Puntos: ");
    /**
     * Constructor for objects of class TheBackGround.
     * 
     */
    public hNivel1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        pinta_mundo();
    }

    private void pinta_mundo()
    {
        addObject(new jugLight(), 400, 550);
        addObject(new enemLight(), 600, 550);
    }
    /*public void sumaPuntos(int p)
    {
        puntaje.setValue(p);
        
    }*/
}
