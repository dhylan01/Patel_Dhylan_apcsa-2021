/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("D:/Mauro_CSA_FIles/Patel_Dhylan_apcsa-2021/Unit16/src/images/beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  public static void testKeepOnlyBlue()
  {
    Picture beach = new Picture("D:/Mauro_CSA_FIles/Patel_Dhylan_apcsa-2021/Unit16/src/images/beach.jpg");
    beach.explore();
    beach.keepOnlyBlue();
    beach.explore();
  }
  public static void testNegate()
  {
    Picture beach = new Picture("D:/Mauro_CSA_FIles/Patel_Dhylan_apcsa-2021/Unit16/src/images/beach.jpg");
    beach.explore();
    beach.negate();
    beach.explore();
  }
  public static void testGrayscale()
  {
    Picture beach = new Picture("D:/Mauro_CSA_FIles/Patel_Dhylan_apcsa-2021/Unit16/src/images/beach.jpg");
    beach.explore();
    beach.grayscale();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("D:/Mauro_CSA_FIles/Patel_Dhylan_apcsa-2021/Unit16/src/images/caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  public static void testMirrorVerticalRightToLeft() {
	    Picture caterpillar = new Picture("D:/Mauro_CSA_FIles/Patel_Dhylan_apcsa-2021/Unit16/src/images/caterpillar.jpg");
	    caterpillar.explore();
	    caterpillar.mirrorVerticalRightToLeft();
	    caterpillar.explore();
  }
  public static void testMirrorHorizontal() {
	    Picture caterpillar = new Picture("D:/Mauro_CSA_FIles/Patel_Dhylan_apcsa-2021/Unit16/src/images/caterpillar.jpg");
	    caterpillar.mirrorHorizontal();
	 
	    caterpillar.explore();
  }

  public static void testMirrorHorizontalBotToTop() {
	    Picture caterpillar = new Picture("D:/Mauro_CSA_FIles/Patel_Dhylan_apcsa-2021/Unit16/src/images/caterpillar.jpg");
	    caterpillar.mirrorHorizontalBotToTop();
	 
	    caterpillar.explore();
}
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("D:/Mauro_CSA_FIles/Patel_Dhylan_apcsa-2021/Unit16/src/images/temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  public static void testMirrorArms()
  {
    Picture snowman = new Picture("D:/Mauro_CSA_FIles/Patel_Dhylan_apcsa-2021/Unit16/src/images/snowman.jpg");
    snowman.explore();
    snowman.mirrorArms();
    snowman.explore();
  }
  public static void testBlur(int x, int y, int w, int h, int n)
  {
    Picture redMoto = new Picture("D:/Mauro_CSA_FIles/Patel_Dhylan_apcsa-2021/Unit16/src/images/redMotorcycle.jpg");
    for (int i = 0; i<n; i++){
        redMoto.blur(x,y,w,h);
      }
      redMoto.explore();
  }
  public static void testMirrorGull()
  {
    Picture gull = new Picture("D:/Mauro_CSA_FIles/Patel_Dhylan_apcsa-2021/Unit16/src/images/seagull.jpg");
    gull.explore();
    gull.mirrorGull();
    gull.explore();
  }
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("D:/Mauro_CSA_FIles/Patel_Dhylan_apcsa-2021/Unit16/src/images/640x480.jpg");
 //   canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("D:/Mauro_CSA_FIles/Patel_Dhylan_apcsa-2021/Unit16/src/images/swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
   //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
  // testGrayscale();
	  testBlur(180,160,25,25,10);
    //testMirrorVerticalRightToLeft();
    //testMirrorHorizontal();
    //testMirrorHorizontalBotToTop();
    //testFixUnderwater();
    //testMirrorVertical();
    //testMirrorTemple();
    //testMirrorArms();
  //  testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
  //  testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}