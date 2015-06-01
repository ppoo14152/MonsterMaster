import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Demonios here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Demonios extends Actor
{
    private int op = 0;
    /**
     * Act - do whatever the Demonios wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this))
        {
            op = 2;
            Greenfoot.setWorld(new Select_character(op));
            Greenfoot.playSound("Protoss_Probe.wav");
        }
    }    
}
