package VigenereCipher;
import java.util.Scanner;

public class VigenereCipherTest {
    public static void main(String[] args) {

        System.out.println("----Vigenere Cipher----\n");
        Scanner in = new Scanner(System.in);

        // Lejon userin te zgjedh a deshiron enkriptim apo dekriptim te mesazhit
        System.out.println("- Shtyp 1 te enkriptosh mesazhin / Shtyp 2 te dekriptosh mesazhin - ");
        int input = in.nextInt();

        if (input == 1) {
            System.out.print("Shkruani celesin me shkronja te medha: ");
            String key = in.next();
            System.out.print("Jepni mesazhin qe deshironi te enkriptohet me Vigenere Cipher: ");
            String EMessage = in.next();
            String encryptMessage = VigenereCipherEncrypt.encrypt(EMessage, key); // Thirret metoda e enkriptimit nga VigenereCipherEncrypt
            System.out.println("Mesazhi i enkriptuar eshte: " + encryptMessage);
        } else if (input == 2) {
            System.out.print("Shkruani celesin me shkronja te medha: ");
            String key = in.next();
            System.out.print("Jepni mesazhin qe deshironi te dekriptohet me Vigenere Cipher: ");
            String DMessage = in.next();
            String decryptMessage = VigenereCipherDecrypt.decrypt(DMessage, key); //Thirret metoda e dekriptimit nga VigenereCipherDecrypt
            System.out.println("Mesazhi i dekriptuar eshte: " + decryptMessage);
        } else {
            System.out.println("Input i gabuar!");
        }
        in.close();
    }
}
