import java.util.Scanner ;

public class practice{
    public static int  add(int a , int b){
        int result = a + b ;
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to  print");
        int a = sc.nextInt();
        System.out.println("Enter the number you want to  print");
        int b = sc.nextInt();
        System.out.println("The number you have entered is " + add(a, b));

    }
}