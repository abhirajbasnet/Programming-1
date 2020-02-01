import greenfoot.*;

/**
 * This is a stick man. Make him run and jump.
 * 
 * @abasne11 (23531855) 
 * 30/01/2020
 */
public class Stickman extends Actor
{
    /**
     * Make the stickman act.
     */
    public void act() 
    {    
        move(3); //the stick man moves to the right of the screen
       moveifSpace();
       gameOver();
      
        
    } 
    
    public void gameOver() 
     {
         ///if it is at the edge the game stops and gave over sound plays
         if (isAtEdge())
         {
            Greenfoot.stop();
            Greenfoot.playSound("sound.wav");
         }
      }
     
     private void moveifSpace()
     {
         //if space is press it moves left otherwise continues to move right 
         //randomly
         if (Greenfoot.isKeyDown("space"))
        {
            move(Greenfoot.getRandomNumber(11)* -1);
        }
        else
        {
            move(Greenfoot.getRandomNumber(11));
        }
     }
    
}



    

