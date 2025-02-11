public class Main {
    public static void main(String[] args) {
        // Création d'une instance de CompteBancaire
        CompteBancaire compte = new CompteBancaire("Alice", 1000.0);
        
        // Dépôt d'argent
        compte.deposer(500.0); // 500.0 € déposés. Nouveau solde : 1500.0 €

        // Retrait d'argent
        compte.retirer(200.0); // 200.0 € retirés. Nouveau solde : 1300.0 €

        // Tentative de retrait d'un montant supérieur au solde
        compte.retirer(2000.0); // Fonds insuffisants. Solde actuel : 1300.0 €

        // Tentative de retrait d'un montant négatif
        compte.retirer(-100.0); // Le montant à retirer doit être positif.
    }
}