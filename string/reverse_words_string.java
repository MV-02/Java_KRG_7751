public class reverse_words_string {
    public static void main(String[] args) {
        String a="compare to string";
        String[] b= a.split(" ",a.length()/2);
        String res="";
        for (int i = b.length-1; i >= 0; i--) {
            res = res+b[i]+" ";
        }
        System.out.println(res);
    }
}
