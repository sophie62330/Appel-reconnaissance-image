import java.awt.image.BufferedImage;

public class TraitementImage {
    private String url;
    private int nbCFU;
    private BufferedImage photoOriginale;
    private BufferedImage photoFinale;

    public TraitementImage(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getNbCFU() {
        return nbCFU;
    }

    public void setNbCFU(int nbCFU) {
        this.nbCFU = nbCFU;
    }



    public BufferedImage getPhotoFinale() {
        return photoFinale;
    }

    public void setPhotoFinale(BufferedImage photoFinale) {
        this.photoFinale = photoFinale;
    }

    public void lancerTraitement() throws Exception {
        String[] args=new String[1];
        args[0]=this.getUrl();
        FindContours.test(args);
        this.setNbCFU(FindContours.getNbCFU());
        this.setPhotoFinale(FindContours.getImageFinale());


    }
}
