public class MaxProduct {
    public static void main(String[] args) {
        int[] arr = {2, 3, -10, -20, 4};
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int product = arr[i] * arr[j];
                if (product > max) {
                    max = product;
                }
            }
        }
        System.out.println("Maximum product is: " + max);
    }
}
