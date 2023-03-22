import java.util.*;

public class FourSum 
{
    public static void main(String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        int[] a = new int[n];

        //taking input
        for(int i = 0; i < n; i++) 
        {
          a[i] = sc.nextInt();
        }
        //calculating four sum
        for(int i = 0; i < n ; i++)
        {
           for(int j = i+1; j < n ; j++)
           {
            for(int k = j+1; k < n ; k++)
            {
                for(int q = k+1; q < n ; q++)
                {
                    if((a[i]+a[j]+a[k]+a[q]) == 0)
                     System.out.println(a[i]+" "+a[j]+" "+a[k]+" "+a[q]);
                }
            }
           }
        }
        //calcuating no. of pairs
        for(int i = 0; i < n ; i++)
        {
           for(int j = i+1; j < n ; j++)
           {
            for(int k = j+1; k < n ; k++)
            {
                for(int q = k+1; q < n ; q++)
                {
                     if((a[i]+a[j]+a[k]+a[q]) == 0)
                    count++;
                }}}}
                System.out.println("No.of pairs : "+count);
    }
}
