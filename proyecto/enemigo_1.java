import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class enemigo_1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class enemigo_1 extends Actor
{
    int rand=Greenfoot.getRandomNumber(400);
    int dir = 1;
    int cont = 0;
    /**
     * Act - do whatever the enemigo_1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        cont++;
        mov_rand();
        muevete();
        dispara();
        //salta();//Pendiente
        //usaCarta();//Pendiente
    }

    protected void mov_rand()
    {
        int accion=Greenfoot.getRandomNumber(40000);
        if(accion==1)
        {
            muevete();
        }
        if(accion==2)
        {
            muevete();
        }
        if(accion==40000)
        {
            dispara();
        }
        if(accion==4)
        {
            muevete();
        }
        if(accion==5)
        {
            mov_rand();
        }
    }

    protected void muevete()
    {
        int band_dir = Greenfoot.getRandomNumber(40);
        switch(band_dir)
        {
            case 1:
            setImage("space_pirates2.png");
            setLocation(getX()+20,getY());
            dir = 1;
            break;
            case 2:
            setImage("space_pirates1.png");
            setLocation(getX()-20,getY());
            dir = 2;
            break;
        }

    }
    private void dispara()
    {
        getWorld().addObject(new bala_enem(dir),getX(),getY());
    }
    /*protected void salta()
    {
    }
    protected void usaCarta()
    {
    }*/
}
