import java.util.Scanner;
import java.util.Arrays;

public class mergedtwoarray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Size of Array:");
        int size1 = s.nextInt();
        int[] array1 = new int[size1];

        System.out.println("Enter the elements of array:");
        for (int i = 0; i < size1; i++) {
            array1[i] = s.nextInt();
        }
        System.out.println("Enter the Size of second array:");
        int size2 = s.nextInt();
        int[] array2 = new int[size2];

        System.out.println("Enter the elements of array:");
        for (int i = 0; i < size2; i++) {
            array2[i] = s.nextInt();
        }
        int mergedarray[] = new int[size1 + size2];
        for (int i = 0; i < size1; i++) {
            mergedarray[i] = array1[i];
        }
        for (int i = 0; i < size2; i++) {
            mergedarray[size1 + i] = array2[i];
        }
        System.out.println("Emrged array:" + Arrays.toString(mergedarray));
    }
}
