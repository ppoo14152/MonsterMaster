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
    /**
     * Act - do whatever the enemigo_1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        mov_rand();
        muevete();
        //dispara();//Pendiente
        //salta();//Pendiente
        //usaCarta();//Pendiente
    }

    protected void mov_rand()
    {
        int accion=Greenfoot.getRandomNumber(5);
        if(accion==1)
        {
            dispara();
        }
        if(accion==2)
        {
            dispara();
        }
        if(accion==3)
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
            setLocation(getX()+20,getY());
            dir = 1;
            break;
            case 2:
            setLocation(getX()-20,getY());
            dir = 2;
            break;
        }

    }
    protected void dispara()
    {
        int band_dir = Greenfoot.getRandomNumber(40);
        switch(band_dir)
        {
            case 1:
            new bala_enem();
            break;
        }
    }
    /*protected void salta()
    {
    }
    protected void usaCarta()
    {
    }*/
}
