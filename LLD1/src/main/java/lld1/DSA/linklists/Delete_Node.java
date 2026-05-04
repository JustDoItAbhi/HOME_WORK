package lld1.DSA.linklists;

public class Delete_Node {
    static class DELETENode{
        int data;
        DELETENode next;

        public DELETENode(int data) {
            this.data = data;
        }
    }
    public static DELETENode add(DELETENode head, int data, int position){
        DELETENode nn=new DELETENode(data);
        if(position==0){
            nn.next=head;
            return nn;
        }else {
            DELETENode temp=head;
            for(int i=0;i<position-1;i++){
                temp=temp.next;
            }
            nn.next=temp.next;
            temp.next=nn;
        }
        return head;
    }
    public static void print(DELETENode head){
        DELETENode temp=head;
        while (temp!=null){
            System.out.print("printed "+ temp.data+" -> ");
        temp=temp.next;
        }
        System.out.println();
    }
    public static DELETENode remove(DELETENode head, int position){
        if(head==null){
            return null;
        }
        if(position==0){
            return head.next;
        }
        DELETENode temp=head;
       for(int i=0;i<=position-1;i++){
          if(temp.next==null)
              return head;
          temp=temp.next;
          if(temp.next!=null){
              temp.next=temp.next.next;
          }
       }

       return head;
    }

    public static void main(String[] args) {
        int[]A={1,2,3};
        int b=1;
        DELETENode head=null;
        for(int i=0;i<A.length;i++){
            head=add(head,A[i],i);
        }
        print(head);
        for(int i=0;i<A.length;i++){
          head=  remove(head,2);
        }
        print(head);

    }

}
