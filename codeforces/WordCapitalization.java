import java.util.Scanner;

public class WordCapitalization{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        for(int i = 0 ; i<(word.length()) ; i++){
            char s = word.charAt(i);
            if(i==0){
               
                System.out.print(Character.toUpperCase(s));
            }
            else{
                System.out.print(s);
            }
        
        }
        System.out.println();
        sc.close();

    }
}