import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
import java.awt.Color;

/**
 * Escribe una descrición de la clase nave aquí.
 * 
 * @autor (tu nombre) 
 * @versión (Un número de versión o una fecha)
 */
public class Nave extends Actor
{   int x=200;
    int y=200;
    public int vida=5;
    private int timer=0;
    private int counter=0;
    private int counters=0;
    private int count=0;
    private int counts=0;
    private int c=0;
    public int co=0;
    private int co1=0;
    public int especial=0;
    /**
     * Parte mas importante en la cual se denotan la mayoria de las funnciones que emplea el jugador asi 
     * como algunas de las funciones principales que interactuan junto con el jugador como el item, los enemigos, etc.
     * en esta funcion se verifican los puntos que se tiene que estar tomando en cuenta para poder verificar el paso de los 
     * niveles
     * asi como las validaciones de que si los enemigos estan tocando alguna bala del personaje o viceversa
     */
    
    public void act()
    { 
        timer++;
        counter++;
        count++;
        counts++;
        counts++;
        
        if (especial==1)
        {
            c++;
        }

        if(vida==0)
        {
            World world;

            getWorld().addObject(new explosion(),getX(), getY());
            getWorld().addObject(new muerte(),400,400);
            world = getWorld();
            world.removeObject(this);   
           return; 
        }
        
        if(isTouching(Enemigo.class))
        {
            vida--;
     
        }
    
        if(isTouching(Enemigo3.class))
        {
            vida--;
        }
     
        if(isTouching(Enemigo2.class))
        {
            vida--;
        }
 
    
        if(isTouching(item.class))
        {
            especial=1;    
        }
    
        if(isTouching(balamala.class))
        {
            vida=vida-1;
            removeTouching(balamala.class);
      
        }    
  

        if (count > 80)
        //spawn a Goat every 400 act-cycles (about 7 seconds with speed at 50)
        {
            getWorld().addObject(new item(), 800, Greenfoot.getRandomNumber(500));
            count=0;
        }
      
        if (counts > 180)
        //spawn a Goat every 400 act-cycles (about 7 seconds with speed at 50)
        {
            getWorld().addObject(new Enemigo3(), 800,Greenfoot.getRandomNumber(700));
            counts=0;
        }
        
        if (counter > 250)
        //spawn a Goat every 400 act-cycles (about 7 seconds with speed at 50)
        {   
            getWorld().addObject(new Enemigo2(), 800,Greenfoot.getRandomNumber(700));
            counter=0;
        }
    
        if (timer > 100)
        //spawn a Goat every 400 act-cycles (about 7 seconds with speed at 50)
        {
            //((start)getWorld()).cambia_imagen();
            getWorld().addObject(new Enemigo(), 800, Greenfoot.getRandomNumber(700));
            timer=0;
        }

   
        if (Greenfoot.isKeyDown ("space") && counter>10)
        {
            Greenfoot.playSound("disparo.mp3");
            if(especial==0)
            {
                getWorld().addObject(new Bala(), getX()+10, getY());
                counter=0;
            }
            else
            {
                if(counters<50)
                {
                    getWorld().addObject(new balaespecial(), getX()+10, getY());
                    counters++;
                }
                else
                {
                   especial=0;
                   counters=0;
                }
            }
        }
   
        if (Greenfoot.isKeyDown ("right"))  
        {
            setLocation(getX() +5, getY());
        }
        
        if (Greenfoot.isKeyDown ("left"))  
        {
            setLocation(getX()-5, getY());
        
        }
       
        if (Greenfoot.isKeyDown ("down"))  
        {
            setLocation(getX(), getY()+5);
        }

        if (Greenfoot.isKeyDown ("up"))  
        {
            setLocation(getX(), getY()-5);
        }
    }
    
    /**
     * Crea bandera para verificar si esta a las orillas del mundo 
     */
    public boolean atWorldEdge()
    {
        if(vida==0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}