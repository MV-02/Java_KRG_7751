public class stringusingcharat {
    public static void main(String[] args) {

        String F = "Mehul";
        String L = new String("Mehul");
        System.out.println(F + " " + L);
        System.out.println(F.compareTo(L)); // compares the characters from starting and if different then return
                                            // difference using assci value difference.
        System.out.println(F.equals(L));
        System.out.println((F + L).substring(1, 4));

    }
}
