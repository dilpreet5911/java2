public class count_even_num {
    public static void main(String[] args) {
        int[] arr = { 111, 252, 93, 84, 555, 456, 47, 85, 90, 10 };
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println("Number of even numbers: " + count);
    }
}
