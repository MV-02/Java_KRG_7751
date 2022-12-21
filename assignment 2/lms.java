import java.util.*;

class Book {
    String title;
    boolean[] flag = new boolean[10];

    int[] user_rating = new int[10];

    void being_checkedout(int i) {
        if (flag[i])
            flag[i] = false;
    }

    void being_returned(int j) {
        if (!flag[j])
            flag[j] = true;
    }

    void receive_a_rating(int n, int no) {
        user_rating[n] = no;
    }
}

class Bookstore extends Book {
    Book obj = new Book();
    String[] Books = new String[10];
    int[] rate = new int[10];
    int i = 0;

    void addBook(String title) {

        Books[i++] = title;
    }

    void checkOut(String nm) {

        int j, index = 11;
        for (j = 0; j < 5; j++) {
            if (Books[j] == null) {
                break;
            }
            if (Books[j].equals(nm)) {
                index = j;
            }
        }
        if (index == 11) {
            System.out.println("Book not found. Please add the book!!!");
        } else {
            System.out.println(nm + " has been checked out successfully!!!");
            being_checkedout(index);
        }
    }

    void returnBook(String nm) {
        int j, index = 11;
        for (j = 0; j < 10; j++) {
            if (Books[j] == null) {
                break;
            }
            if (Books[j].equals(nm)) {
                index = j;
            }
        }
        if (index == 11) {
            System.out.println("Book not found. Please add the video!!!");
        } else {
            System.out.println(nm + " has been returned successfully!!!");
            being_returned(index);
        }
    }

    void receiveRating(String n, int no) {
        int j, index = 11;
        for (j = 0; j < 10; j++) {
            if (Books[j] == null) {
                break;
            }
            if (Books[j].equals(n)) {
                index = j;
            }
        }
        if (index == 11) {
            System.out.println("Book not found. Please add the video!!!");
        } else {
            System.out.println(n + " has been rated successfully!!!");
            rate[index] = no;
            receive_a_rating(index, no);
        }
    }

    void listInventory() {
        int i;

        for (i = 0; i < 10; i++) {
            if (flag[i] && Books[i] != null) {
                System.out.println(Books[i] + " " + user_rating[i]);
            }
        }

    }
}

public class lms extends Bookstore {
    public static void main(String args[]) {
        Bookstore mylibrary = new Bookstore();
        Arrays.fill(mylibrary.flag, true);
        Scanner sc = new Scanner(System.in);
        int customerInput;
        String Name;
        int Rating;
        mylibrary.addBook("The Matrix");
        mylibrary.addBook("Godfather");
        mylibrary.addBook("Harry potter");
        mylibrary.addBook("Star Wars");

        do {
            System.out.println("MAIN MENU");
            System.out.println("=========");
            System.out.println("1. Add book : ");
            System.out.println("2. Check out book : ");
            System.out.println("3. Return book : ");
            System.out.println("4. Receive Rating : ");
            System.out.println("5. List Inventory : ");
            System.out.println("6. Exit : ");
            System.out.println("Enter your choice (1..6) : ");
            customerInput = sc.nextInt();

            switch (customerInput) {
                case 1: {
                    System.out.println("Enter the name of the book you want to add...");
                    sc.nextLine();
                    Name = sc.nextLine();
                    mylibrary.addBook(Name);
                    System.out.println(Name + " has been added successfully!!!");
                    break;
                }
                case 2: {
                    System.out.println("Enter the name of the book you want to check out...");
                    sc.nextLine();
                    Name = sc.nextLine();
                    mylibrary.checkOut(Name);
                    break;

                }
                case 3: {
                    System.out.println("Enter the name of the book you want to return...");
                    sc.nextLine();
                    Name = sc.nextLine();
                    mylibrary.returnBook(Name);
                    break;

                }
                case 4: {
                    System.out.println("Enter the name of the book whose rating you want to add...");
                    sc.nextLine();
                    Name = sc.nextLine();
                    System.out.println("Enter the rating: ");
                    Rating = sc.nextInt();
                    mylibrary.receiveRating(Name, Rating);
                    break;

                }
                case 5:
                    System.out.println("Available Books are:");
                    mylibrary.listInventory();
                    break;

                default:
                    System.out.println("This is an Invalid Input!");
                    break;

            }
        } while (customerInput != 6);
        sc.close();

    }
}