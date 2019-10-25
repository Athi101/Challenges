import java.util.Scanner;

public class Fibonacci{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int k = s.nextInt();
        s.close();
        int a = 1, b =1, t=0 ,i=1;
        if(k==1){
            System.out.println(a);
        }
        
        else{
            while(i<=k){
                t=a+b;
                a=b;
                b=s;
                i+=1;
            }
            System.out.println(t-1);
        }
        
    
      s.close();  
    }
}
