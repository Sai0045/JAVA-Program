public class averageof_array {
    public static void main(String[] args) {
        int sum = 0;
        int arr[] = { 1, 5, 3, 10, 55 };
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double average = sum / arr.length;
        System.out.println("Sum of array is :" + sum);

        System.out.println("Average of array is :" + average);
    }
}
