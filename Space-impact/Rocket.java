import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rocket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rocket extends Actor
{
    public int counter=5;
    /**
     * Act - do whatever the Rocket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    //public static boolean instantiated = false;
    
    public void act() 
    {
        // Add your action code here.
        setLocation(getX(), getY());
        World w=getWorld();
        if(Greenfoot.isKeyDown("left"))
        {
            move(-7);
        }
                if(Greenfoot.isKeyDown("right"))
        {
            move(7);
        }
        if(Greenfoot.isKeyDown("up"))
        {
            turn(-90);
            move(7);
            turn(90);
        }
        if(Greenfoot.isKeyDown("down"))
        {
            turn(90);
            move(7);
            turn(-90);
        }
        if(Greenfoot.isKeyDown("x"))
        {
            //Greenfoot.delay(2);
            //instantiated=true;
            counter--;
            if(counter==0){
            w.addObject(new Bullet(), getX(), getY());
            counter=5;
        }
        }
        if(isTouching(Enemy.class))
        {
            Greenfoot.stop();
            w.addObject(new Skull(), getX(), getY());
            w.addObject(new GameOver(), w.getWidth()/6, w.getHeight()/2);
        }
        if(isTouching(Mine.class))
        {
             Greenfoot.stop();
            w.addObject(new Skull(), getX(), getY());
            w.addObject(new GameOver(), w.getWidth()/6, w.getHeight()/2);
        }
    }    
}
