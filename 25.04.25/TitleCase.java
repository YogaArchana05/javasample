public class TitleCase {
    public static void main(String[] args) {
        String input = "hello world from java";
        String[] words = input.toLowerCase().split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > 0) {
                words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1);
            }
        }
        String result = String.join(" ", words);
        System.out.println(result);
    }
}

