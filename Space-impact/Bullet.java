import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Actor
{
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        World w=getWorld();
        move(12);
        Enemy enemy=new Enemy();
        //Rocket b=new Rocket();
        int counter;
        if(isAtEdge())
        {
            w.removeObject(this);
            
            //Rocket.instantiated = false;
        }
        else
        if(isTouching(Mine.class))
        {
            w.removeObject(this);
            //Rocket.instantiated = false;
        }
        else
        if(isTouching(Enemy.class)){
            removeTouching(Enemy.class);
            w.removeObject(this);
        }
    }    
    public void turnB(int x)
    {
        turn(x);
    }
}
