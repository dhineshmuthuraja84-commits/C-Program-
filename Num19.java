import java.util.Scanner;
public class Code {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original = n;
        int c=0;
        int t=n;
        while (t>0){
            t/=10;
            c++;
        }
        int sum=0;
        t=n;
        while(n>0){
            int r=n%10;
            int p=1;
            for(int i=0;i<c;i++){
                p=p*r;
            }
            sum+=p;
            n/=10;
        }
        if(sum==original){
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not Armstrong Number");
        }
    }
}

