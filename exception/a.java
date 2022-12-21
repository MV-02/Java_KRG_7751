public class a {
    public static void main(String[] args) {
        dostuff();
    }
    public static void dostuff()throws ArithmeticException,NullPointerException,ArrayIndexOutOfBoundsException{
        try {
            domorestuff();
            // throw new NullPointerException();
        } 
        // finally{}
        // System.out.println("flaskj ");
        catch(NullPointerException e){
            System.out.println(e);
        }
        // catch(NullPointerException e){
        //     System.out.println(e);
        // }
        catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("hi");
        // finally{
        //     System.out.println(" ");
        // }
        // finally{
        //     System.out.println(" ");
        // }
        
    }
    public static void domorestuff
    () throws InterruptedException{
        
        Thread.sleep(10000);
    }
}
