import java.util.Scanner;
public class Code {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t=n;
        int sum=0;
        while(t>9) {
            while (t > 0) {
                int r = t % 10;
                sum += (r * r);
                t /= 10;
            }
            t = sum;
            sum = 0;
        }
        if(t==1){
            System.out.println("Happy Number");
        }else{
            System.out.println("Not Happy  Number");
        }
    }
}

