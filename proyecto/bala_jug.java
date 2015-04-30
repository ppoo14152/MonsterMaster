import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bala_jug here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bala_jug extends jugador
{
    private int band_dir;
    public bala_jug(int dir)
    {
        band_dir = dir;
    }

    /**
     * Act - do whatever the bala_jug wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        muevete();// Add your action code here.
    }

    protected void muevete()
    {
        int band = Greenfoot.getRandomNumber(4);
        int x = getX(), y = getY();
        if(band_dir == 1)
        {
            switch(band)
            {
                case 1:
                //setImage("Balajug1.png");
                setLocation(x+20,y);
                break;
            }
            if(isAtEdge())
            {
                getWorld().removeObject(this);
            }
        }
        if(band_dir == 2)
        {
            switch(band)
            {
                case 1:
                setImage("Balajug1_i.png");
                setLocation(x-20,y);
                break;
            }
            if(isAtEdge())
            {
                getWorld().removeObject(this);
            }
        }
    }
}
