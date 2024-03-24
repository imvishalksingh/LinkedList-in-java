public class LL_1{
  public static void main(String[] args) {

    int arr[]={3,5,7,1,8,1};
    Node head=convertInNode(arr);
    //getElement(head);
    //getLength(head);
    checkElementPresent(head, 1);

  }

  private static Node convertInNode(int []arr){
    Node head=new Node(arr[0]);
    Node copyHead=head;
    for (int i = 1; i < arr.length; i++) {
      Node temp=new Node(arr[i]);
      copyHead.next=temp;
      copyHead=temp;
    }
    return head;
  }

  private static void getElement(Node head){
    Node temp=head;
    while (temp!=null) {
      System.out.print(temp.data+"-->");
      temp=temp.next;
    }
    if (temp==null) {
      System.out.println("Null");
    }
  }


  private static void getLength(Node head){
    int count=0;
    Node temp=head;
    while (temp!=null) {
      count++;
      temp=temp.next;
    }
    System.out.println("Length : "+count);
  }

  private static void checkElementPresent(Node head,int value){
    Node temp=head;
    int index=1;
    boolean flag=false;
    while (temp!=null) {
      if (temp.data==value) {
        flag=true;
        System.out.println("Element present. !!! At Node "+index);
      }
      temp=temp.next;
      index++;
    }
    if (flag==false) {
      System.out.println("Element Not present in List !!!");
    }
    
  }
  

}



class Node{

  int data;
  Node next;

  Node(int data1 , Node next1){
    this.data=data1;
    this.next=next1;
  }

  Node(int data1){
    this.data=data1;
    this.next=null;
  }


}