package KostiantynViunichenko.HW7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task8 {
    public static void main(String[] args) {
        System.out.println(test("google.com"));
        System.out.println(test("reference1.ua"));
        System.out.println(test("reference1.org"));
    }
    public static boolean test(String testString) {
        Pattern pattern =
                Pattern.compile(".+\\.(com|ua|org)");
        Matcher matcher = pattern.matcher(testString);
        return matcher.matches();
    }
}

