import greenfoot.*;

/**
 * Este enemigo tendra la particularidad de ser resistente hasta a 3 disparos, por lo cul si no se cumple con esta condicional
 * seguira creando dificultad hacia el personaje,
 * 
 * @autor (tu nombre) 
 * @versión (Un número de versión o una fecha)
 */
public class Enemigo3 extends Actor
{ int vida=3;
   private int counter=0;
    /**
     * Act - Aqui se realizar la validacion de que si el personaje entra en contacto con alguna de las balas de personaje
     * asi respetando la condicion de que este objeto solo se destruira solo si se tienen 3 disparos el enemigo
     * de lo contrario seguira afectando al personaje y al jugador
     * 
     * los botones 'Actuar or 'Ejecutar' son presionados en el entorno.
     */
    public void act() 
    {  
        counter++;
       move(-2);
       if (this.atWorldEdge()==true)
        {
           World world;
           world = getWorld();
          
           world.removeObject(this);
           return;
        }
 
        if(isTouching(Nave.class))
        {
            removeTouching(Nave.class);
            getWorld().addObject(new explosion(),getX(), getY());
            getWorld().addObject(new muerte(),400,400);
        }    
        
        if(isTouching(Bala.class))
        {
            removeTouching(Bala.class); 
            ((start)getWorld()).aumCounter();
            ((start)getWorld()).aumCounter();
            ((start)getWorld()).aumCounter();
            vida=vida-1;
        
        }    
        
        if (counter>20)
        {
            getWorld().addObject(new balamala(), getX()-20, getY());
            counter=0;
        }
    
        if(vida==0)
        {
            World world;
            world = getWorld();
            world.removeObject(this);
            return;
           
        }    
}
    
        public boolean atWorldEdge()
        {
            { 
                if (getX() == 0) {
                    return true;
                } else {
            return false;
        }
    }
        // Agrega tus códigos de acción aquí.
    } 
        // Agrega tus códigos de acción aquí.
}    

