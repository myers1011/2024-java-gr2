import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CompteBancaire compte1 = new CompteBancaire("Louis",1000);
        compte1.retirer(500);
        compte1.deposer(2000);
    }
}
