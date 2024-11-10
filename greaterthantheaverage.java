public class greaterthantheaverage {
    public static void main(String[] args) {
        int[] array = { 1, 4, 17, 7, 25, 3, 100 };
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        float average = sum / array.length;
        System.out.println("The average of the said array is :" + average);
        System.out.println("The numbers in the said array that are greater than the average are:");
        for (int i = 0; i < array.length; i++) {
            if (array[i] > average) {
                System.out.println(array[i]);
            }
        }
    }
}
