import java.util.Scanner;

public class printconsonentcountvowiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s = sc.nextLine();
        int flag = 0;
        String ss = "";
//
        for(int i = 0; i<s.length();i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'A' || s.charAt(i) == 'i' || s.charAt(i) == 'I' || s.charAt(i) == 'e' || s.charAt(i) == 'E' || s.charAt(i) == 'o' || s.charAt(i) == 'O' || s.charAt(i) == 'u' || s.charAt(i) == 'U'){
                flag += 1;
            }else {
                ss += s.charAt(i);
            }
        }
        System.out.println("Consonents are: "+ss + "\n Total vowels: " + flag);

    }
}
