import java.util.Scanner;
public class loop  {
    public static void main(String a[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of time you want to print ");
        int n = sc.nextInt();
        int i = 1 ;
        do
        {
        System.out.println("Hi");
        i++;
        }while( i <= n );
    }
}