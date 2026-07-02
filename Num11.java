import java.util.Scanner;
public class Code {
    static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc .nextInt();
     int rev=0;
     int s=n;
     while (n>0){
         int t=n%10;
         rev=rev*10+t;
         n/=10;
     }
     if(s==rev){
         System.out.println("Palindrome");
     }
     else {
         System.out.println("Not Palindrome");
     }
     }
}
