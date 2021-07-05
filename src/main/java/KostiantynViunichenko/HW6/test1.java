package KostiantynViunichenko.HW6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите количество массива");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(reader.readLine());
        int array[] = new int[k];
        System.out.println("Введите цифры для заполнения массива");
        for (int i = 0; i < k; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        int min = array[0];
        int max = array[0];
        int index_min=0;
        int index_max=0;

        for (int i=1 ; i < array.length ; i++){
            if (array[i] < min){
                min=array[i];
                index_min = i;
            }
            if (array[i] > max){
                max=array[i];
                index_max=i;
            }
        }
        //int count= Math.abs (index_max-index_min)-1;
        int count = index_max - index_min;
        if (count<0) {
            count=-count;
        }
        if (count!=0){
            count = count -1;
        }

        /*for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                int s = array[i + 1];
                array[i + 1] = array[i];
                array[i] = s;
            }
        }*/
        //сравнивает первый миним с первым максималным
        System.out.println("Min " + min + " Max " + max +" "+ index_min+" "+index_max + " Количество " + count );
    }
}
