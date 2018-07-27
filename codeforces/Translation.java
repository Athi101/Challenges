import java.util.Scanner;

public class Translation{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        sc.close();
        if(a.length() == b.length()){
            int t = (b.length()-1), c = 0, k=t  ;
            for(int i = 0 ; i <a.length() ; i++){
                if(a.charAt(i) == b.charAt(t)){
                    t--;
                    c=c+1;
                }
    
            }
            if(c==a.length()){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        else{
            System.out.println("NO");
        }
        
        
    }
}
