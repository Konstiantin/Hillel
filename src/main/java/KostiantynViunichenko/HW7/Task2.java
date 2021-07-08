package KostiantynViunichenko.HW7;

//Условие задачи: ввести 2 слова с клавиатуры, состоящие из
//        четного числа букв. Получить слово состоящее из первой половины
//        первого слова и второй половины второго слова. Вывести
//        полученное слово на экран
//        String a = “1122”;
//        String b = “3344”;
//        ”Result: 1144

import java.io.IOException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String s1, s2;
        System.out.println("Введите первое слово: ");
        s1 = scanner.nextLine();
        System.out.println();
        System.out.println("Введите второе слово: ");
        s2 = scanner.nextLine();

         s1 = s1.substring(0, (s1.length()/2));
         s2 = s2.substring((s2.length()/2));
         String result = s1+s2;

        System.out.println("String a = "+ s1);
        System.out.println("String b = "+ s2);
        System.out.println("Result: "+result);
    }
}