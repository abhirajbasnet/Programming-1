import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Frog here.
 * 
 * @abhiraj
 * @v.0
 */
public class Frog extends Actor
{
    /**
     * Act - do whatever the Frog wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int FlyEaten;
    GreenfootSound eatFood = new GreenfootSound("eating.wav");
    
   public Frog()
   {
       FlyEaten = 0;
    }
    
    public void act() 
    {
        
        //move (6);
        
        lookForFly();
        checkKeypress();
        
    
        
    } 
    ///removing food piece
    public void lookForFly()
    {
        if (isTouching(Fly.class))
            {
             removeTouching(Fly.class);
             FlyEaten = FlyEaten + 1;
             eatFood.play();
            }    
    }
    
    public void checkKeypress()
    {
        if (Greenfoot.isKeyDown("right")|| Greenfoot.isKeyDown("d") )
        {
        move(10);
        }
        if (Greenfoot.isKeyDown("left")|| Greenfoot.isKeyDown("a") )
        {
        move(-10);
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
   
}
