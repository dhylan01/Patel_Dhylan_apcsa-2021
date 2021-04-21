//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block
{
	private int xSpeed;
	private int ySpeed;

	public Ball()
	{
		super(200,200);
		setSpeed(3, 1);
	}

	public Ball(int x, int y)
	{
		super(x, y);
		setSpeed(3, 1);
	}
	
	public Ball(int x, int y, int width, int height)
	{
		this(x, y);
		super.setWidth(width);
		super.setHeight(height);
	}
	
	public Ball(int x, int y, int width, int height, Color col)
	{
		this(x, y, width, height);
		super.setColor(col);
	}
	
	public Ball(int x, int y, int width, int height, int xS, int xY)
	{
		this(x, y, width, height);
		setSpeed(xS, xY);
	}
	
	public Ball(int x, int y, int width, int height, Color col, int xS, int xY)
	{
		super(x, y, width, height, col);
		setSpeed(xS, xY);
	}
	
	
	public void setXSpeed(int xS)
	{
		xSpeed=xS;
	}
	
	public void setYSpeed(int yS)
	{
		ySpeed=yS;
	}
	
	public void setSpeed(int xS, int yS)
	{
		xSpeed=xS;
		ySpeed=yS;
	}
	

   public void moveAndDraw(Graphics window)
   {
	   draw(window, Color.WHITE);
	   setX(getX()+xSpeed);
	   setY(getY()+ySpeed);
	   draw(window);
   }
   
	public boolean equals(Object obj)
	{
		Ball other = (Ball) obj;
		return super.equals(other) && xSpeed==other.getXSpeed() 
				&& ySpeed==other.getYSpeed();
	}

	public int getXSpeed()
	{
		return xSpeed;
	}
	
	public int getYSpeed()
	{
		return ySpeed;
	}
	
   public void moveAndDraw(Graphics window)
   {
   	//draw a white ball at old ball location


      setX(getX()+xSpeed);
		//setY

		//draw the ball at its new location
   }
   
	public boolean equals(Object obj)
	{




		return false;
	}   

   //add the get methods

   //add a toString() method
}