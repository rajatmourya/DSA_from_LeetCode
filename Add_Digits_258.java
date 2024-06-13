package Day2;

import java.util.Scanner;

public class Add_Digits_258 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while(num >= 10){
            int ans = 0;
            while(num>0){
                ans += num%10;
                num /= 10;
            }
            num = ans;
        }
        System.out.println(num);
        System.out.println(addDigits(num));
        // return ans;
    }
    public static int addDigits(int num) {
        if( num % 9 == 0 && num != 0)
        return 9;

        if( num > 9)
        return num % 9;

        return num;
    }
    
}
