import java.util.Scanner;
import java.util.Arrays;

public class AppleOrange {
    public static void main(String[] args){
      
        Scanner sc = new Scanner(System.in);
       //distance of Sam's house
        int s = sc.nextInt();
        int t = sc.nextInt();

        //position of both trees
        int a = sc.nextInt();
        int o = sc.nextInt();

        //number of fruits
        int na = sc.nextInt();
        int no = sc.nextInt();

        //position of fruits
        int[] a1 = new int[na];
        int[] o1 = new int[no];

        for(int i = 0; i < na; i++){
            a1[i] = sc.nextInt();
        }
        for(int i = 0; i < no; i++){
            o1[i] = sc.nextInt();
        }
        
    }
    
}
