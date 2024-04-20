import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Shenoni nje tekst:");
        String text = scanner.nextLine();
        if (text.length() < 36) {
            while (text.length() < 36) {
                text = text + "x";
            }
        }
        if (text.length() != 36) {
            text = fleissner_decrypt.substring(text, 0, 36);
            System.out.println("Teksti shume i gjate, teksti i cili do enkriptohet: " + text);
        }

        char[][] out = fleissner_encrypt.encrypt(text);
        for (int line = 0; line < out.length; line++) {

            for (int column = 0; column < out[line].length; column++) {
                System.out.print(out[line][column] + " ");
            }

            System.out.println();
        }


        System.out.println("\n");
        for (int line = 0; line < out.length; line++) {
            for (int column = 0; column < out[line].length; column++) {
                System.out.print(out[line][column] + "");
            }
        }
        System.out.println();

    }
}
