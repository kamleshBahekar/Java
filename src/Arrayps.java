
import java.util.Scanner;

public class Arrayps {

    public static void main(String[] args) {
        System.out.println(
                "Please enter array size"
        );

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        if (size <= 0) {
            System.out.println("Array size must be positive");
            sc.close();
            return;
        }

        int[] arr = new int[size];

        System.out.println("Enter " + size + " numbers");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

//       findLargest(arr);
 //        findSmallest(arr);
//         reverse(arr);
        sumOfArray(arr);

        sc.close();
    }

    static void findLargest(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Largest number is " + max);
    }
    static void findSmallest(int[] arr) {
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Smallest number is " + min);
    }


    static void reverse(int[] arr){
        int start =0;
        int end = arr.length -1;
       while (start <end){
            int temp = arr[start];
               arr[start] = arr[end];
               arr[end] = temp;
               start++;
               end--;
        }
        for (int num:arr){
            System.out.println(num);
        }
    }
    static  void  sumOfArray(int[] arr){
        int sum =0;
        for (int i =0;i<arr.length;i++){
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}
