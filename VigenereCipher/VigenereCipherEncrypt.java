package VigenereCipher;
public class VigenereCipherEncrypt {

    public static String encrypt(String plaintext, String keyword) {
        plaintext = plaintext.toUpperCase();
        keyword = keyword.toUpperCase();
        StringBuilder encryptedText = new StringBuilder();

        for (int i = 0, j = 0; i < plaintext.length(); i++) {
            char c = plaintext.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                int shift = keyword.charAt(j) - 'A';
                char encryptedChar = (char) ((c - 'A' + shift) % 26 + 'A');
                encryptedText.append(encryptedChar);
                j = (j + 1) % keyword.length();
            }
        }

        return encryptedText.toString();
    }
}

