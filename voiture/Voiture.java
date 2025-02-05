public class Voiture {
    private String marque;
    private String modele;
    private String couleur;

    // Constructor
    public Voiture(String marque, String modele, String couleur) {
        this.marque = marque;
        this.modele = modele;
        this.couleur = couleur;
    }

    public void demarrer() {
        System.out.println("Le " + this.modele + " de " + this.marque + " est en marche !");
    }

    public void freiner() {
        System.out.println("Le " + this.modele + " de " + this.marque + " est en train de freiner.");
    }

    public void accelerer() {
        System.out.println("Le " + this.modele + " de " + this.marque + " accélère !");
    }
}
