import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * pelican is for the hungry crab
 * 
 * @Abasne11(23531855)
 * 30/01/2020
 */
public class Pelican extends Actor
{
    /**
     * Act - do whatever the Pelican wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move (30);
        randomTurn();
        isAtEdge();
        lookForCrab();
        
    }  
     /*
      * if the felican is at edge move a bit far
     */
     public void turnAtEdge()
     {
       if(isAtEdge())
        turn(45);
    }

    
    
    /*
     * random direction for the pelican
     */
      public void randomTurn()
    {   
    //if (Greenfoot.getRandomNumber(100)<1 ){//turn 1% of the time //turn(30);}
    turnTowards(Greenfoot.getRandomNumber(402),200);
    
    }



    /*
     * when the pelican catch the crab it will satisfy its hunger
      * and remove the crab and stops the program
     */
     public void lookForCrab()
     {
    if (isTouching(Crab.class))
    {removeTouching(Crab.class);
    Greenfoot.stop();
    Greenfoot.playSound("fanfare.wav");
    
    
    }
    }
}
