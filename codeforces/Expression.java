import java.util.Scanner;

public class Expression{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        int l = 0 , d = 0; 
        d = (a * b * c);
        if(d>l){
            l = d;
        }
        d = a + b + c;
        if(d>l){
            l = d;
        }
        d = (a + b) * c;
        if(d>l){
            l = d;
        }
        d = (a * b) + c;
        if(d>l){
            l = d;
        }
        d = a + (b * c);
        if(d>l){
            l = d;
        }
        d = a * (b + c);
        if(d>l){
            l = d;
        }

        System.out.println(l);

    }
}