package TurninGrilleCipher;

public class TurninGrilleCipherEncrypt {

    public static String encrypt(String plaintext, char[][] grille) {
        StringBuilder encryptedText = new StringBuilder();

        for (int i = 0; i < 4; i++) {
            for (int row = 0; row < grille.length; row++) {
                for (int col = 0; col < grille[row].length; col++) {
                    if (grille[row][col] == 'X') {
                        encryptedText.append(plaintext.charAt(row * grille.length + col));
                    }
                }
            }
            grille = rotateGrille(grille);
        }

        return encryptedText.toString();
    }

    private static char[][] rotateGrille(char[][] grille) {
        int n = grille.length;
        char[][] rotatedGrille = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotatedGrille[j][n - i - 1] = grille[i][j];
            }
        }

        return rotatedGrille;
    }
}
