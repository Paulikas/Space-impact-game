import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cell here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cell extends World
{
    /**
     * Constructor for objects of class Cell.
     * 
     */
    public Cell()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(5000, 500, 1, false); 
        
        Greenfoot.setSpeed(45);
        
       
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        Enemy enemy = new Enemy();
        addObject(enemy,469,78);
        Enemy enemy2 = new Enemy();
        addObject(enemy2,279,302);
        Enemy enemy3 = new Enemy();
        addObject(enemy3,486,250);
        enemy3.setLocation(891,179);
        enemy2.setLocation(730,446);
        enemy.setLocation(789,46);
        Enemy enemy4 = new Enemy();
        addObject(enemy4,1554,200);
        Enemy enemy5 = new Enemy();
        addObject(enemy5,1373,101);
        Enemy enemy6 = new Enemy();
        addObject(enemy6,1373,101);
        Enemy enemy7 = new Enemy();
        addObject(enemy7,1219,216);
        Enemy enemy8 = new Enemy();
        addObject(enemy8,1396,315);
        Enemy enemy9 = new Enemy();
        addObject(enemy9,1534,390);
        Enemy enemy10 = new Enemy();
        addObject(enemy10,1534,390);
        Enemy enemy11 = new Enemy();
        addObject(enemy11,1216,387);
        Enemy enemy12 = new Enemy();
        addObject(enemy12,998,315);
        Enemy enemy13 = new Enemy();
        addObject(enemy13,666,241);
        Enemy enemy14 = new Enemy();
        addObject(enemy14,1093,113);
        Enemy enemy15 = new Enemy();
        addObject(enemy15,657,112);
        Enemy enemy16 = new Enemy();
        addObject(enemy16,543,341);
        Enemy enemy17 = new Enemy();
        addObject(enemy17,516,207);
        Rocket rocket = new Rocket();
        addObject(rocket,104,getHeight()/2);
        Mine mine = new Mine();
        addObject(mine,788,164);
        Mine mine2 = new Mine();
        addObject(mine2,794,377);
        Mine mine3 = new Mine();
        addObject(mine3,590,273);
        Mine mine4 = new Mine();
        addObject(mine4,437,68);
        Mine mine5 = new Mine();
        addObject(mine5,422,469);
        Label label2 = new Label(100);
        addObject(label2,200,40);
        Mine mine6 = new Mine();
        addObject(mine6,1054,58);
        Mine mine7 = new Mine();
        addObject(mine7,1436,53);
        Mine mine8 = new Mine();
        addObject(mine8,1748,56);
        Mine mine9 = new Mine();
        addObject(mine9,1080,439);
        Mine mine10 = new Mine();
        addObject(mine10,1432,434);
        Mine mine11 = new Mine();
        addObject(mine11,1772,418);
        Mine mine12 = new Mine();
        addObject(mine12,1772,418);
        Enemy enemy18 = new Enemy();
        addObject(enemy18,1968,106);
        Enemy enemy19 = new Enemy();
        addObject(enemy19,1976,312);
        Enemy enemy20 = new Enemy();
        addObject(enemy20,1970,230);
        Enemy enemy21 = new Enemy();
        addObject(enemy21,1971,230);
        Mine mine13 = new Mine();
        addObject(mine13,1877,247);
        Enemy enemy22 = new Enemy();
        addObject(enemy22,1713,170);
        Enemy enemy23 = new Enemy();
        addObject(enemy23,1734,329);
        Enemy enemy24 = new Enemy();
        addObject(enemy24,2135,410);
        Enemy enemy25 = new Enemy();
        addObject(enemy25,2120,234);
        Enemy enemy26 = new Enemy();
        addObject(enemy26,2137,104);
        Mine mine14 = new Mine();
        addObject(mine14,2378,101);
        Mine mine15 = new Mine();
        addObject(mine15,2388,349);
        Mine mine16 = new Mine();
        addObject(mine16,2637,257);
        Mine mine17 = new Mine();
        addObject(mine17,2637,257);
        Enemy enemy27 = new Enemy();
        addObject(enemy27,2536,119);
        Enemy enemy28 = new Enemy();
        addObject(enemy28,2530,368);
        Enemy enemy29 = new Enemy();
        addObject(enemy29,2811,137);
        Enemy enemy30 = new Enemy();
        addObject(enemy30,2801,359);
        Enemy enemy31 = new Enemy();
        addObject(enemy31,3022,244);
        Enemy enemy32 = new Enemy();
        addObject(enemy32,3022,244);
        Enemy enemy33 = new Enemy();
        addObject(enemy33,3022,244);
        Enemy enemy34 = new Enemy();
        addObject(enemy34,3022,244);
        Enemy enemy35 = new Enemy();
        addObject(enemy35,3022,244);
        Enemy enemy36 = new Enemy();
        addObject(enemy36,3022,244);
        Enemy enemy37 = new Enemy();
        addObject(enemy37,3022,244);
        Victory victory = new Victory();
        addObject(victory,3392,241);
        victory.setLocation(4183,242);
        Mine mine18 = new Mine();
        addObject(mine18,3327,137);
        Mine mine19 = new Mine();
        addObject(mine19,3596,405);
        Mine mine20 = new Mine();
        addObject(mine20,3854,150);
        Enemy enemy38 = new Enemy();
        addObject(enemy38,3296,374);
        Enemy enemy39 = new Enemy();
        addObject(enemy39,3451,311);
        Enemy enemy40 = new Enemy();
        addObject(enemy40,3568,265);
        Enemy enemy41 = new Enemy();
        addObject(enemy41,3712,197);
        Enemy enemy42 = new Enemy();
        addObject(enemy42,3843,281);
        Enemy enemy43 = new Enemy();
        addObject(enemy43,3967,344);
        Enemy enemy44 = new Enemy();
        addObject(enemy44,4102,394);
        Mine mine21 = new Mine();
        addObject(mine21,1269,249);
        Enemy enemy45 = new Enemy();
        addObject(enemy45,4390,403);
        Enemy enemy46 = new Enemy();
        addObject(enemy46,4482,328);
        Enemy enemy47 = new Enemy();
        addObject(enemy47,4593,247);
        Enemy enemy48 = new Enemy();
        addObject(enemy48,4702,333);
        Enemy enemy49 = new Enemy();
        addObject(enemy49,4796,411);
        Mine mine22 = new Mine();
        addObject(mine22,3203,65);
        Mine mine23 = new Mine();
        addObject(mine23,2271,52);
        Bomb bomb = new Bomb();
        addObject(bomb,577,85);
    }
}
