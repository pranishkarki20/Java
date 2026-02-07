import java.util.Scanner;
class odd {
    public void  num( int b){
        if (b < 0 ) {
            System.out.println("The given number is negative");
        }
        else
        {
            System.out.println("The given number is positive");
        }

    }
}
public class number {
    public static void main (String a[])
        {
            System.out.println("Enter the number");
            Scanner numb = new Scanner(System.in);
            int n = numb.nextInt();
            odd od = new odd();
            od.num(n);
        }
}