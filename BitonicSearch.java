import java.util.Scanner;

public class BitonicSearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

           //calculating time
           long st = System.currentTimeMillis();

           int n = sc.nextInt();
           int[] a = new int[n];
           int k = 0;//for storing index of max element

           //taking elements from the user
           for(int i = 0 ; i < n ; i++){
               a[i] = sc.nextInt();
           }
            //taking search element 
            int s = sc.nextInt();

           //finding maximum element
           int max =0;
           for(int i = 0 ; i < n ; i++){
                if(a[i] > max){
                max = a[i];
                k = i;
                }
           }
           
           //dividing array into two
           int[] b = new int[k+1];
           int[] c = new int[n-(k+1)];
           
           for(int i = 0 ; i < k+1 ; i++){
           b[i] = a[i];
           }
        int t = k+1,l = 0;
        while(t<n && l<(n-(k+1))){
            c[l] = a[t];
            t++;
            l++;
        }
        int v = binary(k+1, b , s);
        if(v==-1){
        v = binary(n-(k+1) , c , s);
        v = v+k+1;
        }

        //calculating time
        long ed = System.currentTimeMillis();
                   
         System.out.println(s+" is at index "+v);  
          System.out.println("Elapsed time : "+(ed-st)/1000);
    }

    //function for binary search
    public static int binary(int n, int a[] , int t){
        int start = 0;
        int end = n-1;
         while(start <= end){
            int mid = start+(end-start)/2;
            if(a[mid] == t)
                 return mid;
            else if(a[mid] > t)
              end = mid-1;
            else 
             start = mid+1;
            
         }
         return -1;
    }
}
