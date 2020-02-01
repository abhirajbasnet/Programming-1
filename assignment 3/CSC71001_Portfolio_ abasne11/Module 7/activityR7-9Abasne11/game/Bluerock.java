import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bluerock here.
 * 
 * @abasne11 ( 23531855)
 * @31/01/2020
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
    Shark shark = new Shark();
    addObject(shark, 430,312);
    Fish fish = new Fish();
    addObject(fish, 100, 198);
    Seahorse seahorse = new Seahorse();
        addObject(seahorse, 462,52);
        Seahorse seahorse2 = new Seahorse();
        addObject(seahorse2, 96,129);
        Seahorse seahorse3 = new Seahorse();
        addObject(seahorse3, 426,260);
        Seahorse seahorse4 = new Seahorse();
        addObject(seahorse4, 303,395);
        Seahorse seahorse5 = new Seahorse();
        addObject(seahorse5, 61,494);
        Seahorse seahorse6 = new Seahorse();
        addObject(seahorse6, 445,526);
        Seahorse seahorse7 = new Seahorse();
        addObject(seahorse7, 471,382);
        Seahorse seahorse8 = new Seahorse();
        addObject(seahorse8, 284,77);  
    }
}
