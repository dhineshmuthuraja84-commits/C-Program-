import java.util.Scanner;
public class Code {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact=1;
        for(int i=n;i>=1;i-=2){
            fact=fact*i;
        }
        System.out.println(fact);
    }
}
