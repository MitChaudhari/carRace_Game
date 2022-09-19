import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * This is the sign that will pop up when checkCollison equal ture. "Game Over" So the player can reset and play again.
 * @author (Mitansh CHaudhari) 
 * @version (5/8/20)
 */
public class GameOver extends Actor
{
    /**
     * Act - do whatever the GameOver wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public GameOver()
    {
        setImage(new GreenfootImage("GAME OVER!!!",48,Color.WHITE, Color.BLACK));
    }
}
