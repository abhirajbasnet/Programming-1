import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Shark here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shark extends Actor
{
    /**
     * Act - do whatever the Shark wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    
   public void act() 
    {
        move (30);
        randomTurn();
        isAtEdge();
        lookForFish();
    
    }    
    
    
    /*
      * if the shark is at edge move a bit far
     */
     public void turnAtEdge()
     {
       if(isAtEdge())
        turn(45);
    }
    /*
     * random direction for the shark
     */
      public void randomTurn()
    {   
    //if (Greenfoot.getRandomNumber(100)<1 ){//turn 1% of the time //turn(30);}
    turn(Greenfoot.getRandomNumber(90)-45);
    
    }
    /*
     * when the pelican catch the crab it will satisfy its hunger
      * and remove the crab and stops the program
     */
     public void lookForFish()
     {
    if (isTouching(Fish.class))
    {removeTouching(Fish.class);
    Greenfoot.stop();
    Greenfoot.playSound("sound.wav");
    
    
    }
}
}



