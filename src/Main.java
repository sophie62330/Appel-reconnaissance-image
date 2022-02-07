public class Main {
    public static void main(String[] args) throws Exception {
        //pour lancer le traitement d'images, seul les 2 lignes suivantes sont nécessaires, on passe l'url de la photo à analyser en param
        TraitementImage trt=new TraitementImage();
        trt.lancerTraitement("C:\\Users\\Administrateur\\Desktop\\Formation java\\projet fil rouge\\photos\\photos benoit\\1 ok.jpg");

        //ici on peut récupérer les infos tirées du traitement d'image ou récupérer la photo finale pour l'enregistrer en base/l'envoyer au front'
        FindContours.afficherBuf(trt.getPhotoFinale());
        System.out.println("url : "+trt.getUrl());
        System.out.println("nb cfu : "+trt.getNbCFU());
        System.out.println("photo finale : "+trt.getPhotoFinale().toString());
    }
}
