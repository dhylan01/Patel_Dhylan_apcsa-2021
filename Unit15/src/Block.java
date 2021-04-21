//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;
	
	public Block()
	{
		setColor(Color.black);
		setxPos(0);
		setyPos(0);
		setWidth(0);
		setHeight(0);

	}
	public Block(int x, int y) {
		setPos(x,y);
	}
	public Block (int x, int y, int width, int height, Color color)
	{
		setPos(x, y);
		setWidth(width);
		setHeight(height);
		setColor(color);
	}
	public Block (int x, int y, int width, int height)
	{
		setPos(x, y);
		setWidth(width);
		setHeight(height);
		setColor(Color.black);
	}

	//add other Block constructors - x , y , width, height, color
	public void setPos(int x , int y) {
		setxPos(x);
		setyPos(y);
	}
	public void setxPos(int Posx)
	   {
		   xPos = Posx;

	   }
	   public void setyPos(int Posy)
	   {
		   yPos = Posy;

	   }
	   public void setWidth(int wid)
	   {
		  width = wid;

	   }
	   public void setHeight(int hei)
	   {
		   height = hei;

	   }
	
	
	
	
	
	
	
	
	
	
	
	
   //add the other set methods
   

   public void setColor(Color col)
   {
	   color = col;

   }

   public void draw(Graphics window)
   {
   
     window.setColor(color);
     window.fillRect(getX(), getY(), getWidth(), getHeight());
   }

   public void draw(Graphics window, Color col)
   {
	   window.setColor(color);
	   window.fillRect(getX(), getY(), getWidth(), getHeight());

   }
   
	public boolean equals(Object obj)
	{

		Block other = (Block) obj;
		return other.getX()==xPos && other.getY()==yPos && other.getWidth()==width 
				&& other.getHeight()==height && other.getColor().equals(color);


		
	}   

   //add the other get methods
	public int getX()
	{
		return xPos;
	}
	   
	public int getY()
	{
		return yPos;
	}

	public int getWidth()
	{
		return width;
	}
	
	public int getHeight()
	{
		return height;
	}
	
	public Color getColor()
	{
		return color;
	}

   //add a toString() method  - x , y , width, height, color
	public String toString()
	{
		return xPos + " " + yPos + " " + width + " " + height + " " + color;
	}
}