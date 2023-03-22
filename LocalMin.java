import java.util.*;

public class LocalMin {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int count = 0;

        //Taking input from the user
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        //finding local minimum
        for(int k = 0; k < n; k++){
            for(int i = k+1; i < n; i++){
                for(int j = i+1; j < n; j++){
                   if((a[i] < a[j]) && (a[i] < a[k]))
                   System.out.println(a[i]+" is at index "+i);
                }
            }
        }

        //counting number of elements
        for(int k = 0; k < n; k++){
            for(int i = k+1; i < n; i++){
                for(int j = i+1; j < n; j++){
                   if((a[i] < a[j]) && (a[i] < a[k]))
                   count++;
                }
            }
        }
         System.out.println("Number of elements : "+count);    
    }
}
