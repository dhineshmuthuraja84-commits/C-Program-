import java.util.Scanner;

public class Code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int bs=1,bi=0;
        while(n>0){
            int r=n%10;
            bi=bi+r*bs;
            n/=10;
            bs=bs*2;
        }
        System.out.println(bi);
    }
}
