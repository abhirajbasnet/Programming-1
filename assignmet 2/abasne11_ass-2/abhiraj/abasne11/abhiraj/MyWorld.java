import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    GreenfootSound Music = new GreenfootSound("background.mp3");
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Fly fly = new Fly();
        addObject(fly,129,86);
        Fly fly2 = new Fly();
        addObject(fly2,413,74);
        Fly fly3 = new Fly();
        addObject(fly3,494,104);
        Fly fly4 = new Fly();
        addObject(fly4,372,190);
        Fly fly5 = new Fly();
        addObject(fly5,252,133);
        Fly fly6 = new Fly();
        addObject(fly6,167,238);
        Fly fly7 = new Fly();
        addObject(fly7,60,237);
        Fly fly8 = new Fly();
        addObject(fly8,153,345);
        Fly fly9 = new Fly();
        addObject(fly9,376,334);
        Fly fly10 = new Fly();
        addObject(fly10,523,278);
        Frog frog = new Frog();
        addObject(frog,366,151);
        Snake snake = new Snake();
        addObject(snake,244,228);
        frog.setLocation(228,87);
        snake.setLocation(244,290);
        frog.setLocation(86,129);
        Snake snake2 = new Snake();
        addObject(snake2,491,353);
        Fly fly11 = new Fly();
        addObject(fly11,468,62);
        Fly fly12 = new Fly();
        addObject(fly12,420,175);
        Fly fly13 = new Fly();
        addObject(fly13,270,41);
        Fly fly14 = new Fly();
        addObject(fly14,60,66);
        Fly fly15 = new Fly();
        addObject(fly15,75,313);
        Fly fly16 = new Fly();
        addObject(fly16,171,164);
        Fly fly17 = new Fly();
        addObject(fly17,297,220);
        Fly fly18 = new Fly();
        addObject(fly18,413,289);
        Fly fly19 = new Fly();
        addObject(fly19,518,204);
        Fly fly20 = new Fly();
        addObject(fly20,340,102);
        Fly fly21 = new Fly();
        addObject(fly21,276,344);
        snake.setLocation(253,283);
        removeObject(snake);
        Fly fly22 = new Fly();
        addObject(fly22,230,270);
    }
    
    public void act()
    {
       Music.play();
    }
}
