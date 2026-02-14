class stduent{
    int rollno ;
    String name ; 
    int marks;
}

public class stduents{ 
    public static void main(String a[]){
    stduent s1 =  new stduent();
    s1.rollno = 11 ; 
    s1.name = "Pranish Kari " ;
    s1.marks = 23 ;

    stduent s2 =  new stduent();
    s2.rollno = 11 ; 
    s2.name = "Prish Kari " ;
    s2.marks = 23 ;

    stduent s3 = new stduent();
    s3.rollno = 12 ; 
    s3.name = "ram";
    s3.marks = 46;

    stduent student[]=new stduent[3];
    student[0] = s1; 
    student[1]= s2 ; 
    student[2] = s3 ; 

     for(int i = 0 ; i < student.length ; i++){
            System.out.println(student[i].name + " " + student[i].rollno);
        }
  }  
}

/*public class arrayobj {
    public static void main(String[] args){
        int nums [] = new int [6];
        nums[0] = 8 ;
        nums[1] = 8 ;
        nums[2] = 8 ;
        nums[3] = 8 ;

        for(int i = 0 ; i < nums.length ; i++){
            System.out.println(nums[i]);
        }
    }
}
*/