import java.util.Scanner;

public class Hulk{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        sc.close();
        int k = 1;
        while(k<=m){
            if(k%2==0){
                System.out.print("I love ");
            }
            else{
                System.out.print("I hate ");
            }
            if(m!=k){
                System.out.print("that ");
            }
            k++;
        }
        System.out.print("it");
        System.out.println();
    }
}
