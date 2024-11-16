import java.util.Scanner;

public class LocationOfArray {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Number of Rows of Array: ");
        int rows = s.nextInt();

        System.out.println(" Enter the Number of Columns of Array:");
        int columns = s.nextInt();

        int array[][] = new int[rows][columns];

        System.out.println("Enter the Elements of Array: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = s.nextInt();

            }
        }
        System.out.println("The Mitrix is :");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Enter the Number:");
        int x = s.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (array[i][j] == x) {
                    System.out.println("x fount at location (" + i + "," + j + ")");
                }
            }
        }
        System.out.println();
    }
}
