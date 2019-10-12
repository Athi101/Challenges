import java.util.Scanner;

public class Expression{
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        s.close();
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
