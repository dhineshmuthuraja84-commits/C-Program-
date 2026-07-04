import java.util.Scanner;
public class Code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f=0,l=1;
        for(int i=1;i<=n;i++){
            System.out.println(f);
            int t=f+l;
            f=l;
            l=t;
        }
    }
}
