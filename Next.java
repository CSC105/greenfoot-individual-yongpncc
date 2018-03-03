import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Next here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Next extends Actor
{
    private GreenfootImage img = new GreenfootImage("Next.png");
    private int count = 0;
    /**
     * Act - do whatever the Next wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Next(){
        img.scale(120,47);
        setImage(img);
    }
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
            count++;
        getCount();
    }    
    public int getCount(){  //Check click of mouse
        return count;
    }
}
