package VigenereCipher;
public class VigenereCipherEncryptTest {
    public static void main(String[] args) {
        String plainText = "HELLO";
        String key = "KEY";

        String encryptedText = VigenereCipherEncrypt.encrypt(plainText, key);
        System.out.println("Encrypted text: " + encryptedText);
    }
}