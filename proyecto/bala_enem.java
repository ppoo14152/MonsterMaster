import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bala_enem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bala_enem extends enemigo
{
    private int band_dir = 0;
    public bala_enem(int d)
    {
        if(d!=0)
        {
            band_dir = d;
        }
        else
        {
            band_dir = 2;
        }
    }

    /**
     * Act - do whatever the bala_jug wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public void act() 
    {
        mueveBenem();// Add your action code here.
        checaColision();
    }

    protected void mueveBenem()
    {
        int band = Greenfoot.getRandomNumber(1);
        int x = getX(), y = getY();
        if(band_dir== 1)
        {
            switch (band)
            {   
                case 0:
                setLocation(x+20,y);
                break;
            }
        }
        if(band_dir==2)
        {
            switch (band)
            {   
                case 0:
                setLocation(x-20,y);
                break;
            }
        }
    }
    private void checaColision()
    {
        Actor a = this.getOneIntersectingObject(bala_jug.class);
        if(a != null )
        {
            //getWorld().removeObject(this);
            this.getWorld().removeObject(a);
        }
        if(isAtEdge())
        {
            getWorld().removeObject(this);
        }
    }
}
