import java.util.Scanner;

public class Question_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m;
        int av;
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        /*int[]scores = new int[5];

        while(m < 5){
            System.out.print("ENTER SCORE :");
            scores[m] = sc.nextInt();
             
           

            m++;
            
        }
        
        av = (scores[0] + scores[1] + scores[2]+ scores[3]+ scores[4]) / 5;
           for(m = 0; m < 5; m++){
             if( scores[m] > max){
                max = scores[m];
            }
            if( scores[m] < min){
                min = scores[m];
            }
           
           }*/
          System.out.println("ENTER SCORES:");
           for(m = 0; m < 5; m++){

            System.out.print("SCORE "+ (m + 1)+" : ");    
            int score = sc.nextInt();


            if( score > max){
               max = score;
           }
           else if( score < min){
               min = score;  
           }
           //av = score / 5;
        }
          // System.out.println("Average Score : " + av);
           System.out.println("Highest Score : " + max);
           System.out.println("Lowest Score : " + min);
        sc.close();
    }
}
  
