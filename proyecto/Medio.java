import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Medio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Medio extends Actor
{
    private int op = 0;
    private int nivel = 0;
    /**
     * Act - do whatever the Pesado wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Medio(int ra)
    {
        op = ra;
    }
    public void act() 
    {
        // Add your action code here.
        if(op == 1)
        {
            setImage("medioH.png");
            nivel = 3;
        }
        else if(op == 2)
        {
            setImage("medioH_d.png");
            nivel = 4;
        }
        entraM();
    }
    private void entraM()
    {
        int niv = 0;
        niv = nivel;
        if(nivel == 3)
        {
            if(Greenfoot.mouseClicked(this))
            {
                Greenfoot.setWorld(new hNivel2());
                Greenfoot.playSound("Protoss_Probe.wav");
            }
        }
        if(nivel == 4)
        {
            if(Greenfoot.mouseClicked(this))
            {
                Greenfoot.setWorld(new dNivel2());
                Greenfoot.playSound("Protoss_Probe.wav");
            }
        }
    }  
}
