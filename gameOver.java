import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gameOver extends World
{
    private GreenfootImage image;
    public gameOver(int score)
    {    
        super(450, 452, 1); 
        image = new GreenfootImage("GameOver.jpg");
        image.scale(450, 452);
        setBackground(image);
        showText("Score: "+score, 250,254);
        addObject(new Playagain(), 245, 320);
    }
}
