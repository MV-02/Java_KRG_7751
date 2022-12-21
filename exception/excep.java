import java.util.Scanner;

public class excep {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
            
        System.out.println("Enter the string");
        if(!sc.hasNextInt())
            throw new NumberFormatException();
        String a=sc.nextLine();
        System.out.println(a);
        } catch (Exception e) {
            System.out.println("Please enter a string");
        }
        
        sc.close();
    }
}
