import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fish here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fish extends Actor
{
    private int seahorseEaten;
    /**
     * Act - do whatever the Fish wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(10);
        turnAtEdge();
        lookForSeahorse();
        checkKeypress();
    }    
    /*
    * if the fish is at the edge move a crab a bit far
    */
    public void turnAtEdge()
   {
    if (isAtEdge())
     { turn(45);
      }
    }
    /**
     * fish is being controlled by the key press
     */
    public void checkKeypress()
    {
        if (Greenfoot.isKeyDown("right")|| Greenfoot.isKeyDown("d") )
        {
        turn(45);
        
        }
        
        if (Greenfoot.isKeyDown("left")|| Greenfoot.isKeyDown("a") )
        {
        turn(-45);
        }
        
        if (Greenfoot.isKeyDown("up")|| Greenfoot.isKeyDown("w"))
        {
        turn(-45);
        }
        
        if (Greenfoot.isKeyDown("down")|| Greenfoot.isKeyDown("s"))
        {
        turn(45);
        }  

        }
        private int score;
    /*when the crab touches the worm remove the worm
    * if not do nothing
    */
    public void lookForSeahorse()
    {
    if ( isTouching(Seahorse.class))
        {
            removeTouching(Seahorse.class);
            seahorseEaten = seahorseEaten + 1;
            score = score + 1;
            getWorld().showText("Score:" +score, 80,25);
            if (seahorseEaten == 8)
            {
                Greenfoot.playSound("sound.wav");
                Greenfoot.stop();
            }
        }
    } 
 }