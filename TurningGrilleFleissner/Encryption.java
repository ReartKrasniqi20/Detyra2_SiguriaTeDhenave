package TurningGrille(Fleissner);

public class Encryption {
     public static char[][] encrypt(String text) {
        char[][] a1 = {
                {'B', 'X', 'C', 'X', 'D', 'X'},
                {'E', 'F', 'G', 'H', 'X', 'I'},
                {'J', 'K', 'X', 'L', 'M', 'N'},
                {'O', 'X', 'P', 'Q', 'X', 'R'},
                {'S', 'T', 'U', 'V', 'W', 'X'},
                {'C', 'Y', 'Z', 'X', 'A', 'B'}
        };

        String text1 = Substring.substring(text, 0, 9);
        int[] ar = {0, 9, 18, 27, 36};
        char[][] out = new char[6][6];

        int i = 0;
        while (i < 4) {
            int a = 0;
            int b = 0;
            int x = 0;

            while (x < text1.length()) {
                if (a1[a][b] == 'X') {
                    out[a][b] = text1.charAt(x);
                    x = x + 1;
                    if (b < 5) {
                        b = b + 1;
                    } else if (a < 5) {
                        a = a + 1;
                        b = 0;
                    }
                } else if (b < 5) {
                    b = b + 1;
                } else if (a < 5) {
                    a = a + 1;
                    b = 0;
                }
            }
            i = i + 1;
            int m = ar[i];
            int n = m + 9;
            text1 = Substring.substring(text, m, n);
            a1 = rotate(a1);
        }
        return out;
    }
    public static char[][] rotate(char[][] a1) {
        char[][] rotated = {
                {a1[5][0], a1[4][0], a1[3][0], a1[2][0], a1[1][0], a1[0][0]},
                {a1[5][1], a1[4][1], a1[3][1], a1[2][1], a1[1][1], a1[0][1]},
                {a1[5][2], a1[4][2], a1[3][2], a1[2][2], a1[1][2], a1[0][2]},
                {a1[5][3], a1[4][3], a1[3][3], a1[2][3], a1[1][3], a1[0][3]},
                {a1[5][4], a1[4][4], a1[3][4], a1[2][4], a1[1][4], a1[0][4]},
                {a1[5][5], a1[4][5], a1[3][5], a1[2][5], a1[1][5], a1[0][5]}
        };
        return rotated;
    }
}
