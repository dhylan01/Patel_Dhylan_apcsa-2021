import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////
  
  /**
   * Constructor that takes no arguments 
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
    super();  
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param height the height of the desired picture
   * @param width the width of the desired picture
   */
  public Picture(int height, int width)
  {
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   * @param copyPicture the picture to copy
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }
  
  ////////////////////// methods ///////////////////////////////////////
  
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;
    
  }
  
  /** Method to set the blue to 0 */
  public void zeroBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(0);
      }
    }
  }
  public void keepOnlyBlue() {
	  Pixel[][] pixels = this.getPixels2D();
	  for (Pixel[] row: pixels) {
		  for (Pixel item: row) {
			  item.setRed(0);
			  item.setRed(0);
			  
		  }
	  }
  }
  public void negate() {
	  Pixel[][] pixels = this.getPixels2D();
	  for (Pixel[] row: pixels) {
		  for (Pixel item: row) {
			  item.setBlue(225 - item.getBlue());
			  item.setRed(225 - item.getRed());
			  item.setBlue(225 - item.getBlue());
		  }
	  }
  }
  public void grayscale() {
	  Pixel[][] pixels = this.getPixels2D();
	  for (Pixel[] row: pixels) {
		  for (Pixel item: row) {
			  int avg = (item.getBlue() + item.getRed() + item.getRed() )/3;
			  item.setBlue(avg);
			  item.setRed(avg);
			  item.setBlue(avg);
		  }
	  }
  }
  
  /** Method that mirrors the picture around a 
    * vertical mirror in the center of the picture
    * from left to right */
  public void mirrorVertical()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        rightPixel.setColor(leftPixel.getColor());
      }
    } 
  }
  
  public void mirrorVerticalRightToLeft()
  {
	  Pixel[][] pixels = this.getPixels2D();
	    Pixel leftPixel = null;
	    Pixel rightPixel = null;
	    int width = pixels[0].length;
	    for (int row = 0; row < pixels.length; row++)
	    {
	      for (int col = width - 1; col >=0 ; col--)
	      {
	        leftPixel = pixels[row][col];
	        rightPixel = pixels[row][width - 1 - col];
	        rightPixel.setColor(leftPixel.getColor());
	      }
	    } 
  }
  public void mirrorHorizontal() {
	    Pixel[][] pixels = this.getPixels2D();
	    Pixel botPixel = null;
	    Pixel topPixel = null;
	    int length = pixels.length;
	    for (int row = 0; row < pixels.length / 2; row++)
	    {
	      for (int col = 0; col < pixels[row].length; col++)
	      {
	        botPixel = pixels[length - row - 1][col];
	        topPixel = pixels[row][col];
	        botPixel.setColor(topPixel.getColor());
	      }
	    } 
  }
  
  public void mirrorHorizontalBotToTop() {
	    Pixel[][] pixels = this.getPixels2D();
	    Pixel botPixel = null;
	    Pixel topPixel = null;
	    int length = pixels.length;
	    for (int row = length - 1; row > pixels.length / 2; row--)
	    {
	      for (int col = 0; col < pixels[row].length; col++)
	      {
	        botPixel = pixels[length - row - 1][col];
	        topPixel = pixels[row][col];
	        botPixel.setColor(topPixel.getColor());
	      }
	    } 
}
  
  /** Mirror just part of a picture of a temple */
  public void mirrorTemple()
  {
    int mirrorPoint = 276;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int count = 0;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = 27; row < 97; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 13; col < mirrorPoint; col++)
      {
        
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row]                       
                         [mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
        count++;
      }
    }
    System.out.println("count is " + count);
  }
  public void mirrorArms()
  {
    int mirrorPointROW = 190;
    Pixel uPixel = null;
    Pixel dPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    
    //first arm row
    for (int row = 160; row < 190; row++)
    {
      // first arm column
      for (int col = 102; col < 170; col++)
      {
    	uPixel = pixels[row][col];      
        dPixel = pixels[(mirrorPointROW - row) + mirrorPointROW][col];
        	if(uPixel.getBlue() <=100)
        		dPixel.setColor(uPixel.getColor());
      }
    }
    //second arm row
    for (int row = 171; row < 236; row++)
    {
      // second arm column
      for (int col = 240; col < 292; col++)
      {
        
        uPixel = pixels[row][col];      
        dPixel = pixels[(mirrorPointROW - row) + mirrorPointROW][col];
        	if(uPixel.getBlue() <=100)
        		dPixel.setColor(uPixel.getColor());
      }
    }
  }
  public void mirrorGull()
  {
    int mirrorPoint = 343;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    
    for (int row = 235; row < 316; row++)
    {
      for (int col = 238; col < mirrorPoint; col++)
      {
        
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
      }
    }
  }
  
  /** copy from the passed fromPic to the
    * specified startRow and startCol in the
    * current picture
    * @param fromPic the picture to copy from
    * @param startRow the start row to copy to
    * @param startCol the start col to copy to
    */
  public void copy(Picture fromPic, 
                 int startRow, int startCol)
  {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = 0, toRow = startRow; 
         fromRow < fromPixels.length &&
         toRow < toPixels.length; 
         fromRow++, toRow++)
    {
      for (int fromCol = 0, toCol = startCol; 
           fromCol < fromPixels[0].length &&
           toCol < toPixels[0].length;  
           fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }   
  }

  /** Method to create a collage of several pictures */
 /* public void createCollage(int rowStart; int colstart)
  {
    Picture flower1 = new Picture("file:///D:/Mauro_CSA_FIles/Patel_Dhylan_apcsa-2021/Unit16/src/images/flower1.jpg");
    Picture flower2 = new Picture("file:///D:/Mauro_CSA_FIles/Patel_Dhylan_apcsa-2021/Unit16/src/images/flower2.jpg");
    this.copy(flower1,rowStart,colstart);
    this.copy(flower2,rowStart,colstart);
    this.copy(flower1,rowStart + 200,colstart);
    Picture flowerNoBlue = new Picture(flower2);
    flowerNoBlue.zeroBlue();
    this.copy(flowerNoBlue,rowStart + 300,colstart);
    this.copy(flower1,rowStart + 400,colstart);
    this.copy(flower2,rowStart + 500,colstart);
    this.mirrorVertical();
    this.write("file:///D:/Mauro_CSA_FIles/Patel_Dhylan_apcsa-2021/Unit16/src/images/collage.jpg");

  }
  
  
  /** Method to show large changes in color 
    * @param edgeDist the distance for finding edges
    */
  public void blur(int x, int y, int w, int h) {
	  System.out.println("Dhylan Patel \n Period 3 \n 5/25/21");
	  Pixel[][] pixels = this.getPixels2D();
	  Pixel leftPixel = null;
	    Pixel rightPixel = null;
	    Pixel topPixel = null;
	    Pixel bottomPixel = null;
		  Pixel leftTopPixel = null;
		    Pixel rightTopPixel = null;
		    Pixel leftBotPixel = null;
		    Pixel rightBotPixel = null;
		double avg = 0.0;

	  for (int row = 0; row < h; row ++) {
		  for (int col = 0; col < w; col++) {
			  if (row == 0 && col == 0) {
				  leftPixel = pixels[x][y];
				  rightPixel = pixels[x][y+ col + 1];
				  topPixel = pixels[x][ y];
				  bottomPixel = pixels[x+ 1][y];
				  leftTopPixel = pixels[x][y];
				  rightTopPixel = pixels[x][y];
				  leftBotPixel = pixels[x][y];
				  rightBotPixel = pixels[x+ 1][y+ 1];
			  }
			  else {
				  leftPixel = pixels[x+ row][y+ col - 1];
				  rightPixel = pixels[x+ row][y+ col + 1];
				  topPixel = pixels[x+ row - 1][y+ col];
				  bottomPixel = pixels[x+ row + 1][y+ col];
				  leftTopPixel = pixels[x+ row - 1][y+ col - 1];
				  rightTopPixel = pixels[x+ row - 1][y+ col + 1];
				  leftBotPixel = pixels[x+ row + 1][y+ col - 1];
				  rightBotPixel = pixels[x+  row + 1][y + col + 1];
			  }
			  avg = (leftPixel.getRed() + rightPixel.getRed() + topPixel.getRed() + bottomPixel.getRed() + leftTopPixel.getRed() + rightTopPixel.getRed() + leftBotPixel.getRed() + rightBotPixel.getRed() + pixels[x+ row][x+ col].getRed())/9;
			  pixels[y][x].setRed((int)avg);
			  avg = (leftPixel.getBlue() + rightPixel.getBlue() + topPixel.getBlue() + bottomPixel.getBlue() + leftTopPixel.getBlue() + rightTopPixel.getBlue() + leftBotPixel.getBlue() + rightBotPixel.getBlue() + pixels[x+ row][x+ col].getBlue())/9;
			  pixels[y][x].setBlue((int)avg);
			  avg = (leftPixel.getRed() + rightPixel.getRed() + topPixel.getRed() + bottomPixel.getRed() + leftTopPixel.getRed() + rightTopPixel.getRed() + leftBotPixel.getRed() + rightBotPixel.getRed() + pixels[x+ row][x+ col].getRed())/9;
			  pixels[y][x].setRed((int)avg);
		  }
	  }
	
  }
  public void edgeDetection(int edgeDist)
  {
	  Pixel leftPixel = null;
	    Pixel rightPixel = null;
	    Pixel topPixel = null;
	    Pixel bottomPixel = null;
	    
	    Pixel[][] pixels = this.getPixels2D();
	    for (int row = 0; row < pixels.length - 1; row++)
	    {
	      for (int col = 0; 
	           col < pixels[0].length-1; col++)
	      {
	        leftPixel = pixels[row][col];
	        rightPixel = pixels[row][col+1];
	        topPixel = pixels[row][col];
	        bottomPixel = pixels[row + 1][col];
	        if (leftPixel.colorDistance(rightPixel.getColor()) > edgeDist ||
	            topPixel.colorDistance(bottomPixel.getColor()) > edgeDist)
	          leftPixel.setColor(Color.BLACK);
	        else
	          leftPixel.setColor(Color.WHITE);
	      }
	      
	    }
  }
  
  
  /* Main method for testing - each class in Java can have a main 
   * method 
   */
  public static void main(String[] args) 
  {
    Picture beach = new Picture("file:///D:/Mauro_CSA_FIles/Patel_Dhylan_apcsa-2021/Unit16/src/images/beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
} // this } is the end of class Picture, put all new methods before this
