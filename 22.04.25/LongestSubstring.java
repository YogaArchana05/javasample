import java.util.Scanner;

public class LongestSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            String temp = "";
            for (int j = i; j < s.length(); j++) {
                char c = s.charAt(j);
                if (temp.indexOf(c) == -1) {
                    temp += c;
                    if (temp.length() > max)
                        max = temp.length();
                } else {
                    break;
                }
            }
        }
        System.out.println(max);
    }
}
