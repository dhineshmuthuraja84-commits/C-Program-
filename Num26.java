import java.util.Scanner;
public class Code {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t=n;
        int c=0;
        while(t>0){
            int r=t%10;
            if(r==0){
                c++;
            }
            t/=10;
        }
        if(c>0){
            System.out.println("Duck Number");
        }else{
            System.out.println("Not Duck Number");
        }
    }
}
