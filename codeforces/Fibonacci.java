import java.util.Scanner;

public class Fibonacci{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        sc.close();
        int a = 1, b =1, s=0 ,i=1;
        if(k==1){
            System.out.println(a);
        }
        
        else{
            while(i<=k){
                s=a+b;
                a=b;
                b=s;
                i+=1;
            }
            System.out.println(s-1);
        }
        
    
        
    }
}
