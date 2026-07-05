import java.util.Scanner;

public class Code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 2,b = 1;
        for (int i = 1; i <= n; i++){
            System.out.println(a);
            int t = a + b;
            a = b;
            b = t;

        }
    }
}
