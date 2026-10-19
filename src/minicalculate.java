import java.util.Scanner;

public class minicalculate {

    static void main() {
        System.out.println("Mini calculater");
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to min calculater");
        System.out.println("you can preform various operation like + - * /");
        System.out.println("Enter first number");
        double num1 = sc.nextDouble();
        System.out.println("Enter second number");
        double num2 = sc.nextDouble();
        System.out.println("Enter operation (+, -,*,/)");
        char op = sc.next().charAt(0);
        double result = 0.0;
        if(op=='+'){
            result = num1+num2;
        } else if (op=='-') {
            result = num1-num2;
        }else if (op=='*') {
            result = num1*num2;
        }else if (op=='/') {
            result = num1/num2;
        }else if (op=='%') {
            result = num1%num2;
        }else{
            System.out.println("Invalid operation");
        }

        System.out.println("Result is =>" + result);
    }
}
