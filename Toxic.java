import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Toxic here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Toxic extends Actor
{
   private GreenfootImage image;
   private int ySpeed;
   public Toxic(int speed){
    image = new GreenfootImage("Toxic.png");
    setImage(image);
    ySpeed = speed;
}
public void act() 
    {
        setLocation(getX(), getY()+ySpeed);
       if(isAtEdge()){
            Lv1 myworld =(Lv1)getWorld();
            myworld.removeObject(this);
        }
    }    
}
