import java.util.Scanner;

public class stringlowercaseanduppercase {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String a = s.nextLine();

        String lowercaseString = a.toLowerCase();

        System.out.println("LowerCase : " + lowercaseString);

        String uppercaseString = a.toUpperCase();

        System.out.println("UpperCase : " + uppercaseString);
    }
}
