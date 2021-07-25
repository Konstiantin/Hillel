package KostiantynViunichenko.HW4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class HW4Task1For {

    public static void main(String[] args) throws IOException {
        int digit, sum=0;
        do {
            System.out.println("Enter digit:");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            digit = Integer.parseInt(reader.readLine());
            sum += digit;
        } while (digit != -1);
        System.out.println("Sum of digit = " + (sum) +"\n");
    }
}
