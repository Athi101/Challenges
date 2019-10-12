import java.io.InputStream;
import java.util.Scanner;

public class ChefOperators{

    public static void main(String[] args) {

        int T;
        Scanner s = new Scanner(System.in) ;
        T= s.nextInt();
        while (T>0){
            int A = s.nextInt();
            int B = s.nextInt();
            if (A>B){
                System.out.println(">");
            }
            else if (A<B){
                System.out.println("<");
            }
            else{
                System.out.println("=");
            }
            T=T-1;
        }
        

        
    }
}
