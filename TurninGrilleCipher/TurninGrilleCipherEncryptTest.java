package TurninGrilleCipher;

public class TurninGrilleCipherEncryptTest {

    public static void main(String[] args) {
        String plaintext = "HELLO";
        char[][] grille = {
            {'X', 'X'},
            {'X', '.'}
        };
        
        String encryptedText = TurninGrilleCipherEncrypt.encrypt(plaintext, grille);
        System.out.println("Encrypted Text: " + encryptedText);
    }
}
