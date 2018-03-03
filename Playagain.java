import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Playagain here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Playagain extends Actor
{
    private GreenfootImage img = new GreenfootImage("Playagain.png");
    public Playagain(){
        img.scale(100,50);
        setImage(img);
    }
    
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
            Greenfoot.setWorld(new Begin());
    }    
}
