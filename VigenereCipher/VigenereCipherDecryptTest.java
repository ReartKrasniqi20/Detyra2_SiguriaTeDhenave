package VigenereCipher;

public class VigenereCipherDecryptTest {

    public static void main(String[] args) {
        String encryptedText = "RIJVSUYVJN";
        String keyword = "KEY";
        
        String decryptedText = VigenereCipherDecrypt.decrypt(encryptedText, keyword);
        System.out.println("Decrypted Text: " + decryptedText);
    }
}
