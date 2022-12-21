import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;
import java.util.*;
import java.lang.Math;

public class sitarabucks {
    Queue<Double> waitqueue = new LinkedList();

    public int placeorder() {
        double rand = Math.random();
        waitqueue.add(rand);
        wait(10000);
        timetoprep(waitqueue.remove());
    }
    public void timetoprep(Double tokennum){
        // sleep(5000);
        waitqueue.remove(tokennum);
    }

    public static void Cust
    {
        int customerInput;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("MAIN MENU");
            System.out.println("=========");
            System.out.println("1. Place order : ");
            System.out.println("2. Check order : ");
            System.out.println("3. Exit : ");
            System.out.println("Enter your choice (1..3) : ");
            customerInput = sc.nextInt();
        } while (customerInput != 6);

        if (customerInput == 1)
            placeorder();
    }

    public static void main(String[] args) {
    }

}
