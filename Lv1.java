import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lv1 extends World
{
    private Flamingo1 flamingo = new Flamingo1();
    private GreenfootImage img,img2;
    private GreenfootSound music,music2;

    private int count = 0; 
    static int score = 0;
    private int level=1;
    private boolean checklevel;
    public Lv1(){    
        super(450, 452, 1);  //set size of picture
        music = new GreenfootSound("Havana.mp3");
        music2 = new GreenfootSound("HowLong.mp3");
        checklevel = false;   //use for change the level
        score=0;
        addObject(flamingo, getWidth()/2, 400);   //position Flamingo(Center)
    }

    public void act(){
        music();
        background();
        score();
        Life();
        count++; 
        item();
    }

    private void item(){
        if(level==1){
            if(count%30==0){
                addObject(new Orange(5), Greenfoot.getRandomNumber(450),0);
                addObject(new Toxic(6), Greenfoot.getRandomNumber(450),0);
            }
            if(count%40==0){
                addObject(new Grape(7), Greenfoot.getRandomNumber(450),0);
            }
            if(count%60==0){
                addObject(new Boom(7), Greenfoot.getRandomNumber(450),0);
            }
            
        }
        if(level==2){
            if(count%30==0){
                addObject(new Orange(7), Greenfoot.getRandomNumber(450),0);
                addObject(new Toxic(6), Greenfoot.getRandomNumber(450),0);
            }
            if(count%40==0){
                addObject(new Grape(7), Greenfoot.getRandomNumber(450),0);
            }
            if(count%80==0){
                addObject(new Toxic(6), Greenfoot.getRandomNumber(450),0);
            } 
            if(count%65==0){
                addObject(new Strawberry(11), Greenfoot.getRandomNumber(450),0);
                addObject(new Boom(6), Greenfoot.getRandomNumber(450),0);
            }
            if(count%90==0){
                addObject(new Boom(7), Greenfoot.getRandomNumber(450),0);
            }
        }
    }

    private void background(){   //set background of each level
        img = new GreenfootImage("Background.jpg");
        img.scale(450,452);
        img2 = new GreenfootImage("LV2.jpg");
        img2.scale(450,452);    

        if(level==1){
            setBackground(img);
        }
        if(level==2){
            setBackground(img2);
        }
    }

    private void music(){
        if(level == 1 && checklevel == false){
            checklevel=true;
            music.play();
        }
        if(music.isPlaying()==false && level == 1){   //if music stop and level1
            level = 2;     //set to level2
            checklevel = false;    //change from level 1 to level 2
        }
        if(level == 2 && checklevel == false){
            checklevel = true;
            music2.play();
        }
        if(music2.isPlaying()==false && level == 2){
            if(score == 0)
                gameOver();
            else
                Winner();
        }
    }

    private void score(){
        if(score<=0)  //score will not minus score
            score=0;
        showText("Score: " + score + " ", 400, 30);   //show score(score,x,y)
    }

    public void Life(){
        showText("Life: " + flamingo.getLife() + " ", 300, 30);
    }

    public void gameOver(){
        music.stop();
        music2.stop();
        score();
        Greenfoot.setWorld(new gameOver(score));
    }

    public void Winner(){
        music.stop();
        music2.stop();
        Greenfoot.setWorld(new Winner(score));
    }
}

