public class  casting{
    public static void main(String[] args) {
        int b = 257;
        byte a = (byte) b ;
        float f = 3.5f;
        int c = (int) f;

        byte  e = 10;
        byte h = 30 ; 
        int result = e * h ; 
        System.out.println(result);
        System.out.println(b);
        System.out.println(a);
        System.out.println(c);
    }
}