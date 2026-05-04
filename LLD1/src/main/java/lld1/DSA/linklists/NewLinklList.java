package lld1.DSA.linklists;
class Node{
    int data ;
    Node next;
    Node(int val){
        data=val;
        next=null;
    }
}
public class NewLinklList {
    Node head;
    public void insert(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while (temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void travse(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
NewLinklList linklList=new NewLinklList();
linklList.insert(10);
linklList.insert(20);
linklList.insert(30);
linklList.insert(40);
linklList.travse();
    }
}
