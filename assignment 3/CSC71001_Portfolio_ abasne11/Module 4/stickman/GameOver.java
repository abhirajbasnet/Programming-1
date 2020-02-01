import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (abasne11(23531855)) 
 * @version (a version number or a date)
 */
public class GameOver extends Actor
{
    /**
     * Act - do whatever the GameOver wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // check for game over
       World world = getWorld();       
        checkGameOver();
    }   
   
    public void checkGameOver()
    {
        if (isAtEdge())
        {
            Greenfoot.stop();
        }
        
    }    
}
