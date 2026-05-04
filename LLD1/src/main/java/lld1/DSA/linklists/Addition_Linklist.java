package lld1.DSA.linklists;

public class Addition_Linklist {
    static class MyNode{
        int val;
        MyNode next;
        MyNode(int val){
            this.val=val;
        }
    }
    public static MyNode add(MyNode head, int val, int position){
        MyNode nn=new MyNode(val);
    if(position==0){
        nn.next=head;
        return nn;
    }else {
        MyNode temp=head;
        for(int i=0;i<position-1 && temp.next!=null;i++){
            temp=temp.next;
        }
        nn.next=temp.next;
        temp.next=nn;
    }
    return head;
    }
    public static void printLL(MyNode head){
       MyNode temp=head;
    while (temp!=null){
        System.out.print(temp.val+" -> ");
        temp=temp.next;
    }
        System.out.println();
    }
    public static void main(String[] args) {
        int[]A={10,20,30,40,50,60};
        MyNode head=null;
        for(int i=0;i<A.length;i++){
            int data=A[i];
            head=add(head,data,i);
        }
        printLL(head);

    }
}
