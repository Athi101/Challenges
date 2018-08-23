import java.util.Scanner;

public class BearAndBigBrother{
    public static void main(String[] args) {
        
        int a = 0 , b = 0 , k = 0;
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        b = s.nextInt(); 
        s.close();
        while(a<=b){
                a = a*3;
                b = b*2;
                k++;
        }
        System.out.println(k);
    }
}