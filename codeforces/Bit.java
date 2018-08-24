import java.util.Scanner;

public class Bit{

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int c = 0;
        for(int i = 0 ; i<n ; i++){
            String a = s.next();
            if(a.charAt(0) == '+' ||a.charAt(2)=='+'){
                    c++;
            }
            else{
                c--;
            }
        }
        System.out.println(c);
    }
}