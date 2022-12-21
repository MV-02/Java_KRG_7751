class xception extends Exception{
    xception(String a){
        super(a);
    }

}
public class b {
    public static int dividenum(int m,int n) throws ArithmeticException {
        int div=m/n;
        return div;

    }
    // public static void main(String[] args) {
    //     b o=new b();
    //     try {
    //         System.out.println(o.dividenum(45, 0));
    //     } catch (ArithmeticException e) {
    //         System.out.println("\nNumber cannot divide by 0");// TODO: handle exception
    //     }
    //     System.out.println("LaLa ");
    // }
    
    public static void main(String[] args) throws xception{
        throw new xception("Meri Meri Exception hai ye Dekh mat jada");
        // System.out.println(10/0);
    }
}
