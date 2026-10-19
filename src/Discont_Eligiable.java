import java.util.Scanner;

public class Discont_Eligiable {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        System.out.println("Are you student (true/false)");
        boolean student = sc.nextBoolean();
        if(age <= 18 && student == true ){
            System.out.println("You will get 50% Discount");
        }else {
            System.out.println("No Discount");
        }
    }
}
