import java.util.Arrays;
import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner ar=new Scanner(System.in);
        System.out.println("Enter the array size");
        int size=ar.nextInt();
        int[] arr1=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter the element");
            int val=ar.nextInt();
            arr1[i]=val;
            System.out.println(Arrays.toString(arr1));
            int len=arr1.length;
            System.out.println(len);
        }

    }
}
