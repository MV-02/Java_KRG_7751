import java.util.Scanner;

public class stringsort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a;
        System.out.println("Enter the string");
        a = sc.nextLine();
        char [] b=a.toCharArray();
        char temp;
        int i = 0;
        while (i < b.length) {
            int j = i + 1;
            while (j < b.length) {
                if (b[j] < b[i]) {
                    temp = b[i];
                    b[i] = b[j];
                    b[j] = temp;
                }
                j += 1;
            }
            i += 1;
        }
        System.out.println(b);
        sc.close();
        
    }
}
