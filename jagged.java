public class jagged {
    public static void main (String a[])
    {
        int nums[][] = new int[3][];

        nums[0] = new int[3];
        nums[1] = new int[4];
        nums[2] = new int [2];

        nums[0][0] = 10 ;
        nums[0][1] = 10 ;
        nums[0][2] = 10 ;
        nums[1][2] = 10 ;
        nums[2][0] = 10 ;

        for(int i = 0 ; i < 3 ; i++){
            for (int j = 0 ; j < 3
                 ; j++){
        System.out.println(nums[i][j]);
        }
        System.out.println();    
}
}
}
