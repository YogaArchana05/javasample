public class RemoveSpecialCharacters {
    public static void main(String[] args) {
        String str = "Hello@# World!! 123";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if ((c >= 'A' && c <= 'Z') || 
                (c >= 'a' && c <= 'z') || 
                (c >= '0' && c <= '9') || 
                c == ' ') {
                result += c;
            }
        }

        System.out.println("Cleaned string: " + result);
    }
}
