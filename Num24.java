import java.util.Scanner;
public class Code {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t=n;
        int sum=0;
        while (n>0){
            int r=n%10;
            sum+=r;
            n/=10;
        }
        if(t%sum==0){
            System.out.println("Harshad Number");
        }else{
            System.out.println("Not Harshad Number");
        }
    }
}

