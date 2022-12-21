public class reverse_string {
    public static void main(String[] args) {
        String a="compare to string";
        char[] b=a.toCharArray();
        int l=b.length;
        char temp;
        for (int i = 0; i < b.length/2; i++) {
            temp=b[i];
            b[i]=b[l-i-1];
            b[l-i-1]=temp;

        }
        System.out.println(b);
    }
}
