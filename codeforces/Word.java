import java.util.Scanner;

public class Word{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = 0, n = 0;
        String a = sc.next();
        for(int i = 0 ; i<a.length() ; i++){
            int j = (int)a.charAt(i);
            if( j >= 65 && j<=90){
                    m++;
            }
            else{
                n++;
            }
        }
        String b;
        if(m>n){
            b = a.toUpperCase();
        }
        else{
            b = a.toLowerCase();
        }
        sc.close();
        System.out.println(b);
    }
        
    
}