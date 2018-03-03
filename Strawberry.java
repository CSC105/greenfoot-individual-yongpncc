import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Strawberry here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Strawberry extends Actor
{
    private GreenfootImage img;
    private int ySpeed;
    public Strawberry(int speed){
        img = new GreenfootImage("Strawberry.png");
        setImage(img);
        ySpeed = speed;
        
    }
    public void act() 
    {
       setLocation(getX(), getY()+ySpeed);
       if(isAtEdge()){
         Lv1 myworld = (Lv1)getWorld();
         myworld.removeObject(this);
        }
    }    
}
