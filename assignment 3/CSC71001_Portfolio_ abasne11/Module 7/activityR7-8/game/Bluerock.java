import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bluerock here.
 * 
 * @Abasne11(23531855) 
 * @31/01/2019
 */
public class Bluerock extends World
{

    private int score;
    private int time;
    GreenfootSound Music = new GreenfootSound("background.wav");
    
    /**
     * Constructor for objects of class Bluerock.
     * 
     */
    public Bluerock()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        setPaintOrder(Bubbles.class);
        score = 0;
        time = 2000;
        showScore();
        showTime();
        prepare();
        setup();
        
    }
    public void act()
    {
       
    if (Greenfoot.getRandomNumber(100)<3)
    {
        addObject(new Bubbles(), 549, Greenfoot.getRandomNumber(360));
    }
    countTime();
    Music.play();
    }
    /**
     * adding points to our current score.
     */
    public void addScore(int points)
    {
    score = score + points;
    showScore();
    if (score < 0)
    {
        Greenfoot.playSound("sound.wav");
        Greenfoot.stop();
    }
    
    }
    /**
     * showing the current score on the screen
     */
    private void showScore()
    {showText("Score:" + score, 80, 25);
    }
    /**
     * count down the time and displaying it.
     */
    private void countTime()
    {
      time--;
      showTime();
      if (time ==0)
      {
        showEndMessage();
        Greenfoot.stop();
        }
    }
    /**
     * showing the remaining time on the screen
     */
    private void showTime()
    {
    showText("Time: " + time, 500, 25);
    }
    /**
     * Showing the end-of-game message on screen.
     */
    private void showEndMessage()
    {
        showText("Time is up - you win!", 390, 150);
        showText("Your final score: " + score + " points", 390, 170);
    }
    private void prepare()
    {
    Fish fish = new Fish();
    addObject (fish, 147,316);
    }
    private void setup()
    {
    int i = 0;
    while (i < 10)
    {
    Seahorse seahorse = new Seahorse();
    //addObject ( seahorse, 100, 40);
    addObject(seahorse, i*40 + 40,50);
    i = i + 1;
    }
    int z = 0;
    while (z < 3)
    {
    Shark shark = new Shark();
    //addObject ( shark, 100, 40);
    addObject(shark, 450, z * 40  +200);
    z = z + 1;
    
    }
}
}
