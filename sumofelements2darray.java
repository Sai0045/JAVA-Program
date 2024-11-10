import java.util.Scanner;

public class sumofelements2darray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter number of Rows:");
        int rows = s.nextInt();
        System.out.println("Enter the number of Columns:");
        int columns = s.nextInt();
        int[][] arr = new int[rows][columns];

        System.out.println("Enter the Elements of Array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("sum of array is:" + sum);
    }
}
