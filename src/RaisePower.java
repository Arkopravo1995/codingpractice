import java.util.Scanner;
public class RaisePower {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int ans = 1;
        for(int i = 1 ; i <=b ; i++){
            ans *=a ;

        }
        System.out.println(ans);
    }
}
