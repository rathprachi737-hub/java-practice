
import java.util.*;

public class array {

    public static void main(String[] args) {
        int sum = 0, avg = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }
        avg = sum / n;
        System.out.println("the sum of the array is:" + sum);
        System.out.println("the average of the array is:" + avg);
    }

}
