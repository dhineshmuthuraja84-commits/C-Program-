import java.util.Scanner;
public class Code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int c=0;
        int s=Math.min(n1,n2);
        for(int i=1;i<=s;i++){
            if(n1 % i == 0 && n2 % i == 0) {
                c++;
            }
        }
        if(c==1){
            System.out.println("Coprime");
        }else{
            System.out.println("Not Coprime");
        }
    }
}
