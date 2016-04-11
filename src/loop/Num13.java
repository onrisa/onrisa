package loop;
import java.util.Scanner;
public class Num13 {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
        int a,b,c;
        System.out.print("Enter you num : ");
        a = in.nextInt();
        for(b=1;b<=12;b++)
        {
            c = a * b;
                    
            System.out.println(a+" * "+b+" = "+c);
        }
    }
    
}