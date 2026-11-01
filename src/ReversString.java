import java.util.Stack;

public class ReversString {
    public static void main(String[] args) {
        String s = "Hello";
        Stack<Character> st = new Stack<>();

        for(char ch : s.toCharArray()){
            st.push(ch);
        }

        String rev = "";
        while(!st.isEmpty()) {
            rev = rev + st.pop();
        }
        System.out.println(rev);
    }
}
