import java.util.Scanner;

public class Photobooks{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        int l = s.length();
        System.out.println(((l+1)*26)-l);

    }
}