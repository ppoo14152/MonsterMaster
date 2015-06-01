import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boton_Jugar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boton_Jugar extends Actor
{
    /**
     * Act - do whatever the Boton_Jugar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new Select_class());
            Greenfoot.playSound("SC2_uiBNetToast.mp3");
        }
    }    
}
