import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class jugador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class jugador extends Actor
{
    public int milisegundos = 3000;
    public int salto = 10;
    /**
     * Act - do whatever the jugador wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        mover();
    }
    protected void mover()
    {
        int i;
        int x = getX();
        int y = getY();
        int band_dir = 0;
        int band_salto = 0;
        if (Greenfoot.isKeyDown("Right"))
        {
            setImage("Samus_Aran1.png");
            setLocation(getX()+1,getY());
            band_dir = 1;
        }
        if (Greenfoot.isKeyDown("Left"))
        {
            setImage("Samus_Aran2.png");
            setLocation(getX()-1,getY());
            band_dir = 2;
        }
        if (Greenfoot.isKeyDown("Up"))
        {
            if(band_salto == 0)
            {
                for(i=0;i<(milisegundos/2);i++)
                {
                    if(band_dir == 1)
                    {
                        setImage("Samus_Salto_r.png");
                    }
                    if(band_dir == 2)
                    {
                        setImage("Samus_Salto_i.png");
                    }
                    move(-1);
                }
                band_salto = 1;
            }
            else if( band_salto == 1)
            {
                setLocation(x,y);
            }
        }
    }
}
