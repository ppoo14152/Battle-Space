import greenfoot.*;

/**
 * Crea la explosion de los Enemigos, como la de el Personaje
 * 
 * @Juan de Jesús Méndez Muñoz 
 * @ Battle Wars v1.6 28/Mayo/2015
*/
public class explosion extends Actor
{
    private int count=0;
    /**
     * Act - hace lo que explosion quiere hacer. Este método se llama "cuando quiera" o whenever
     * los botones 'Actuar or 'Ejecutar' son presionados en el entorno.
     */
    public void act() 
    {
        count ++;
        
        if(count ==30)
        {
            World world;
            world = getWorld();
            world.removeObject(this);
            return;
        }
    }
}
