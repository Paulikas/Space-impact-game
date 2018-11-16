import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    public int hp=5;
    
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    //public int getHp(){return hp;}
    //public void setHp(int hp){this.hp=hp;}
    public void act() 
    {
        // Add your action code here.
         World w=getWorld();
        move(-3);
        Rocket b=new Rocket();
        Bullet a=new Bullet();
        if(isAtEdge())
        {
            w.removeObject(this);
        }
        /*if (isTouching(Bullet.class))
        {
            hp--;
            w.removeObject(a);
            if(hp==0)
            {
                w.removeObject(this);
                hp=5;
            }
        }*/
    }    
    public void setHp(int sk){hp=sk;}
    public int getHp(){return hp;}
}
