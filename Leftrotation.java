import java.util.Scanner;
import java.util.Arrays;
import java.lang.StringBuilder;

public class Leftrotation {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        //taking array elements from the user
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
         int d = sc.nextInt();
        String s = Arrays.toString(a);
        

         StringBuilder sb = new StringBuilder(s);
         for(int i = 0;i<sb.length();i++){
            if((sb.charAt(i) == '[' ) || (sb.charAt(i) ==']')  || (sb.charAt(i) == ','))
            sb.delete(i,i+1);
         }
         for(int i = 0; i < sb.length(); i++){
            if(sb.charAt(i) == ' ')
            sb.delete(i,i+1);
         }
        while(d > 0){
             char c = sb.charAt(0);
             sb.delete(0,1);
             sb.append(c);
             d--;
        }
        System.out.println(sb);
        char[] ch = sb.toString().toCharArray();

        for(int i = 0; i < ch.length; i++){
            System.out.print(ch[i]+" ");
        }

    }

}
