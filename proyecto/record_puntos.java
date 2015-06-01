import greenfoot.*;  
import greenfoot.UserInfo; 
/**
 * Este crea los records de los jugadores y los coloca dentro de un espacio también es el que da 
 * el puntaje del mismo.
 */
public class record_puntos 
{
    private UserInfo jugador;
    
    public record_puntos() 
    { 
         
        if ((UserInfo.isStorageAvailable()) && (UserInfo.getMyInfo() != null)) 
        {
          this.jugador = UserInfo.getMyInfo();
        }
        
    }
    /**
     * Guarda los puntos en la tabla de recors.
     */
    public void guardaRecords(int puntos)
    {
         if((UserInfo.isStorageAvailable()) && (this.jugador != null) && ((puntos > this.jugador.getScore())) || (this.jugador.getInt(0))==0)
         { 
            this.jugador.setScore(puntos);
            this.jugador.setInt(0,1); 
            this.jugador.store();
        }
        
        if((UserInfo.isStorageAvailable()) && (this.jugador != null) && (puntos > this.jugador.getScore()))
        {
            this.jugador.setScore(puntos);
            this.jugador.setInt(0,1); 
            this.jugador.store();
        }
    }
}
