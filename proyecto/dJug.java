import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class dJug here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class dJug extends Actor
{
    private int salto = 10;
    private int contDisp = 0;
    private int disp = 0;
    private int puntos = 0;
    private int mundo = 0;
    private int jump = -20;
    private int verticalSpeed = 5;
        
    /**
     * Act - do whatever the jugador wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        mover();
        checkFall();
    }

    protected void mover()
    {
        int i;
        int x = getX();
        int y = getY();
        int band_dir=1;
        int band_mov = 1;
        int band = Greenfoot.getRandomNumber(4000);
        getWorld().addObject(new vidaJugador(disp), 200 , 100 );
        Actor bala = getOneIntersectingObject(bala_enem.class);
        if (Greenfoot.isKeyDown("Right"))
        {
            setLocation(getX()+1,getY());
            band_dir = 1;
        }
        if (Greenfoot.isKeyDown("Left"))
        {
            setLocation(getX()-1,getY());
            band_dir = 2;
        }
        if (Greenfoot.isKeyDown("Space"))
        {
            
            if(onGround())
            {
                verticalSpeed = jump; 
                fall();                
            }

        }

        if(Greenfoot.isKeyDown("F"))
        {
            getWorld().addObject(new bala_jug(band_dir),x,y);
            
        }
        if(Greenfoot.isKeyDown("escape"))
        {
            Greenfoot.setWorld(new Menu());
        }
        if(isTouching(bala_enem.class))
        {
            if(bala != null)
            {
                disp++;
                //puntos= puntos - 10;
                if(disp == 7)
                {
                    Greenfoot.setWorld(new gameOver());
                }
                //sumaPuntos(puntos);
            }
            removeTouching(bala_enem.class);
        }
        System.out.println("Contador de disparo: " + disp);
    }

    private void fall()
    {
        setLocation(getX(),getY() + verticalSpeed);
        verticalSpeed = verticalSpeed + 2;
    }

    private boolean onGround()
    {
        if(getY()>=550)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    private void checkFall()
    {
        if(onGround())
            verticalSpeed = 0;
        else
            fall();
    }
}
