// public class charoccurence{
//     public static void main(String[] args) {
//         String a="safkjbkjdvbkja";
//         char b='a';
//         int i=a.length()-1,c=0;
//         while(i!= 0){
//             if (a.charAt(i)==b){
//                 c+=1;
//             }
//             i--;
//             // if(b== a.charAt(a.length()-1)){
//             //     c++;
//             // }
//             // a = a/10;
//         }
//         System.out.println(c);
//     }
// }

/**
 * testocu
 */
public class charoccurence {
    static int o=0;
    static int occ(StringBuilder a){
        char b='a';
        if(a.charAt(a.length()-1)==b){
            o+=1;
        }
        if(a.length()>1) {
            a.deleteCharAt(a.length()-1);
            occ(a);
        }
        return o;
    }
    public static void main(String[] args) {
        StringBuilder a= new StringBuilder("KJfdsfdslfsaasdklaa");
        System.out.println( occ(a));
    
}}