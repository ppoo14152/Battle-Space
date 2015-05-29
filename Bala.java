import greenfoot.*;

/**
 * En esta parte es donde se crea y denota la creacion de la bala asi como sus movimientos para que puedan coincidir con 
 * los de el personaje y el de los enemigos 
 * @Juan de Jesús Méndez Muñoz
 * @Battle Wars v1.6 28/Mayo/2015
 */
public class Bala extends Actor
{
    private int coo=0;
    /**
     * Act - do whatever the bala wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
        move(10);
       if (this.atWorldEdge()==true)
        {
           World world;
           world = getWorld();
           world.removeObject(this);
           return;
        }
     
       if(isTouching(Enemigo.class))
       {
          removeTouching(Enemigo.class);
      
          getWorld().addObject(new explosion(),getX(), getY());
          ((start)getWorld()).aumCounter();
       }    
    } 
    
    /**
     * Validacion que verifica si se encuentra en el borde y manda una "bandera" para poder saber como interactuar
     * 
     */
    public boolean atWorldEdge()
    {
        if (getX() > getWorld().getWidth() - getImage().getWidth() || getY() > getWorld().getHeight() - getImage().getHeight())    
     
        {    
            return true;    
        }    
        else   
        {    
            return false;
        }    
    }
}