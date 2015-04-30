import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bala_enem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bala_enem extends enemigo_1
{
    public int band_dir = 0;
    /**
     * Act - do whatever the bala_enem wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public bala_enem(int dir)
    {
        band_dir = dir;
    }
    public void act() 
    {
        mueveteBlEnm();// Add your action code here.
    }
    protected void mueveteBlEnm()
    {
        int band = Greenfoot.getRandomNumber(4);
        int x = getX(), y = getY();
        if(band_dir == 1)
        {
            switch(band)
            {
                case 1:
                //setImage("Balajug.png");
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
                //setImage("Balajug3.png");
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