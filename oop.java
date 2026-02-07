class Computer{
    public void playMuisc(){
        System.out.println("Music is playing");
    }

    public int  getpen( int cost)
    {
        return cost ;
    }
}

public class oop
{
    public static void main(String a[])
        {
            Computer comp = new Computer();
            comp.playMuisc();
           int str = comp.getpen(5);
           System.out.println(str);
           int b = comp.getpen(10);
           System.out.println(b);
           
        }
}