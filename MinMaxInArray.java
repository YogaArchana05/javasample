public class MinMaxInArray {
    public static void main(String[] args) {
        int[] arr = {4, 2, 9, 1, 5, 6};
        int min = arr[0], max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}