import java.util.Scanner ;

public class practice{
    public static void  add(int a , int b){
        int result = a + b ;
        System.out.println("The  sum of number you have entered is " + result);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to  print");
        int a = sc.nextInt();
        System.out.println("Enter the number you want to  print");
        int b = sc.nextInt();
        add(a, b);

    }
}