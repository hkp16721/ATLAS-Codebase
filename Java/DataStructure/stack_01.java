package DataStructure;

import java.util.Collection;
import java.util.Iterator;
import java.util.Stack;
import java.util.Queue;

public class stack_01 {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(5);
        st.push(9);
        System.out.println("Index of 5 is: "+st.search(5));
        System.out.println("Top element of the stack: "+st.peek());
        System.out.println("Size of stack is "+st.size());
        while (!st.isEmpty()){
            System.out.println(st.pop());
        }
        System.out.println(st);

    }
}
