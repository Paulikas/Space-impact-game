import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Victory here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Victory extends Actor
{
    /**
     * Act - do whatever the Victory wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        move(-2);
        if(isTouching(Rocket.class))
        {
            Greenfoot.setWorld(new Space());
            
        }
    }    
}