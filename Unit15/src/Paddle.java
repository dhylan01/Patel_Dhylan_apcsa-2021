//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block
{
   //instance variables
   private int speed;

   public Paddle()
   {
		super();
      speed = 5;
   }
   public Paddle(int x, int y) {
	   setPos(x,y);
   }
   public Paddle(int x, int y, int width) {
	   setPos(x,y);
	   setWidth(width);
   }
   public Paddle (int x, int y, int width, int height, int speed)
   {
	   super (x, y, width, height);
	   setSpeed(speed);
	   
   }
   public Paddle (int x, int y, int width, int height, Color col, int spe)
   {
	   super (x, y, width, height, col);
	   setSpeed(spe);
   }

   //add the other Paddle constructors

   public void setSpeed(int spe) {
	   speed = spe;
   }








   public void moveUpAndDraw(Graphics window)
   {
	   draw(window, Color.WHITE);
	   setY(getY()-speed);
	   draw(window);

   }

   public void moveDownAndDraw(Graphics window)
   {
	   draw(window, Color.WHITE);
	   setY(getY()+ speed);
	   draw(window);

   }

   //add get methods
   	public int getSpeed() {
   		return speed;
   	}
   
   //add a toString() method
   	public String toString() {
   		return getX() + "" + getY() + "" + getWidth() + "" + getHeight() + "" + getColor() + "" + speed;
   	}
}