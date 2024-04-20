package TurninGrilleCipher;

public class TurninGrilleCipherDecrypt {

    public static String decrypt(String encryptedText, int size) {
        // Create the grille
        char[][] grille = createGrille(size);

        // Decrypt the encrypted text
        StringBuilder decryptedText = new StringBuilder();
        int index = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (grille[i][j] == 'X') {
                    decryptedText.append(encryptedText.charAt(index++));
                }
            }
        }
        return decryptedText.toString();
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
