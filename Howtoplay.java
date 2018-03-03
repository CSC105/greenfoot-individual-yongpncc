import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Howtoplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Howtoplay extends World
{
    private Next next = new Next();
    private Play play = new Play();
    /**
     * Constructor for objects of class Howtoplay.
     * 
     */
    public Howtoplay()
    {    
        super(450, 452, 1); 
    }
    public void act(){
        pics();
        
    }
    public void pics(){
        if(next.getCount()==0){  
            setBackground("Howtoplay.png");
            addObject(next,374,403);  //position of next
        }
        if(next.getCount()==1){
            setBackground("Howtoplay2.png");
            removeObject(next);
            addObject(play,394,416);  //position of play
        }
    }
}
