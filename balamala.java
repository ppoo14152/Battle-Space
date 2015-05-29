import greenfoot.*;

/**
 * Esta parte es la referiada hacia la bala del enemigo, en donde se elimina del mundo para que haya una mejor interaccion
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class balamala extends Actor
{
    /**
     * Act - do whatever the balamala wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
      
        move(-4);
       if (this.atWorldEdge()==true)
        {
           World world;
           world = getWorld();
           world.removeObject(this);
           return;
        }
    } 
    
    /**
     *  Parte donde se crea la bandera, de cuando se encuentra en el borde del mundo
     */   
    public boolean atWorldEdge()
    {
       { 
     if (getX() == 0) 
     {
            return true;
     } else 
     {
            return false;
     }
    }
        // Agrega tus códigos de acción aquí.
    }    
    
    }   