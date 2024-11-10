import java.util.Scanner;

public class maxvalue_minvalueof_array {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Array Size :");
        int size = s.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        int maxvalue = arr[0];
        int minvalue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxvalue) {
                maxvalue = arr[i];
            }
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minvalue) {
                minvalue = arr[i];
            }
        }
        System.out.println("Maximum Value is :" + maxvalue);
        System.out.println("Minimum Value is :" + minvalue);

    }

}
