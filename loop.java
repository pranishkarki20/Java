import java.util.Scanner;
class loop{
    public static void main (String a[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        System.out .print("You have entered " + n);
        sc.nextLine();
        System.out.print("Enter your full name ");
        String name = sc.nextLine();
        System.out.println("Name:" + name );
        sc.nextLine();
        System.out.println("Enter you address");
        String address = sc.nextLine();
        System.out.println("Address:" + address);
    }