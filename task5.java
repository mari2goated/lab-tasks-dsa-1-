import java.util.Scanner;
public class task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // calculator
    try {
        System.out.println("enter a number");
            int number1 = sc.nextInt();
            System.out.println("enter another number");
            int number2 = sc.nextInt();

            int addition = number1 + number2;
            int subtraction = number1 - number2;
             int multiplication = number1 * number2;
            float division = number1 / number2;

            System.out.println("for addition:"+addition);
            System.out.println("for subtraction:"+subtraction);
                 System.out.println("for multiplication:"+multiplication);
            System.out.println("for division:"+division);
        }
     catch (Exception e) {
            System.out.println("divisor is entered as zero - ERROR");
    }
        
    }
    
}
