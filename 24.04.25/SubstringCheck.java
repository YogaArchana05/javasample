public class SubstringCheck {
    public static void main(String[] args) {
        String mainString = "HelloWorld";
        String subString = "World";
        if (mainString.contains(subString)) {
            System.out.println("Yes, it's a substring.");
        } else {
            System.out.println("No, it's not a substring.");
        }
    }
}
