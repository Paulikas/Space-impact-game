import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Universe here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Universe extends World
{

    /**
     * Constructor for objects of class Universe.
     * 
     */
    public Universe()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(5000, 500, 1, false); 
        
        Greenfoot.setSpeed(50);

        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Victory victory = new Victory();
        addObject(victory,3920,235);
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
        victory.setLocation(3334,244);
        Victory2 victory2 = new Victory2();
        addObject(victory2,3237,253);
        removeObject(victory);
        enemy17.setLocation(546,114);
        enemy13.setLocation(636,399);
        enemy16.setLocation(518,360);
        enemy15.setLocation(661,80);
        enemy17.setLocation(547,161);
        enemy15.setLocation(662,106);
        enemy.setLocation(786,62);
        removeObject(mine2);
        removeObject(mine);
        mine6.setLocation(1229,56);
        enemy11.setLocation(1122,260);
        mine9.setLocation(1234,438);
        mine7.setLocation(1319,250);
        mine7.setLocation(1448,237);
        enemy12.setLocation(1027,401);
        enemy11.setLocation(1148,358);
        enemy7.setLocation(1259,324);
        enemy14.setLocation(997,71);
        enemy3.setLocation(1120,127);
        enemy6.setLocation(1254,164);
        enemy5.setLocation(1376,187);
        removeObject(mine10);
        mine13.setLocation(2210,240);
        mine17.setLocation(2576,247);
        mine13.setLocation(2204,230);
        mine16.setLocation(2295,156);
        mine17.setLocation(2287,293);
        enemy26.setLocation(2214,69);
        enemy25.setLocation(2123,150);
        enemy18.setLocation(2064,234);
        enemy21.setLocation(2152,311);
        enemy24.setLocation(2245,382);
        enemy19.setLocation(2366,430);
        enemy20.setLocation(2334,27);
        enemy26.setLocation(2236,88);
        enemy20.setLocation(2322,43);
        enemy25.setLocation(2149,158);
        enemy28.setLocation(2652,310);
        enemy27.setLocation(2667,194);
        enemy30.setLocation(2806,369);
        enemy28.setLocation(2682,314);
        Mine mine18 = new Mine();
        addObject(mine18,895,280);
        Victory4 victory4 = new Victory4();
        addObject(victory4,3360,257);
        removeObject(victory2);
        mine3.setLocation(333,155);
        mine18.setLocation(318,406);
        enemy17.setLocation(519,239);
        enemy15.setLocation(647,233);
        enemy13.setLocation(661,344);
        enemy2.setLocation(906,419);
        enemy.setLocation(913,52);
        mine7.setLocation(826,277);
        mine9.setLocation(1149,253);
        mine6.setLocation(1296,144);
        mine6.setLocation(1240,68);
        mine9.setLocation(1257,430);
        enemy4.setLocation(1523,88);
        enemy10.setLocation(1519,427);
        enemy9.setLocation(1537,241);
        enemy9.setLocation(1560,250);
        enemy20.setLocation(2575,55);
        enemy26.setLocation(2505,122);
        enemy25.setLocation(2451,182);
        enemy18.setLocation(2378,232);
        enemy21.setLocation(2459,287);
        enemy24.setLocation(2531,343);
        enemy19.setLocation(2622,403);
        enemy29.setLocation(3081,104);
        enemy27.setLocation(2942,167);
        enemy37.setLocation(3152,240);
        enemy36.setLocation(3173,247);
        enemy35.setLocation(3181,247);
        enemy34.setLocation(3160,246);
        enemy33.setLocation(3172,252);
        enemy32.setLocation(3154,246);
        enemy31.setLocation(3184,247);
        enemy30.setLocation(3088,382);
        enemy28.setLocation(2950,293);
        Greenfoot.delay(50);
        victory4.setLocation(4097,231);
        Mine mine19 = new Mine();
        addObject(mine19,4049,159);
        Mine mine20 = new Mine();
        addObject(mine20,3968,249);
        Mine mine21 = new Mine();
        addObject(mine21,4065,341);
        Enemy enemy38 = new Enemy();
        addObject(enemy38,3861,94);
        Enemy enemy39 = new Enemy();
        addObject(enemy39,4094,66);
        Enemy enemy40 = new Enemy();
        addObject(enemy40,3853,363);
        Enemy enemy41 = new Enemy();
        addObject(enemy41,4133,435);
        Mine mine22 = new Mine();
        addObject(mine22,3454,169);
        Mine mine23 = new Mine();
        addObject(mine23,3468,364);
        Enemy enemy42 = new Enemy();
        addObject(enemy42,3217,33);
        Enemy enemy43 = new Enemy();
        addObject(enemy43,3246,434);
    }
}
