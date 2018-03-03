import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Flamingo1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Flamingo1 extends Actor
{
    //Images
    GreenfootImage image1 = new GreenfootImage("Flamingo1.png");
    GreenfootImage image2 = new GreenfootImage("Flamingo12.png");
    GreenfootImage image3 = new GreenfootImage("Flamingo1F.png");
    GreenfootImage image4 = new GreenfootImage("Flamingo12-F.png");
    GreenfootImage image5 = new GreenfootImage("Boom2.png");
    //count
    int count=0;
    private int life = 300;

    public Flamingo1(){
        //resize flamingo
        image1.scale(70, 117);
        image2.scale(70, 117);
        image3.scale(70, 117);
        image4.scale(70, 117);
        image5.scale(120, 117);

        //default picture
        setImage(image1);
    }

    public void act()     {
        count++;
        walk();
        eat();
        Boom();
        //getLife();
    }

    private void walk(){
        if(Greenfoot.isKeyDown("Right")){   //move right   
            move(5);
            if(count%7==0)setImage(image2);
            else setImage(image1);
        }    
        if(Greenfoot.isKeyDown("Left")){   //move left
            move(-5);
            if(count%7==0)setImage(image4);
            else setImage(image3);
        }
    }

    private void eat(){
        if(isTouching(Orange.class)){   //if orange touch flamingo will increase score
            Lv1.score += 10;
            removeTouching(Orange.class);   //if orange is touch AtEdge will remove all 
        }
        if(isTouching(Toxic.class)){
            Lv1.score -= 30;   //decrease score
            Life(5);  //decrease 5 life
            removeTouching(Toxic.class);
        }
        if(isTouching(Grape.class)){   
            Lv1.score += 10;
            removeTouching(Grape.class); 
        }
        if(isTouching(Strawberry.class)){
            Lv1.score += 5;
            life += 3;
            removeTouching(Strawberry.class);
        }
    }

    public void Boom(){
        if(isTouching(Boom.class)){   
            Lv1 world = (Lv1)getWorld();
            setImage(image5);
            Greenfoot.delay(80);
            world.gameOver();
            
        }
        
    }
    public void Life(int d){
        life = life-d;
        if(life<=0){
            Lv1 world = (Lv1)getWorld();
            world.gameOver();
        }
    }

    public int getLife(){
        return life;
    }
}

