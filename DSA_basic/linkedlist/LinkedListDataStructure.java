class Node{
    int val;
    Node next;
    Node(int val){
    this.val=val;
    }
    }
class Linkedlist{
    Node head;
    Node tail;
    int size;
    void addAtTail(int val){
        Node temp=new Node(val);
        if(tail==null) head=tail=temp;
        else{
            tail.next=temp;
            tail=temp;
        }
        size++;
        }
      void display(){
        if(head == null) return;
        Node temp= head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
      }
      void addAtHead(int val){
        Node temp=new Node(val);
        if(tail==null) head=tail=temp;
        else{
            temp.next=head;
            head=temp;
        }
        size++;
       }
       void delete()
       {
        if(head==null){
            System.out.println("List is empty");
        }
        head=head.next;
        size--;
       }

    boolean search(int val){
        if(head==null) return false;
            Node temp=head;
            while(temp!=null){
            if(temp.val==val) return  true;
                temp=temp.next;
            
        }
        return false;
    }
     void insert(int val,int idx){
        if(idx<0|| idx>size)System.out.println("Invalid Index");
        else if(idx==0) addAtHead(val);
        else if(idx==size) addAtTail(val);
        else{
            Node temp= head;
            for(int i=1;i<=idx-1;i++){
                temp=temp.next;
            }
            Node t= new Node(val);
            t.next=temp.next;
            temp.next=t;
            size++;
        }
     }
     int get(int idx){
        Node temp=head;
        for(int i=1;i<=idx;i++){
            temp=temp.next;
        }
        return temp.val;
     }

    }
    public class LinkedListDataStructure {
        public static void main(String[] args) {
        Linkedlist ll= new Linkedlist();
        ll.addAtTail(10);
        ll.addAtTail(20);
        ll.addAtTail(30);
        ll.addAtTail(40);
        ll.addAtTail(50);
        ll.display();
        ll.addAtHead(30);
        ll.delete();
        ll.display();
        System.out.println(ll.search(40));
        ll.insert(60,2);
        ll.display();
        System.out.println(ll.get(3));
    }
    } 
