import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Play here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Play extends Actor
{
    /**
     * Act - do whatever the Play wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage img;
    public Play(){
    img = new GreenfootImage("Play.png");
    img.scale(100,50);
    setImage(img);
}

    public void act() 
    {
     if(Greenfoot.mouseClicked(this)){
         Greenfoot.setWorld(new Lv1());
        }
    }    
}
