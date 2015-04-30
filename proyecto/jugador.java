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
        int band_dir = 1;
        int band_salto = 0;
        int band_mov = 1;
        int band_disp = 0;
        int band_p = 0;
        int band = Greenfoot.getRandomNumber(4000);
        if (Greenfoot.isKeyDown("Right"))
        {
            switch(band_mov)
            {
                case 1:
                setImage("Samus_MovDer2.png");
                break;
                case 2:
                setImage("Samus_MovDer8.png");
                band_mov=1;
                break;
            }
            setLocation(getX()+1,getY());
            band_dir = 1;
        }
        if (Greenfoot.isKeyDown("Left"))
        {
            setImage("Samus_Aran2.png");
            setLocation(getX()-1,getY());
            band_dir = 2;
        }
        if (Greenfoot.isKeyDown("Space"))
        {
            if(band_dir == 1)
            {
                setImage("Samus_Salto_r.png");
            }
            if(band_dir == 2)
            {
                setImage("Samus_Salto_i.png");
            }
            switch(band)
            {
                case 1:
                setLocation(getX(),getY()-10);
                band_salto++;
                if(band_salto==4000)
                {
                    setLocation(x,y);
                }
                break;
            }

        }
        if(Greenfoot.isKeyDown("F"))
        {
            getWorld().addObject(new bala_jug(band_dir),x,y);
            Greenfoot.delay(10);
        }
        if(Greenfoot.isKeyDown("escape"))
        {
            Greenfoot.setWorld(new Menu());
        }
    }
}
