package Stack;

import java.util.Stack;

public class stackbasic {
    public static void main(String[] args) {
        Stack<String> st= new Stack<>();
        System.out.println(st.isEmpty());
        st.push("Khushi");
        st.push("Preset");
        st.push("Rishika");
        st.push("Isha");
        st.push("Pravas");
        System.out.println(st.size());
        System.out.println(st);
        st.pop();
        System.out.println(st+" "+st.size());
        System.out.println(st.peek());
        System.out.println(st.pop());
        st.pop(); 
    }
}