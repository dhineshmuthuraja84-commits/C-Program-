import java.util.Scanner;
public class Code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int last  = a % 10;
        while(a>=10){
            a/=10;
        }
        int first =a;
        System.out.println("first: "+first);
        System.out.println("last: "+last);
    }
}
