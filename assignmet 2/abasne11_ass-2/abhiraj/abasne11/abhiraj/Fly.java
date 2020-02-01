import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fly here.
 * 
 * @abhiraj 
 * @v.1
 */
public class Fly extends Actor
{
    /**
     * Act - do whatever the Fly wants to do. This method is called whenever
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
        
        move (10);
        randomTurn();
        
           
    } 
    
    
    /*
     * fly flies in th random direction 
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
}
