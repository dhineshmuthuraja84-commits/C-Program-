import java.util.Scanner;
public class Code {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s=n*n;
        int t=n;
        int sum=0;
        while(s>0){
            int r=s%10;
            sum+=r;
            s/=10;
        }
        if(n==sum){
            System.out.println("Neon");
        }else{
            System.out.println("Not Neon");
        }
    }
}

