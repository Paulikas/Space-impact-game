import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bomb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bomb extends Actor
{
    
    /**
     * Act - do whatever the Bomb wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(-2);
        Rocket a=new Rocket();
        World w=getWorld();
        Bullet b1=new Bullet();
        Bullet b2=new Bullet();
        Bullet b3=new Bullet();
        Bullet b4=new Bullet();
        Bullet b5=new Bullet();
        if(!getObjectsInRange(500, Rocket.class).isEmpty())
        {
            
            w.addObject(b1,getX(), getY());
            b1.turnB(45);
            w.addObject(b2,getX(), getY());
            b2.turnB(72);
            w.addObject(b3,getX(), getY());
            b3.turnB(144);
            w.addObject(b4,getX(), getY());
            b4.turnB(216);
            w.addObject(b5,getX(), getY());
            b5.turnB(288);
            w.removeObject(this);
        }
        
    }    
}
