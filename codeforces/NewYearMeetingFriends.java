import java.util.Scanner;

public class NewYearMeetingFriends{

   
   
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int max = a , min = a;
        if(max<b){
            max = b;
        }
        if(max<c){
            max = c;
        }
        if(min>b){
            min = b;
        }
        if(min>c){
            min = c;
        }
        s.close();
        System.out.println(max-min);

    }
}
