package VigenereCipher;
public class VigenereCipherEncryptTest {

    public static void main(String[] args) {
        String plaintext = "HELLO";
        String keyword = "KEY";
        
        String encryptedText = VigenereCipherEncrypt.encrypt(plaintext, keyword);
        System.out.println("Encrypted Text: " + encryptedText);
    }
}
