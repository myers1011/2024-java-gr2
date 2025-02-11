public class Main {
    public static void main(String[] args) { // Fixed "string" to "String"
        Animal monAnimal = new Animal();
        monAnimal.fairedebruit(); // Output: Fais du bruit

        Chien monChien = new Chien();
        monChien.fairedebruit(); // Output: Wouf
        Chat monChat = new Chat();
        monChat.fairedebruit(); // Output: Miaou
    }
}
