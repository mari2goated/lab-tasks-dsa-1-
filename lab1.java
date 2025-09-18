
import java.util.Scanner;



public class lab1{
    /**
     * @param args
     */
    public static void main(String[] args){
        // yScanner sc = new Scanner(System.in);
        // Sstem.out.print("enter a number");
        // int n = sc.nextInt();
        // System.out.print(n);
        int num1 = 2;
        int num2 = 6;
        int num3 = 7;

        if (num1>num2){
            System.out.println(num1 + "is greater than" + num2);
        }
        if (num2>num3){
            System.out.println(num2+"is greater than"+num3);
        }

        int a = 2;
        int b = 4;

        if ( a==2) {
            System.out.println("a is swapped"+b);
        }
        if (  b == 4) {
            System.out.println("b is swapped"+a);
        }

        int n1 = 1;
        int n2 = 2;
        int n3 = 3;
        int n4 = 4;
        int n5 = 5;

        int sum = n1 + n2 + n3 + n4 + n5;
        System.out.println(sum);

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        if(n%2==0){
            System.out.println("n is even ");
        }
        if(n%n ==0 && n%1 ==0){
            System.out.println("n is prime");
        }

        // calculator

        System.out.println("enter a number");
        int number1 = sc.nextInt();
        System.out.println("enter another number");
        int number2 = sc.nextInt();

        int addition = number1 + number2;
        int subtraction = number1 - number2;
        int multiplication = number1 * number2;
        int division = number1 / number2;

        System.out.println("for addition:"+addition);
        System.out.println("for subtraction:"+subtraction);
        System.out.println("for multiplication:"+multiplication);
        System.out.println("for division:"+division);

    }
}
        
    
