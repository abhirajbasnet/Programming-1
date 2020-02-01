import greenfoot.*;  // (Actor, World, Greenfoot, GreenfootImage)

public class CrabWorld extends World
{
    /**
     * Create the crab world (the beach). Our world has a size 
     * of 560x560 cells, where every cell is just 1 pixel.
     */
    public CrabWorld() 
    {
        super(560, 560, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
  
        Crab crab = new Crab();
        addObject(crab,111,374);
        Pelican pelican = new Pelican();
        addObject(pelican, 62,159);
        Pelican pelican2 = new Pelican();
        addObject(pelican2 = pelican2,278,249);
        Pelican pelican3 = new Pelican();
        addObject(pelican3 = pelican3,172,508);
        Worm worm = new Worm();
        addObject(worm, 462,52);
        Worm worm2 = new Worm();
        addObject(worm2, 96,129);
        Worm worm3 = new Worm();
        addObject(worm3, 426,260);
        Worm worm4 = new Worm();
        addObject(worm4, 303,395);
        Worm worm5 = new Worm();
        addObject(worm5, 61,494);
        Worm worm6 = new Worm();
        addObject(worm6, 445,526);
        
        
        
    }
}