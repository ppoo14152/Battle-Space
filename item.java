import greenfoot.*;

/**
 * Write a description of class asteroide here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class item extends Actor
{
    private int vida=4;
    private int timer = 0;
    private Nave nave;
    /**
     * Act - do whatever the asteroide wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act() 
    {
       move(-5);
       if (this.atWorldEdge()==true)
        {
           World world;
           world = getWorld();
          
           world.removeObject(this);
           return;
        }   
    
       if(isTouching(Nave.class))
       {
          getWorld().addObject(new explosion(),getX(), getY()); 
       }      
    }    
    
    /**
     * Crea una bandera para verificar que esta al final del mundo 
     */
    public boolean atWorldEdge()
    {
        
        if (getX() == 0)
        {
            return true;
        } 
        else 
        {
            return false;
        }
    }
}