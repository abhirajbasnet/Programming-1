import greenfoot.*;

/**
 * This class defines a crab. Crabs live on the beach.
 */

public class Crab extends Actor
{
   private int wormsEaten;
   private GreenfootImage image1;
   private GreenfootImage image2;
    public Crab()
    {
        wormsEaten =0;
        image1 = new GreenfootImage("crab.png");
        image2 = new GreenfootImage("crab2.png");
        setImage(image1);
    }
    
   /**
    * Crabs to whateever it likes 
    */
    public void act()
    {
        move(5);
        turnAtEdge();
        lookForworm();
        switchImage();
        checkKeypress();
        
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
   
    /**
     * there is the change in the animation of the crab
     */
    public void switchImage()
    {
    if (getImage()==image1)
        { 
            setImage(image2);
        }
        else
        {
        setImage(image1);
        }
    }
    
    /**
     * crab is being controlled by the key press
     */
    public void checkKeypress()
    {
        if (Greenfoot.isKeyDown("right")|| Greenfoot.isKeyDown("d") )
        {
        turn(10);
        
        }
        
        if (Greenfoot.isKeyDown("left")|| Greenfoot.isKeyDown("a") )
        {
        turn(-10);
        }
        
        if (Greenfoot.isKeyDown("up")|| Greenfoot.isKeyDown("w"))
        {
        turn(-10);
        }
        
        if (Greenfoot.isKeyDown("down")|| Greenfoot.isKeyDown("s"))
        {
        turn(10);
        }  
    }
    private int score;
    /*when the crab touches the worm remove the worm
    * if not do nothing
    */
    public void lookForworm()
    {
    if ( isTouching(Worm.class))
        {
            removeTouching(Worm.class);
            wormsEaten = wormsEaten + 1;
            score = score + 1;
            getWorld().showText("Score:" +score, 80,25);
            if (wormsEaten == 8)
            {
                Greenfoot.playSound("fanfare.wav");
                Greenfoot.stop();
            }
        }
    } 
}