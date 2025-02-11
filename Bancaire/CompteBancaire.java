

public class CompteBancaire{

    private String titulaire;
    private double solde;
    
    public CompteBancaire(String titulaire, double solde) {
        this.titulaire = titulaire;
        this.solde = solde;
    }
    public void deposer(int montant){
        this.solde = this.solde + montant;
        System.out.println(montant + "a ete depose sur le compte");
    }
    public void retirer(int montant){
        if (montant <= this.solde){
            this.solde = this.solde - montant;
            System.out.println(montant + "a ete retire du compte");
        }
    }


}