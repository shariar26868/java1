import java.util.Scanner;
public class largenumberusisngwhile {
    public static void main(String[] args) {
        Scanner val=new Scanner(System.in);
        int initial=0;
        int maxvalue=0;
        while (initial<5){
            System.out.println("enter a number");
            int num=val.nextInt();
            if(initial==0){
                maxvalue=num;
            }
            else{
                if(num>maxvalue) {
                    maxvalue = num;
                }
            }
            initial+=1;
            System.out.println("maxvalue is " + maxvalue);

        }
    }
}
