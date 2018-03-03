import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Grape here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Grape extends Actor
{
    private GreenfootImage image;
    private int ySpeed;
public Grape(int speed){
        image = new GreenfootImage("grape.png");
        image.scale(52,54);
        setImage(image);
        ySpeed = speed;
    }
    public void act() 
    {
     setLocation(getX(), getY() + ySpeed);
     if(isAtEdge()){
         Lv1 myworld = (Lv1)getWorld();
         myworld.removeObject(this);
    }    
}
}