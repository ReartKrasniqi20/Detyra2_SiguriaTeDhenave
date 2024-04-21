package TurningGrilleFleissner;

public class Substring {
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
