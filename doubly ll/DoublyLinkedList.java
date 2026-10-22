class ListNode{
  int val;
  ListNode next,prev;
  ListNode(int val){ this.val=val;}

}
class DLL{
  ListNode head;
  ListNode tail;
  int size;
  void insertAtHead(int val){
    ListNode temp=new ListNode(val);
    if(head==null) head=tail=temp;
    else{
        temp.next=head;
        head.prev=temp;
        head=temp;
    }
    size++;
  }
  void insertAtTail(int val){
    ListNode temp=new ListNode(val);
    if(head==null) head=tail=temp;
    else{
        tail.next= temp;
        temp.prev= tail;
        tail=temp;
    }
    size++;
  }
  void deleteAtHead(){
    if(size==0){
      System.out.println("List is Empty");
      return;
    }
    if(size==1) head=tail=null;
    else{
      head=head.next;
      head.prev=null;
    }
    size--;
  }
  void deleteAtTail(){
     if(size==0){
      System.out.println("List is Empty");
      return;
    }
    if(size==1) head=tail=null;
    else{
      tail=tail.prev;
      tail.next=null;
    }
    size--;
  }
  void display(){
    ListNode temp=head;
    while(temp!=null){
      System.out.print(temp.val+" ");
      temp=temp.next;
    }
    System.out.println();
  }
  void displayReverse(){
    ListNode temp=tail;
    while(temp!=null){
      System.out.print(temp.val+" ");
      temp=temp.prev;
    }
    System.out.println();
  }
  void insert (int idx, int val){
    if(idx<0||idx>size){
      System.out.println("Invalid Index!");
      return;
    }
    if(idx == 0){ insertAtHead(val); return; }
    if(idx == size){ insertAtTail(val); return; }
    ListNode a=new ListNode(val); 
    ListNode temp=head;
    for(int i=1;i<idx;i++){
      temp=temp.next;
    }
    ListNode b=temp.next;
    a.next=b;
    a.prev=temp;
    temp.next=a;
    b.prev=a;
    size++;
  }
  void delete(int idx){
    if(idx<0||idx>=size){
      System.out.println("Invalid Index!");
      return;
    }
    
    if(idx == 0){ deleteAtHead(); return; }
    if(idx == size-1){ deleteAtTail(); return; }

     ListNode a=head;
     for(int i=1;i<idx;i++){
      a=a.next;
     }
     ListNode temp=a.next;
     temp.next.prev=temp.prev;
     temp.prev.next=temp.next;
     size--;
  }
} 
public class DoublyLinkedList{
    public static void main(String[] args){
        DLL list= new DLL(); 
        list.insertAtHead(20);
        list.insertAtHead(10);
        list.insertAtTail(30);
        list.display();         // 10 20 30
        list.displayReverse();  // 30 20 10
        list.deleteAtHead();
        list.deleteAtTail();
        list.display();         // 20
    }
}