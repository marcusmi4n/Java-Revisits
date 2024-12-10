import java.util.Scanner;

public class grading{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int marks;
        int total;
        float av;

        //for (int i = 0; i < 3; i++) {
         //   int[] mks = new int[3];
         //   System.out.println("Enter "+i+" Mark :" );
          // mks[i] = scanner.nextInt();

          // total =mks[0] + mks[1] + mks[2];
          // av = total / 3;
           //System.out.println("Elements :"+ mks[i]);
           // System.out.println("Total Marks :"+total);
          //  System.out.println("Average :"+av);70
       // }
        int i = 0;
        int[] mks = new int[3];

       while(i < 3){
        System.out.println("Enter Mark :" );
        mks[i] = scanner.nextInt();
        //.out.println("Marks :"+mks[i]);
        i++;
       }

       total =mks[0] + mks[1] + mks[2];
       av = total / 3;
       System.out.println("Total Marks :"+total);
       System.out.println("Average :"+av);
       
    }
}