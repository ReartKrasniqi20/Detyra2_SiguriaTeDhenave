package VigenereCipher;
public class VigenereCipherEncrypt {

    public static String encrypt(String message, String key) {
        StringBuilder encryptedMessage = new StringBuilder();
        message = message.toUpperCase();
        key = key.toUpperCase();
        int keyLength = key.length();
        for (int i = 0, j = 0; i < message.length(); i++) {
            char letter = message.charAt(i);
            if (Character.isLetter(letter)) {
                encryptedMessage.append((char)(((letter - 'A') + (key.charAt(j) - 'A')) % 26 + 'A'));
                j = ++j % keyLength;
            } else {
                encryptedMessage.append(letter); // Retain non-alphabetic characters
            }
        }
        return encryptedMessage.toString();
    }
}
