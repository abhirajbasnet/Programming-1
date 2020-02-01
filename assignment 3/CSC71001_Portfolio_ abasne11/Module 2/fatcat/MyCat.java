import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * MyCat is your own cat. Get it to do things by writing code in its act method.
 * 
 * @author Abhiraj Basnet (23531855)
 * @version (01/30/2020)
 */
public class MyCat extends Cat
{
    /**
     * Act - do whatever the MyCat wants to do.
     */
    public void act()
    {
        move(4);
        eat();
        walkLeft(8);
        walkRight(9);
        hasCompany();
        dance();
        isSleepy();
        shoutHooray();
        wait(3);
        sleep(3);
        isAlone();
        turnAtEdge();
        checkkeypress();
        
    } 
    
    /**
     * if the fatcat is at the edge turn 45
     */
    public void turnAtEdge()
    {
    turn(45);
    }
    
    /**
     * fat cat moves to catch a mice
     */
    public void checkkeypress()
    {
    if(Greenfoot.isKeyDown("left"))
    turn(-4);
    if (Greenfoot.isKeyDown("right"))
    turn(4);
    }
}




