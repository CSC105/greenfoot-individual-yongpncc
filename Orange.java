import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Orange here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Orange extends Actor
{
private GreenfootImage image;
private int ySpeed;
public Orange(int speed){  
        image = new GreenfootImage("Orange.png");
        setImage(image);
        ySpeed = speed;
      
    }
    public void act() 
    {
     //move(5);  
     setLocation(getX(),getY()+ySpeed); //direction of orange fall
    if(isAtEdge()){   //method if orange touching border will remove object
         Lv1 myworld = (Lv1)getWorld();
         myworld.removeObject(this);
    }    
}
}
