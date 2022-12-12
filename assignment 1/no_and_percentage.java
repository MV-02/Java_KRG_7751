import java.util.Scanner;

// calculate the no and percentage of lower case upper case digits and other chars in string
public class no_and_percentage {

    public static void main(String[] args) {
        int lower, upper, digit, special;
        special = lower = digit = upper = 0;
        Scanner sc = new Scanner(System.in);
        String a;
        System.out.println("Enter the string");
        a = sc.nextLine();
        int len=a.length();
        for (char c : a.toCharArray()) {
            if (Character.isLowerCase(c)) {
                lower++;

            } else if (Character.isUpperCase(c)) {
                upper++;

            } else if (Character.isDigit(c)) {
                digit++;

            } else {
                special++;
            }

        }
        System.out.println("Lower "+lower + "Upper " + upper + "Digit " + digit + "Special " + special);
        System.out.println("Lower percentage "+lower/len*100 + "Upper percentage " + upper/len*100 + "Digit percentage " + digit/len*100 + "Special percentage " + special/len*100);
        sc.close();
    }
}
