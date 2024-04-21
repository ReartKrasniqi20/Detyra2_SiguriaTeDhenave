package VigenereCipher;

public class VigenereCipherDecrypt {
    public static String decrypt(String message, String key) {
        StringBuilder decryptedMessage = new StringBuilder();
        message = message.toUpperCase();
        key = key.toUpperCase();
        int keyLength = key.length();
        for (int i = 0, j = 0; i < message.length(); i++) {
            char letter = message.charAt(i);
            if (Character.isLetter(letter)) {
                decryptedMessage.append((char)(((letter - 'A') - (key.charAt(j) - 'A') + 26) % 26 + 'A'));
                j = ++j % keyLength;
            } else {
                decryptedMessage.append(letter); // Ruaj karakteret që sjane shkronja
            }
        }
        return decryptedMessage.toString();
    }
}
