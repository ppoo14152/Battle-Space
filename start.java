import greenfoot.*;
import java.util.*;
import java.awt.Color;

public class start extends World
{
    private int menu=0;
    private botton jug,back,reg;
    private int bandAr=1;
    private int bandAc;
    private Nave vida;
    private Counter cont1;

    /**
     * Constructor para objetos de clase start.
     * 
     */
    GreenfootSound music = new GreenfootSound("menu.mp3");
    public start()
    {    
        
        super(800, 600, 1); 
        menu();
        cont1 = new Counter();
        cont1.setPrefix("Puntos: ");
        addObject(cont1, 750, 580);
        
    }
    
    /**
     * Agrega el contador en el juego
     */
    public void aumCounter()
    {
        cont1.add(1);
    }
    
    /**
     * Metodo que cambia la imagen de fondo dentro del juego que denota el cambio de nivel 
     */
    public void cambia_imagen()
    {
        if (cont1.getValue()>10)
            setBackground("fondomundo2.jpg");
        
        if (cont1.getValue()>20)
            setBackground("fondomundo3.jpg");
            
            
    }

    public void act()
    {
        cambia_imagen();
        
    }

    public botton dameJug()
    {
        return jug;
    }

    public botton dameReg()
    {
        return reg;
    }
    
    /**
     * Metodo que crea el menu que nos da la imagen de inicio
     */
    public void menu()
    {
        bandAr=1;
        setBackground("fondomundo.jpg");
        jug=new botton("play.png");
        addObject(jug,400,300);
        addObject(new Mouse(),400,300);
        menu=1;
        
    }
    
    /**
     * Da la imagen del primer mundo o comienzo en el juego
     */
    public void nivel1()
    {

        menu=0;
        bandAc=1;
        setBackground("fondomundo.jpg");

        addObject(new Nave(),100,200);
      
    }
}
