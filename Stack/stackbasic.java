package Stack;

import java.util.Stack;

public class Stackbasic {
    public static void main(String[] args) {
        Stack<String> st= new Stack<>();
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
        

    }
}
