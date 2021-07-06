package HW_TEST;
import java.util.Arrays;

public class test3 {
    public static void main(String[] args) {

        int array[] = {1, 5, 7, 8, 7, 0};
        int sum1 = 0;
        int sum2 = 0;


        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sum2 += array[i];
            } else {
                sum1 += array[i];
            }
            // sum2 = sum2 + array[i];
        }
        System.out.println("array: " + Arrays.toString(array));
        System.out.println("nechet sum: " + sum2);
        System.out.println("chet sum: " + sum1);
        System.out.println("Билет счасливый: " + (sum1 == sum2));
        //System.out.println("sum1 "+ sum1 + " sum2 " +sum2);
        // if (sum1 == sum2)
        //{
        if ((array[0] + array[2] + array[4]) == (array[1] + array[3] + array[5])) {
            System.out.println("Билет счасливый: ");
        }
        else System.out.println ("не счасливій" );
    }
}
