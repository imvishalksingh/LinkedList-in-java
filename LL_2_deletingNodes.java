public class LL_2_deletingNodes {
    public static void main(String[] args) {
        int []arr={3,5,8,9,6};
        Node head=convertoLL(arr);
        
        // head=deleteHead(head);
        // head=deleteTail(head);
        // head=removeKthElement(head, 3);
        // head=removeGivenValue(head, 8);

        Print(head);
        
    }

    private static Node convertoLL(int array[]){

        Node head=new Node(array[0]);
        Node mover=head;

        for (int i = 1; i < array.length; i++) {
            Node temp=new Node(array[i]);
            mover.next=temp;
            mover=temp;
        }
        return head;
    }

    private static void Print(Node head){

        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data+" ");
            temp=temp.next;

        }
    }

    private static Node deleteHead(Node head){
        if(head==null) return head;
        head=head.next;
        return head;
    }

    private static Node deleteTail(Node head){

        if (head==null || head.next==null) {
            return null;
        }

        Node temp=head;
        while (temp.next.next!=null) {

            temp=temp.next;
        }
        temp.next=null;

        return head;


    }

    private static Node removeKthElement(Node head , int  k){

        if (head==null) {
            return null;
        }

        if (k==1) {
            head=head.next;
            return head;
        }

        Node temp=head;
        Node previous=null;
        int count=1;
        while (temp!=null) {
            count++;
            previous=temp;
            if (count==k) {
                previous.next=previous.next.next;
                break;
            }
            temp=temp.next;

            
        }
        return head;

    }

    private static Node removeGivenValue(Node head, int value){
        if (head==null) {
            return null;
        }

        if (head.data==value) {
            head=head.next;
            return head;
        }

        Node temp=head;
        Node previous=null;
        while (temp!=null) {
            if (temp.data==value) {
                previous.next=previous.next.next;
                break;
            }
            previous=temp;
            temp=temp.next;
 
        }
        return head;
    }
}

class Node{

    int data;
    Node next;

    Node(int data, Node next){
        this.data=data;
        this.next=next;
    }

    Node(int data){
        this.data=data;
        this.next=null;
    }

}
