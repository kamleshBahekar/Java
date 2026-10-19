import java.util.Scanner;

public class PosNeg {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        if(num > 0){
            System.out.println("Number is Positive " +num);
        }else {
            System.out.println("Number is Negative " +num);
        }
    }
}
