import java.util.Scanner;
public class Code {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t=n;
        int sum=0;
        int prod=1;
        while (t>0){
            int r=t%10;
            sum+=r;
            prod*=r;
            t/=10;
        }
        if(sum==prod){
            System.out.println("Spy Number");
        }else{
            System.out.println("Not Spy Number");
        }
    }
}

