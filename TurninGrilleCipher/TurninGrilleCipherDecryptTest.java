package TurninGrilleCipher;

public class TurninGrilleCipherDecryptTest {

    public static void main(String[] args) {
        String encryptedText = "HLOEL";
        int size = 2; // Size of the grille
        
        String decryptedText = TurninGrilleCipherDecrypt.decrypt(encryptedText, size);
        System.out.println("Decrypted Text: " + decryptedText);
    }
}
