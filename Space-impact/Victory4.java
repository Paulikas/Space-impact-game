import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Victory4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Victory4 extends Actor
{
    /**
     * Act - do whatever the Victory4 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        World w= getWorld();
        
        move(-2);
        if(isTouching(Rocket.class))
        {
            Greenfoot.stop();
            w.addObject(new GameEnd(), w.getWidth()/6, w.getHeight()/2);
        }
    }    
}
