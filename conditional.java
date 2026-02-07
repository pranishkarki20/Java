public class conditional {
    public static void main(String[] args) {

        int x = 18;
        int y = 10;
        int z = 20;

        if (x > y && x > z) {
            System.out.println("X is greatest");
        } else if (y > x && y > z) {
            System.out.println("Y is greatest");
        } else {
            System.out.println("Z is greatest");
        }

        int result = (x % 2 == 0) ? 10 : 20;
        System.out.println(result);
    }
}
