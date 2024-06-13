import java.util.Scanner;

public class ValidParentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Parentheses: ");
        String s = sc.nextLine();
        System.out.println(isValid(s));
    }
    public static boolean isValid(String s) {
        int sum = 0;
        boolean flag = true;
        for(int i = 0;i<s.length()-1;i+=2){
            if(s.charAt(i) == '(' && s.charAt(i+1) != '}'  && s.charAt(i+1) != ']'){
                sum +=1;
            }else if(s.charAt(i) == '{' && s.charAt(i+1) != ')'  && s.charAt(i+1) != ']'){
                sum +=2;
            }else if(s.charAt(i) == '['&& s.charAt(i+1) != '}'  && s.charAt(i+1) != ')') {
                sum +=3;
            }else if(s.charAt(i) == ')'){
             sum -= 1;
            }else if(s.charAt(i) == '}'){
                sum-=2;
            }else if(s.charAt(i) == ']'){
                sum -= 3;
            }else{
                flag = false;
            }
        }
        if(sum == 0 && flag ){
            return true;
        }else {
            return false;
        }
    }
}
