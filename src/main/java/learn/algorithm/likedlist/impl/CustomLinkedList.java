package learn.algorithm.likedlist.impl;

public class CustomLinkedList {

  private Node head;
  private Node tail;

  private int size;

  public CustomLinkedList() {
    this.size = 0;
  }

  public int getSize() {
    return size;
  }

  public void insertAtStart(int val){

    Node tobeInserted=new Node(val);

    //place tobeInserted before head;
    tobeInserted.nextNode=head;

    //point toBeInserted Node as head;
    head=tobeInserted;

    //if only single element then head and tail will point same object
    if(tail==null){
     tail=head;
    }

    size++;

  }

  public void displayElements(){
    System.out.println("------------display elements starts------------");
    //assign temp node to get pointed as head;
    Node temp=new Node();
    temp=head;
    //iterate temp
    while(temp!=null){
      System.out.print(temp.value+" -> ");
      temp=temp.nextNode;
    }
    System.out.print("null\n");
    System.out.println("------------display elements ends--------------");
  }

  public void insertAtEnd(int value){
    Node currentTailNode=getTailNode();
    Node toBeInsertedLast=new Node(value);
    currentTailNode.nextNode=toBeInsertedLast;
    tail=toBeInsertedLast;
  }

  public Node getTailNode(){
    Node temp=new Node();
    Node tailNode=null;
    temp=head;
    while(temp.nextNode!=null){
      temp=temp.nextNode;
    }
    tailNode=temp;
    System.out.println("Current Tail Node: "+tailNode.value);
    return tailNode;
  }

  public Node getNodeAtPosition(int position){
    Node nthNode=new Node();

    return nthNode;
  }

}
