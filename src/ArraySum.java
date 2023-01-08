import java.util.*;
public class ArraySum {
    public static int sum(int[] arr) {
        int t;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];

        }
        return sum;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  t = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(sum(arr));


    }
}
