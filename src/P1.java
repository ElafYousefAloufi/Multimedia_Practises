
import cpit380practice.*;
import java.util.Arrays;

public class P1 {
    
    public static void main(String[] args) {

//        String file = FileChooser.pickAFile();
 
        
         String targetFile = "C:\\Users\\HP\\Desktop\\Untitled.jpg";
        Picture p1= new Picture(targetFile);
        p1.show();
     
      p1.copyKatiesFace(p1, 0, 0);
        
//pic.decreaseGreen();
//        Pixel[] p = pic.getPixels();
//
//        for (int i = 0; i < p.length; i++) {
//            p[i].setGreen((int) ((p[i].getGreen() * 0.70)));
//            p[i].setBlue((int) (p[i].getBlue() * 0.70));
//        }

       

//        int value = 0;
//          for (int i = 1; i < pic.getWidth(); i++) {
//            for (int j = 1; j < pic.getHeight(); j++) {
//                pic.getPixel(i, j).setRed((int)(pic.getPixel(i, j).getRed() *2));
//            }}
//     
//                  
//         
//                  value= pixel[i].getRed();  
//                  value= value*2;  
//                  pixel[i].setRed(value);
//            
//            pixel[i].setGreen((int) (pixel[i].getGreen() * 0.60));
    }
    public void copyKatieFace(){
                String sourceFile = "C:\\Users\\HP\\Desktop\\k.jpg";
        Picture sourcePicture = new Picture(sourceFile);
        
        Pixel sourcePixel = null;
        Pixel targetPixel = null;

        //through x
        for (int sourceX = 70, targetX = 100; sourceX < 135; sourceX++, targetX++) {
            //through y
            for (int sourceY = 3, targetY = 100; sourceY < 80; sourceY++, targetY++) {
                
                sourcePixel = sourcePicture.getPixel(sourceX, sourceY);
                targetPixel = sourcePicture.getPixel(targetX, targetY);
                targetPixel.setColor(sourcePixel.getColor());
            }
        }
    }
}
