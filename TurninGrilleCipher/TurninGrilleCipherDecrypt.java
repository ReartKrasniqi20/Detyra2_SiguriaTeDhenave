package TurninGrilleCipher;

public class TurninGrilleCipherDecrypt {

    public static String decrypt(String encryptedText, char[][] grille) {
        StringBuilder decryptedText = new StringBuilder();

        for (int i = 0; i < 4; i++) {
            for (int row = 0; row < grille.length; row++) {
                for (int col = 0; col < grille[row].length; col++) {
                    if (grille[row][col] == 'X') {
                        decryptedText.append(encryptedText.charAt(0));
                        encryptedText = encryptedText.substring(1);
                    }
                }
            }
            grille = rotateGrille(grille);
        }

        return decryptedText.toString();
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

