import java.util.Arrays;
import java.util.Scanner;

public class Different{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int c = 0;
        int n = sc.nextInt();
        String s = sc.next();
       
        char temp[] = s.toCharArray();
        Arrays.sort(temp);
        if(n>26){
            System.out.println("-1");
          
        }
        else{
            for(int i = 0 ; i<(n-1) ; i++){
                if(temp[i]==temp[i+1]){
                    c=c+1;
                }
            }
            System.out.println(c);
            
        } 
       
    }
}