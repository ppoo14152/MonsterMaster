import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bala_jug here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bala_jug extends jugador
{
    private int band_dir = 0;
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
        setImage("Balajug1.png");
        muevete();// Add your action code here.
        checaColision();
    }

    protected void muevete()
    {
        int band = Greenfoot.getRandomNumber(1);
        int x = getX(), y = getY();
        if(band_dir == 1)
        {
            switch(band)
            {
                case 0:
                //setImage("Balajug1.png");
                setLocation(x+20,y);
                break;
            }
        }
        if(band_dir == 2)
        {
            switch(band)
            {
                case 0:
                setImage("Balajug1_i.png");
                setLocation(x-20,y);
                break;
            }
        }

    }

    private void checaColision()
    {
        Actor a = this.getOneIntersectingObject(bala_enem.class);
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
