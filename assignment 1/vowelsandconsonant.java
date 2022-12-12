// wap to count the total no of vowels and consonants in sting. String can contain all char however only lower case alphabets are allowed in string

import java.util.Scanner;

public class vowelsandconsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a;
        System.out.println("Enter the string");
        a = sc.nextLine();
        int con,vo;
        con=vo=0;
        char [] b=a.toCharArray();
        for (char c : b) {
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
                vo++;
            if (c>=97 && c<=122) {
                con++;
            } 

        }
        System.out.println("Consonant "+con+" Vowels "+vo);
        sc.close();
        
    }
}
