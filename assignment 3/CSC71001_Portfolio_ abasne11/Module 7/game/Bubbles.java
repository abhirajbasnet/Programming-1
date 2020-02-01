import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bubbles here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bubbles extends Actor
{
    public Bubbles()
    {
    GreenfootImage myImage = getImage();
    int myNewHeight = (int)myImage.getHeight()/5;
    int myNewWidth = (int)myImage.getWidth()/5;
    myImage.scale(myNewWidth, myNewHeight);
     }

    
    /**
     * Act - do whatever the Bubbles wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX()-2, getY());
        turn(1);
        if (getX() == 0)
        {
        getWorld().removeObject(this);
        }
    }    
}
