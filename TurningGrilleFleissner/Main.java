package TurningGrilleFleissner;
  
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        System.out.println("\n");
        System.out.println("Deshironi te enkriptoni (1) ose dekriptoni (2)?");
        int d = scanner.nextInt();

        System.out.println("Vendosni tekstin:");
        String text = scanner2.nextLine();

        if (text.length() < 36) {
            while (text.length() < 36) {
                text = text + "x";
            }
        }

        if (text.length() != 36) {
            text = Substring.substring(text, 0, 36);
            System.out.println("Teksti shume i gjate, teksti i cili do enkriptohet: " + text);
        }

        if (d == 1) {
            char[][] out = Encryption.encrypt(text);
            for (int row = 0; row < out.length; row++) {
                for (int column = 0; column < out[row].length; column++) {
                    System.out.print(out[row][column] + " ");
                }
                System.out.println();
            }

            System.out.println("\r");
            System.out.println("Teksti i enkriptuar eshte: ");
            for (int row = 0; row < out.length; row++) {
                for (int column = 0; column < out[row].length; column++) {
                    System.out.print(out[row][column]);
                }
            }
            System.out.println();
        }

        if (d == 2) {
            System.out.println("Teksti i dekriptuar eshte: ");
            char[][] out = Decryption.decrypt(text);
            for (int row = 0; row < out.length; row++) {
                for (int column = 0; column < out[row].length; column++) {
                    System.out.print(out[row][column]);
                }
            }
            System.out.println();
        }
    }
}






