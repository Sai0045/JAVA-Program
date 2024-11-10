public class sumofinteger {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;
        while (i < 100) {
            sum += i;
            i++;
            if (i == 50)
                continue;
            System.out.println(i);
        }
        System.out.println("\nSum of first 100 integer are: " + sum);
    }
}
