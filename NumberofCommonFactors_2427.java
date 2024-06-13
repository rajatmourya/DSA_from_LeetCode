package Day2;

import java.util.Scanner;

public class NumberofCommonFactors_2427 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(commonFactors(a, b));
        
    }
    public static int commonFactors(int a, int b) {
        int count = 0;
        for(int i = 1; i <= a; i++){
            if(a % i == 0 && b % i == 0){
                count += 1;
            }else{
                continue;
            }
        }
        return count;
    }
}
