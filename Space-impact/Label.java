import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


/**
 * Write a description of class Label here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Label extends Actor
{
   private int k=2;
    public Label(int h)
    {
        super();
        Color c1= new Color(0,0,0);
        Color c2= new Color(255, 255, 255);
        GreenfootImage img =new GreenfootImage("Score : "+ k, h, c1, c2);
        setImage(img);
        setText("Score : "+ k);
    }
    
    public void setText(String text)
    {
        GreenfootImage img = getImage();
        img.clear();
        img.drawString(text,0,img.getHeight());
    }
    
    public void setColor(Color c)
    {
        GreenfootImage img = getImage();
        img.setColor(c);
    }
    
    /*public void setFontFace(String face)
    {
        GreenfootImage img = getImage();
        Font oldFont= img.getFont();
        Font newFont= new Font (face, oldFont.getStyle, oldFont.getSize());
        
        
    }*/
    /**
     * Act - do whatever the Label wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
