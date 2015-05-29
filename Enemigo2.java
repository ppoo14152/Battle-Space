import greenfoot.*;

/**
 * Escribe una descrición de la clase enemigo2 aquí.
 * 
 * @autor (tu nombre) 
 * @versión (Un número de versión o una fecha)
 */
public class Enemigo2 extends Actor
{
    
   private int vida=10;
    /**
     * Act - hace lo que enemigo2 quiere hacer. Este método se llama "cuando quiera" o whenever
     * los botones 'Actuar or 'Ejecutar' son presionados en el entorno.
     */
    public void act() 
    {
       
        move(-1);
        
        if(isTouching(Nave.class))
        {
    removeTouching(Nave.class);
    getWorld().addObject(new explosion(),getX(), getY());
    getWorld().addObject(new muerte(),400,400);
        
    }    
        
        if(isTouching(Bala.class)){
    removeTouching(Bala.class);  
    ((start)getWorld()).aumCounter();
    ((start)getWorld()).aumCounter();
    vida=vida-1;
        
    }    
        
    if(vida==0){
        World world;
           world = getWorld();
           world.removeObject(this);
           return;
    }    
}
         
    }