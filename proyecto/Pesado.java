import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pesado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pesado extends Actor
{
    private int op = 0;
    private int nivel = 0;
    /**
     * Act - do whatever the Pesado wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Pesado(int ra)
    {
        op = ra;
    }

    public void act() 
    {
        // Add your action code here.
        if(op == 1)
        {
            setImage("pesadoH.png");
            nivel = 5;
        }
        else if(op == 2)
        {
            setImage("pesadoH_d.png");
            nivel = 6;
        }
        entraP();
    }

    private void entraP()
    {
        int niv = 0;
        niv = nivel;
        if(nivel == 5)
        {
            if(Greenfoot.mouseClicked(this))
            {
                Greenfoot.setWorld(new hNivel3());
                Greenfoot.playSound("Protoss_Probe.wav");
            }
        }
        if(nivel == 6)
        {
            if(Greenfoot.mouseClicked(this))
            {
                Greenfoot.setWorld(new dNivel3());
                Greenfoot.playSound("Protoss_Probe.wav");
            }
        }
    }
}
