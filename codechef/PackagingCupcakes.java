
import java.util.Scanner;

public class PackagingCupcakes{
 
public static void main(String[] args) {
    Scanner ab = new Scanner(System.in);
    int C = ab.nextInt();
	while(C>=1)  {
        int N = ab.nextInt();
        System.out.println((N/2)+1);
        N--;
    }
    
}


}
