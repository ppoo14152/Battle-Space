import greenfoot.*;

/**
 * Aqui es la raiz de la Bala especial, que es la que se activa cuando se esta tomando algun item dentro del mundo
 * asi como se lleban acabo la eliminacion de los enemigos a los cuales les haga llegado algun disaparo por parte 
 * del personaje.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class balaespecial extends Actor
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
        
        if(isTouching(Enemigo2.class))
        {
            removeTouching(Enemigo2.class);
      
            getWorld().addObject(new explosion(),getX(), getY());
            ((start)getWorld()).aumCounter();
        
        } 
        
        if(isTouching(Enemigo3.class))
        {
            removeTouching(Enemigo3.class);
      
            getWorld().addObject(new explosion(),getX(), getY());
            ((start)getWorld()).aumCounter();
        
        } 
    } 
       
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
