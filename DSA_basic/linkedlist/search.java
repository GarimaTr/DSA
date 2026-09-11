public class search {
      public static void main(String args[]){
        Node a = new Node(10); 
        Node b =new Node(20); 
        Node c =new Node(30); 
        Node d =new Node(40); 
        Node e =new Node(50); 

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        System.out.println(get(a,4));
     } 
    public static int  get(Node head,int idx) {
        Node temp= head;
        for(int i=0;i<=idx;i++){
            if (temp == null) throw new IndexOutOfBoundsException("Index out of range: " + idx);
            temp=temp.next;
        }
         if (temp == null) throw new IndexOutOfBoundsException("Index out of range: " + idx);
        return temp.val;

        
    }
}
