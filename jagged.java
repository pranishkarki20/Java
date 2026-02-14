public class jagged {
    public static void main (String a[])
    {
        int nums[][] = new int[3][];

        nums[0] = new int[3];
        nums[1] = new int[4];
        nums[2] = new int [2];

        nums[0][0] = 10 ;
        nums[1][2] = 10 ;
        nums[2][0] = 10 ;
        
        System.out.println(nums[1][2]);
}
}
