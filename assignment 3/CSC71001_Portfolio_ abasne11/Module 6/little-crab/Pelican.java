import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * pelican is for the hungry crab
 * 
 * @Abasne11(23531855)
 * @V.01
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
    //if (Greenfoot.getRandomNumber(100)<50 ){//turn 1% of the time //turn(30);}
    turnTowards(Greenfoot.getRandomNumber(402),400);
    
    }



    
    }

