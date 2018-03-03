import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boom2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boom2 extends Actor
{
   private GreenfootImage img;
    private int ySpeed;
    public Boom2(int speed){
        img = new GreenfootImage("Boom.png");
        img.scale(50,50);
        setImage(img);
        ySpeed = speed;
        
    }

    public void act() {
       setLocation(getX(), getY()+ySpeed);
       if(isAtEdge()){
         Lv1 myworld = (Lv1)getWorld();
         myworld.removeObject(this);
}
}
}
