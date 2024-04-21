package TurningGrilleFleissner;

    public class Decryption {
    public static char[][] decrypt(String text) {
        char[][] out = {
                {text.charAt(1), text.charAt(3), text.charAt(5), text.charAt(10), text.charAt(14), text.charAt(19)},
                {text.charAt(22), text.charAt(29), text.charAt(33), text.charAt(8), text.charAt(11), text.charAt(15)},
                {text.charAt(18), text.charAt(23), text.charAt(26), text.charAt(28), text.charAt(31), text.charAt(35)},
                {text.charAt(2), text.charAt(6), text.charAt(13), text.charAt(16), text.charAt(21), text.charAt(25)},
                {text.charAt(30), text.charAt(32), text.charAt(34), text.charAt(0), text.charAt(4), text.charAt(7)},
                {text.charAt(9), text.charAt(12), text.charAt(17), text.charAt(20), text.charAt(24), text.charAt(27)}
        };
        return out;
    }
}

