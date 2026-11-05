package Stack;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
}
class MyStack{
    Node head;
    int len=0;

    int peek() throws Exception{
        if(head==null){
         throw new Exception("Stack underflow error");
        }
        return head.val;
    }
    int pop() throws Exception{
        if(head==null){
          throw new Exception("Stack underflow error");
        }
        int x=head.val;
        head=head.next;
        len--;
        return x;
    }
    void push(int val){
        Node a=new Node(val);
        a.next=head;
        head=a;
        len++;
    }
    int size(){
        return len;
    }
    void display(){
       Node temp=head;
       while(temp!=null){
        System.out.print(temp.val+" ");
        temp=temp.next;
       }   
    }
}
public class stackUsingLL {
    public static void main(String[] args) throws Exception {
        MyStack st=new MyStack(); 
        st.pop(); 
        st.push(10);  
        st.push(20);  
        st.push(30);  
        st.push(40);  
        st.display();
        System.out.println(st.pop());
        System.out.println(st.peek());
        st.push(50);
        System.out.println(st.peek());
        System.out.println(st.size());
        st.display();
    }
}
