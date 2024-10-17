import java.util.Scanner;
public class lagestvalue {
    public static void main(String[] args) {
        Scanner val = new Scanner(System.in);
        int maxvalue=0;
//        int i;

        for (int i = 0; i <5; i++){
            System.out.println("enter number" );
            int num = val.nextInt();
//            maxvalue=num;
            if(i==0){
                maxvalue=num;
            }
            else{
                if(num>maxvalue){
                    maxvalue=num;
                }
            }
            System.out.println("maxvalue is "+ maxvalue);
        }

    }
}
