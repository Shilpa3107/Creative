import java.util.Scanner;


public class Binarysearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] a = new int[n];

        //taking input from the user
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        long st = System.currentTimeMillis();

        //performing binary search
        int ind = -1;//for storing index of target element
        int start = 0;
        int end = n-1;
        while(start <= end){
             int mid = start+(end-start)/2;

             if(a[mid] == target)
             ind = mid;
             else if(a[mid] < target)
             start = mid+1;
             else 
             end = mid-1;
        }
         long ed = System.currentTimeMillis();

        System.out.println(target+" is present at the index "+ind);
        System.out.println("Elapsed time : "+(ed-st)/1000);

    }
}
