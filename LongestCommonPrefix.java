public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] S = {"flower", "flow", "flight"};
        String s = longestCommonPrefix(S);
        System.out.println(s);

    }

    public static String longestCommonPrefix(String[] strs) {
        String newString="";
        for (int i = 0; i < strs[0].length(); i++) {
            for (String j : strs) {
                char temp = j.charAt(i);
            }

        }
        return newString;
    }
}