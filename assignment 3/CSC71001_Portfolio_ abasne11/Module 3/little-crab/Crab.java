import greenfoot.*;

/**
 * This class defines a crab. Crabs live on the beach.
 */

public class Crab extends Actor
{
   private int wormsEaten;
    public Crab()
    {
        wormsEaten =0;
    }
    
   /**
    * Crabs to whateever it likes 
    */
    public void act()
    {
        move(5);
        turnAtEdge();
        getRandomNumber();
        lookForworm();
        
    }

   /*
    * if the crab is at the edge move a crab a bit far
    */
    public void turnAtEdge()
   {
    if (isAtEdge())
     { turn(45);
      }
    }
    /*
     * turning the crab in random direction
     */
    public void getRandomNumber()
    {
    if (Greenfoot.getRandomNumber(100) <10)
    {turn(Greenfoot.getRandomNumber(90)-45);
    
    }
    }
    /*when the crab touches the worm remove the worm
    * if not do nothing
    */
    public void lookForworm()
    {
    if ( isTouching(Worm.class))
        {
            removeTouching(Worm.class);
            wormsEaten = wormsEaten + 1;
            if (wormsEaten == 6)
            {
           
                Greenfoot.stop();
            }
        }
    } 
}