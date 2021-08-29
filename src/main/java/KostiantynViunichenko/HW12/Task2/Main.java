package Task2;

import KostiantynViunichenko.HW12.Task2.Class;

public class Main {
    public static void main(String[] args) {
        Class first = new Class();
        Class second = new Class();
        System.out.println(first.speed());
        System.out.println(second.speed(first));
    }
}
