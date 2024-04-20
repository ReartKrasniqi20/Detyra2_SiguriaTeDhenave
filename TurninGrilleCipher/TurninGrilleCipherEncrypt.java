package TurninGrilleCipher;

public class TurninGrilleCipherEncrypt {

    public static String encrypt(String plaintext, int size) {
        // Create the grille
        char[][] grille = createGrille(size);

        // Encrypt the plaintext
        StringBuilder encryptedText = new StringBuilder();
        int index = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (grille[i][j] == 'X') {
                    encryptedText.append(plaintext.charAt(index++));
                }
            }
        }
        return encryptedText.toString();
    }

    private static char[][] createGrille(int size) {
        char[][] grille = new char[size][size];
        int numX = size * size / 4; // Number of X's to place

        // Initialize grille with dots
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                grille[i][j] = '.';
            }
        }

        // Place X's randomly
        while (numX > 0) {
            int i = (int) (Math.random() * size);
            int j = (int) (Math.random() * size);
            if (grille[i][j] == '.') {
                grille[i][j] = 'X';
                numX--;
            }
        }
        return grille;
    }
}
