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
    
   private GreenfootImage image1;
   private GreenfootImage image2;
   public Shark()
    {
        image1 = new GreenfootImage("image1.png");
        image2 = new GreenfootImage("image2.png");
        setImage(image1);
     }
    
    public void act() 
    {
        move (30);
        randomTurn();
        isAtEdge();
        switchImage();
        
    
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
    /**
     * there is the change in the animation of the shark
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
}


