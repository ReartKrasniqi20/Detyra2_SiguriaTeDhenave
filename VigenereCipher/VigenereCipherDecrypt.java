package VigenereCipher;

public class VigenereCipherDecrypt {

    public static String decrypt(String encryptedText, String keyword) {
        encryptedText = encryptedText.toUpperCase();
        keyword = keyword.toUpperCase();
        StringBuilder decryptedText = new StringBuilder();

        for (int i = 0, j = 0; i < encryptedText.length(); i++) {
            char c = encryptedText.charAt(i);
            int shift = keyword.charAt(j) - 'A';
            char decryptedChar = (char) ((c - 'A' - shift + 26) % 26 + 'A');
            decryptedText.append(decryptedChar);
            j = (j + 1) % keyword.length();
        }

        return decryptedText.toString();
    }
}


