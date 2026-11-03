// VALID PARENTHESES 

import java.util.Stack;
public class day1_2 {
    public static boolean isValid(String s){
        Stack<Character> st = new Stack<>();

        for(char ch: s.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
            }
            else{ 
                if(st.isEmpty()){
                    return false;
                }

                char top = st.peek();
                if((ch == ')' && top == '(') ||
(ch == '}' && top == '{')||
(ch == ']' && top == '[')){
    st.pop();

}
else{
    return false; 
}

            }
        }
        return st.isEmpty();

    }
    public static void main(String[] args){
        String s = "{[()]}";
        System.out.println(isValid(s)); 
    }
}
