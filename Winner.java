import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Winner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Winner extends World
{
    private GreenfootImage image;
    public Winner(int score){    
        super(450, 452, 1);
        image = new GreenfootImage("Winner.png");
        image.scale(450,452);
        setBackground(image);
        showText("Score: "+score,225,244);
        addObject(new Playagain(),228,369);
    }
}
