import java.util.Scanner;

public class SoldierAndBananas{
    public static void main(String[] args) {
        
        int k, n , w , sum=0;
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        n = sc.nextInt();
        w = sc.nextInt();
        sc.close();
        for(int i = 1 ; i<=w ; i++){
            sum = sum + (i*k);
        }
        if(sum>n){
            System.out.println(sum-n);
        }
        else if(sum==n || n>sum){
            System.out.println(0);
        }
        else{
            System.out.println(sum);
        }
    }

}
