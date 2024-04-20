public class fleissner_encrypt {
    public static int[][] rotate(int[][] a1) {

        int[][] rotated =
                {{a1[5][0],a1[4][0],a1[3][0],a1[2][0],a1[1][0],a1[0][0]},
                        {a1[5][1],a1[4][1],a1[3][1],a1[2][1],a1[1][1],a1[0][1]},
                        {a1[5][2],a1[4][2],a1[3][2],a1[2][2],a1[1][2],a1[0][2]},
                        {a1[5][3],a1[4][3],a1[3][3],a1[2][3],a1[1][3],a1[0][3]},
                        {a1[5][4],a1[4][4],a1[3][4],a1[2][4],a1[1][4],a1[0][4]},
                        {a1[5][5],a1[4][5],a1[3][5],a1[2][5],a1[1][5],a1[0][5]}
                };
        return rotated;
    }

    //This method creates a random grille
    public static int[][] creategrille() {

        int[][] a2 = {
                {(int)((Math.random()) * 4 + 1),(int)((Math.random()) * 4 + 1),(int)((Math.random()) * 4 + 1)},
                {(int)((Math.random()) * 4 + 1),(int)((Math.random()) * 4 + 1),(int)((Math.random()) * 4 + 1)},
                {(int)((Math.random()) * 4 + 1),(int)((Math.random()) * 4 + 1),(int)((Math.random()) * 4 + 1)}
        };

        int[][] a3 = {
                {(a2[2][0])%4+1,(a2[1][0])%4+1,(a2[0][0])%4+1},
                {(a2[2][1])%4+1,(a2[1][1])%4+1,(a2[0][1])%4+1},
                {(a2[2][2])%4+1,(a2[1][2])%4+1,(a2[0][2])%4+1}
        };
        int[][] a4 = {
                {(a3[2][0])%4+1,(a3[1][0])%4+1,(a3[0][0])%4+1},
                {(a3[2][1])%4+1,(a3[1][1])%4+1,(a3[0][1])%4+1},
                {(a3[2][2])%4+1,(a3[1][2])%4+1,(a3[0][2])%4+1}
        };
        int[][] a5 = {
                {(a4[2][0])%4+1,(a4[1][0])%4+1,(a4[0][0])%4+1},
                {(a4[2][1])%4+1,(a4[1][1])%4+1,(a4[0][1])%4+1},
                {(a4[2][2])%4+1,(a4[1][2])%4+1,(a4[0][2])%4+1}
        };
        int[][] a1 = {
                {a2[0][0],a2[0][1],a2[0][2],a3[0][0],a3[0][1],a3[0][2]},
                {a2[1][0],a2[1][1],a2[1][2],a3[1][0],a3[1][1],a3[1][2]},
                {a2[2][0],a2[2][1],a2[2][2],a3[2][0],a3[2][1],a3[2][2]},
                {a5[0][0],a5[0][1],a5[0][2],a4[0][0],a4[0][1],a4[0][2]},
                {a5[1][0],a5[1][1],a5[1][2],a4[1][0],a4[1][1],a4[1][2]},
                {a5[2][0],a5[2][1],a5[2][2],a4[2][0],a4[2][1],a4[2][2]}
        };

        System.out.println("The grille:");

        for (int line = 0; line < a1.length; line++) {

            for (int column = 0; column < a1[line].length; column++) {
                System.out.print(a1[line][column] + " ");
            }
            System.out.println();
        }
        System.out.println("");
        System.out.println("Program is using '1' as holes in the grille.");
        System.out.println("");

        return a1;
    }

    public static char[][] encrypt(String text) {
        int[][] a1 = creategrille();

        String text1 = substring(text, 0, 9);

        int[] ar = {0,9,18,27,36};
        char[][] out = new char[6][6];

        int i = 0;
        while(i<4) {
            int a = 0;
            int b = 0;
            int x = 0;

            while (x < text1.length()) {
                if(a1[a][b]==1){
                    out[a][b] = text1.charAt(x);
                    x=x+1;
                    if (b<5){
                        b=b+1;
                    }
                    else if(a<5){
                        a=a+1;
                        b=0;
                    }
                }
                else if (b<5){
                    b=b+1;
                }
                else if(a<5){
                    a=a+1;
                    b=0;
                }

            }
            i = i+1;
            int m = ar[i];
            int n = m+9;
            text1 = substring(text, m, n);
            a1 = rotate(a1);


        }
        return out;
    }

    public static String substring(String str, int start, int end) {

        String out = "";
        if (start > end) {
            return out;
        }
        if (start < 0) {
            start = 0;
        }
        if (end > str.length() - 1) {
            end = str.length();
        }
        while (start < end) {
            out = out + str.charAt(start);
            start = start + 1;

        }
        return out;

    }

}
