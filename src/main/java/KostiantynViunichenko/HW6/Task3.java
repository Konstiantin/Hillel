package KostiantynViunichenko.HW6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите количество чисел массива: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(reader.readLine());
        int array[] = new int[k];
        System.out.println("Введите числа для заполнения массива: ");
        for (int i = 0; i < k; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        int min = array[0];
        int max = array[0];


        for (int i=1 ; i < array.length ; i++){
            if (array[i] < min){
                min=array[i];

            }
            if (array[i] > max){
                max=array[i];

            }
        }
        System.out.println("Минимальное число = " + min);
    }
}

