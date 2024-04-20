package TurninGrilleCipher;

public class TurninGrilleCipherEncryptTest {

    public static void main(String[] args) {
        String plaintext = "HELLO";
        int size = 2; // Size of the grille
        
        String encryptedText = TurninGrilleCipherEncrypt.encrypt(plaintext, size);
        System.out.println("Encrypted Text: " + encryptedText);
    }
}
