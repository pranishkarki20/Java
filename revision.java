import java.util.Scanner ;
class revision{
    public static void main (String  a[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        int result = (n % 2 == 0) ? 10 : 20 ;
        System.out.println(result);
    }
}