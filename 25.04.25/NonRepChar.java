import java.util.*;

public class NonRepChar {
    public static void main(String[] args) {
        String str = "ggaabc";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (ch == str.charAt(j)) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print("First non-repeating char: " + ch);
                break;
            }
        }
    }
}
