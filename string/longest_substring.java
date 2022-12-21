public class longest_substring {
    public static void main(String[] args) {
        String a="I am a Good Doctor";
        String[] b= a.split(" ",a.length()/2);
        int h=0;
        for (int i = 1; i < b.length; i++) {
            if (b[i].length()>=b[h].length()) {
                h=i;
            }
        }
        System.out.println(b[h]);
    }

}
