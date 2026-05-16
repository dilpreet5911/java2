public class frequency {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 5, 5 };
        int[] freq = new int[5];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i] - 1]++;
        }
        for (int i = 0; i < freq.length; i++) {
            System.out.println("element " + i + ", frequency " + freq[i]);
        }
    }
}
