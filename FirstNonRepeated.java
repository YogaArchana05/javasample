public class FirstNonRepeated {
    public static void main(String[] args) {
        String str = "swiss";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            boolean unique = true;
            for (int j = 0; j < str.length(); j++) {
                if (i != j && c == str.charAt(j)) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                System.out.println("First non-repeated character: " + c);
                break;
            }
        }
    }
}