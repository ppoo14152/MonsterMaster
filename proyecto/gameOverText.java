import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gameOverText here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gameOverText extends World
{
    private int puntos = 0;
    /**
     * Constructor for objects of class gameOverText.
     * 
     */
    public gameOverText(int p)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        puntos = p;
        
        showText("Tu puntuación fue de: " + puntos, 400, 300);
        showText("Para salir apriete el siguiente boton",400,400);
        addObject(new botonSalirMenu(), 400, 490);
    }
}
