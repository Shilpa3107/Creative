import java .util.*;

public class TwoDarray
 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int a[][] = new int[6][6];
        for(int i =0;i<6;i++){
            for(int j =0;j<6;j++){
                a[i][j] = sc.nextInt();
            }//closing of inner for loop
        }//closing of outer for loop


    }//closing of main function

    public static int hourglass(int arr[][])
    {
         int l = arr.length;

         int sum =0,sum1=0;
         for(int i =0;i<l;i++){
            for(int j =0;j<l;j++){
                if((i==1 && j==0) || (i==1 && j==2))
                sum1 = sum1+arr[i][j];
                else
                sum = sum+arr[i][j];
            }
         }
         return sum;
    }
}//closing of class
