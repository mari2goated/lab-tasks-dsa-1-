import java.util.Scanner;
public class task7 {
    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = 0;
        int b = 1;
        int c = 0;

        if (n==0){
            c =a ;
        }
        else if (n == 1){
            c = b;
        }
        else{ 
            for (int i=2; i <= n; i++){ 
                c = a+b;
                a = b;
                b = c;
            }
        }
        System.out.println(n + "=" + c);
        
    }
    
}
