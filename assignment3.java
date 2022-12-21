import java.lang.reflect.Array;
import java.util.*;

/**
 * Array01sort
 */
class Array01sort {

    void sa(int[] a) {
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 1) {
                a[i] = a[i] + a[j];
                a[j] = a[i] - a[j];
                a[i] = a[i] - a[j];
                j++;
            }

        }
        for (int i : a) {
            System.out.println(i);
        }
    }
}

/**
 * Rotatearray
 */
class Rotatearray {
    static void rotate(int[] a, int k) {
        LinkedList<Integer> l = new LinkedList<Integer>();
        
        if (k == 0) {
            for (Integer i : a) {

                System.out.println(i);
            }
        } else if (k > 0) {
            if (k>a.length) {
                k=k%a.length;
            }
            for (int i = a.length - k; i < a.length; i++) {

                l.add(a[i]);
            }
            for (int i = 0; i < a.length - k; i++) {
                l.add(a[i]);
            }
        } else {
            if ((k*-1)>a.length) {
                k=k%a.length;
                System.out.println(k);
            }
            for (int i = (k * -1); i < a.length; i++) {

                l.add(a[i]);
            }
            for (int i = 0; i < (k * -1); i++) {
                l.add(a[i]);
            }
        }
        System.out.println(l);
    }

}


/**
 * kth smallest and largest
 */
class kth {
    static void ksmalllarge(int []a, int k){
        Arrays.sort(a);
        if (k>a.length) {
            k=a.length;
        }
        System.out.println(k+"th Smallest "+a[k-1]);
        System.out.println(k+"th Largest "+a[a.length-k]);
    }

    
}

/**
 * minimum_distance
 */
class minimum_distance {
    static void mdistance(int[] arr){
        Arrays.sort(arr);
        int min=Math.abs(arr[1]-arr[0]);
        for (int i = 1; i < arr.length-1; i++) {
            if(Math.abs(arr[i+1]-arr[i])<min){
            min=Math.abs(arr[i+1]-arr[i]);
        }}
        System.out.println(min);
    }

    
}
public class assignment3 {
    public static void main(String[] args) {
        int[] arr = { 1,2,4,8,10 };
        // Array01sort a=new Array01sort();
        // a.sa(arr);
        // Rotatearray.rotate(arr, -19);
        // kth.ksmalllarge(arr, 8);
        minimum_distance.mdistance(arr);
        
        
    }

}
