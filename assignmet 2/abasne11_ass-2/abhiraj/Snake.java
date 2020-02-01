import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Snake here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Snake extends Actor
{
    /**
     * Act - do whatever the Snake wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     int rightSideOfScreen;
        int bottomOfScreen;
    public void addedToWorld (World background)
    {
        rightSideOfScreen = background.getWidth() -1;
        bottomOfScreen = background.getHeight() -1;
    }
          
        public void act() 
        {
        move (20);
        randomTurn();
        lookForFrog();
        
        
    } 
    
    /*
     * sanke moves in random direction to catch the frog
     */
    public void randomTurn()
    {
    if (Greenfoot.getRandomNumber(20)==1)
        {
        setRotation(Greenfoot.getRandomNumber(360));
        }
        int x = getX();
        int y = getY();
        if (x<=0 || y<=0 || x >= rightSideOfScreen || y >= bottomOfScreen)
        {
        turn(180);
        }
    }
    
    /*
     * sanke eats the frog when it catch it
     */
    public void lookForFrog()
    {
    if (isTouching(Frog.class))
        {
         removeTouching(Frog.class);
         Greenfoot.stop();
         
        }
    }
}
