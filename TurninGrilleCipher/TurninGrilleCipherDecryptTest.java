package TurninGrilleCipher;

public class TurninGrilleCipherDecryptTest {

    public static void main(String[] args) {
        String encryptedText = "HLOEL";
        char[][] grille = {
            {'X', 'X'},
            {'X', '.'}
        };
        
        String decryptedText = TurninGrilleCipherDecrypt.decrypt(encryptedText, grille);
        System.out.println("Decrypted Text: " + decryptedText);
    }
}
