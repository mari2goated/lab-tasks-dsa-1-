import java.util.Scanner;
public class task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String input = sc.nextLine();
        String reversed = new StringBuilder(input).reverse().toString();
        if (input.equals(reversed)){
            System.out.println(input+" is a palindrome");
        }
        else{
            System.out.println(input+" not a palindrome");
        }
    }
}
