public class Main {
    public static void main(String[] args) { 
        // Create an instance of Voiture
        Voiture voiture = new Voiture("Toyota", "Corolla", "Rouge");

        voiture.demarrer();
        System.out.println(voiture.getMarque() + " " + voiture.getModele() + " " + voiture.getCouleur());
    }
}
