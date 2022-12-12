import java.util.Scanner;

public class charoccreplace {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a;
        System.out.println("Enter the string");
        a = sc.nextLine();
        int l1 = a.length();
        System.out.println("Enter the character to find");
        String b;
        b = sc.next();
        a = a.replaceAll(b, "");
        l1 = l1 - a.length();
        System.out.println(l1);
        sc.close();

    }
}