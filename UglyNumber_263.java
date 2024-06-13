

import java.util.Scanner;

public class UglyNumber_263{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
         int n = sc.nextInt();
        System.out.println(isUgly(n));
        
    }
    public static boolean isUgly(int n) {
        while(n != 0){
            
            if(n%2 == 0){ 
                n/=2;
                
            }else if(n%3 == 0){
                n/=3;
                
            }else if(n%5 == 0){
                n/=5;
                
            }else if(n == 1){
                return true;
            }else{
                return false;
            }
        }
        return true;
        
    }
    
}
