import java.util.Scanner;
public class Code {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t=n;
        int rev=0;
        while (t>0){
            rev=rev*10+(t%10);
            t/=10;
        }
        int sum=0,p=1;
        t=rev;
        while (t>0){
            int r=t%10;
            sum+=Math.pow(r,p);
            p++;
            t/=10;
        }
        if(sum==n){
            System.out.println("Disarium number");
        }else{
            System.out.println("Not Disarium number");
        }

    }
}
