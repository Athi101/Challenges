import java.util.Scanner;

public class AntonAndDanik{

    public static void main(String[] args) {
        
        Scanner ss = new Scanner(System.in);
        int t = ss.nextInt();
        String S = ss.next();

        int i = 0, a = 0 , d = 0;
        while(i<t){
            
                if(S.charAt(i)=='A'){
                    a++;
                }
                else if (S.charAt(i)=='D'){
                    d++;
                }
                else{}
                i++;
        }
        
        if(a>d){
            System.out.println("Anton");
        }
        else if(a<d){
            System.out.println("Danik");
        }
        else{
            System.out.println("Friendship");
        }
        
        ss.close();
    }
}
