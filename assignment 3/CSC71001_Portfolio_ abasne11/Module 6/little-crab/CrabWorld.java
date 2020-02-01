import greenfoot.*;  // (Actor, World, Greenfoot, GreenfootImage)

public class CrabWorld extends World
{
    private int timer;
    private int score;
    /**
     * Create the crab world (the beach). Our world has a size 
     * of 560x560 cells, where every cell is just 1 pixel.
     */
    public CrabWorld() 
    {
        super(560, 560, 1);
        prepare();
        timer =500;
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
  
        score = 0;
        Crab crab = new Crab();
        addObject(crab,111,374);
        Pelican pelican = new Pelican();
        addObject(pelican, 170,188);
        Pelican pelican2 = new Pelican();
        addObject(pelican2 = pelican2,364,442);
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
        Worm worm7 = new Worm();
        addObject(worm7, 471,382);
        Worm worm8 = new Worm();
        addObject(worm8, 284,77);  
        
    }
    public void act()
    {
    timer = timer -1;
    showText("Time: " + timer,462,90);
    if (getTimer()<0)
    {
     Greenfoot.stop();
    }
    }
    public int getTimer()
    {
        return timer;
    }
   public void addscore(int points)
   {
    score = score + points;
    showText("SCORE:"+ score, 80,25);

    }
}
