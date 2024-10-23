import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int size = s.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the Elements :");
        for (int i = 0; i < array.length; i++) {
            array[i] = s.nextInt();
        }
        int min = array[0];
        int max = array[0];
        for (int i = 0; i < size; i++) {
            if (min > array[i]) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Maximum Value is :" + max);
        System.out.println("Minimun value is :" + min);
    }

}
