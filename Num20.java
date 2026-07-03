import java.util.Scanner;
public class Code {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t=n;
        int sum=0;
        while(n>0){
            int r=n%10;
            int fact=1;
            for(int i=1;i<=r;i++){
                fact*=i;
            }
            sum+=fact;
            n/=10;
        }
        if(sum==t){
            System.out.println("Strong Number");
        }else{
            System.out.println("Not Strong Number");
        }
    }
}

