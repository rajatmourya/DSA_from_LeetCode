import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the NUmber: ");
        int n = sc.nextInt();
        System.out.println(n+ " is Palindrome Number "+ isPalindrome(n));

    }
    public static boolean isPalindrome(int x) {
        int z = x;
        int num = 0;
        while(z>0){
            num = num*10+(z%10);
            z = z/10;
        }
        if(num == x){
            return true;
        }else{
            return false;
        }
    }
}
