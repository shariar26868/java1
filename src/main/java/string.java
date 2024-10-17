import java.util.Scanner;
public class string {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        String s1=str.nextLine();
        System.out.println(s1);
        System.out.println(s1.length());
        for(int i=0;i<s1.length();i++){
            System.out.println(s1.charAt(i));
        }
    }
}
