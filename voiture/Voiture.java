public class Voiture {
    private String marque;
    private String modele;
    private String couleur;

    // Authorized colors
    private static final String[] colorAuthorized = {"Red", "Blue", "Green"};

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

    // Getter methods (fixed String case)
    public String getCouleur() {
        return this.couleur;
    }

    public String getMarque() {
        return this.marque;
    }

    public String getModele() {
        return this.modele;
    }
}
