import org.opencv.core.Core;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) throws Exception {
        TraitementImage trt=new TraitementImage("C:\\Users\\Administrateur\\Desktop\\Formation java\\projet fil rouge\\photos\\photos benoit\\10 nickel avec cropcircle.jpg");
        trt.lancerTraitement();
        FindContours.afficherBuf(trt.getPhotoFinale());
        System.out.println("url : "+trt.getUrl());
        System.out.println("nb cfu : "+trt.getNbCFU());
        System.out.println("photo finale : "+trt.getPhotoFinale().toString());
    }
}
