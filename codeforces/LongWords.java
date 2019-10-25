import java.util.Scanner;

public  class LongWords{

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String [] arr = new String[n];
        for(int i = 0 ; i<n ; i++){
            arr[i] = s.next();
        }
        for(int i = 0 ; i<n ; i++){
            int a = arr[i].length();
            if(a>10){
                System.out.print(arr[i].charAt(0));
                System.out.print(a-2);
                System.out.print(arr[i].charAt(a-1));
                System.out.println();
            }
            else{
                System.out.println(arr[i]);
            }

        }
        s.close();

    }
}
    
