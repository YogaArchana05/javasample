import java.util.Scanner;

public class ValidNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        boolean valid = true;
        int dot = 0;
        if (str.length() == 0) valid = false;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '.') {
                dot++;
                if (dot > 1) {
                    valid = false;
                    break;
                }
            } else if (i == 0 && c == '-') {
                continue;
            } else if (c < '0' || c > '9') {
                valid = false;
                break;
            }
        }
        if (valid && !str.equals("-") && !str.equals(".")) System.out.println("Valid");
        else System.out.println("Invalid");
    }
}
