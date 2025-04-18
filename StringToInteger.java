public class StringToInteger {
    public static void main(String[] args) {
        String str = "1274";
        try {
            int num = Integer.parseInt(str);
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format");
        }
    }
}
