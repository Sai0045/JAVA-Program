import java.util.Scanner;

public class ReplacecharacterofString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Name : ");
        String name = s.nextLine();
        String newname = "";

        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == 'S') {
                newname += 's';
            } else {
                newname += name.charAt(i);
            }
        }
        System.out.println(newname);
    }
}
