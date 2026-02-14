public class classes2{
    class students {
        String name ; 
        int roll ; 
        String Usn ;

           public String toString() {
            return name + " " + roll + " " + Usn;
        } 
    }

    public static void main(String[] args){
        classes2  obj = new classes2();
        students s1 = obj.new students();
        s1.name = "Pranish";
        s1.roll = 23;
        s1.Usn = 25 + "BTRCN" +160 ;
        
        students data[] = {s1};
        for( students Y: data){
            System.out.println(Y);
            System.out.println();
        }
}
}