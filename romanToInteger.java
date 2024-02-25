import java.sql.SQLOutput;
import java.util.Scanner;
public class romanToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Roman Number");
        String a = sc.next();
        int result = romanToInt(a);
        System.out.println(a + " Roman Number's value in Integer value is: " + result);
    }
    public static int romanToInt(String s) {
        int n = s.length();
        int value = 0;
        for(int i = 0; i < n; i++){
            int cur = getvalue(s.charAt(i));
            if(i+1 < n){
                int next = getvalue(s.charAt(i+1));
                if(cur >= next){
                    value += cur;
                }else{
                    value -= cur;
                }
            }else{
                value += cur;
            }
        }
        return value;
    }
    public static int getvalue(char s){
        if(s == 'I'){
            return 1;
        }
        if(s == 'V'){
            return 5;
        }
        if(s == 'X'){
            return 10;
        }
        if(s == 'L'){
            return 50;
        }
        if(s == 'C'){
            return 100;
        }
        if(s == 'D'){
            return  500;
        }
        if(s == 'M'){
            return 1000;
        }
        return -1;
    }
}
