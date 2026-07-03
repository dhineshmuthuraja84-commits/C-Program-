import java.util.Scanner;
public class Code {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s=n*n;
        int t=n;
        while (t>0) {
            if (t % 10 != s % 10) {
                System.out.println("Not Automorphic ");
                return;
            }
            t /= 10;
            s/=10;
        }
        System.out.println("Automorphic");
    }
}

