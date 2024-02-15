package learn.algorithm.likedlist.impl;

public class TestCustomLinkedList {

  public static void main(String[] args) {
    CustomLinkedList cll=new CustomLinkedList();
    System.out.println(cll.getSize());

    cll.insertAtStart(100);
    cll.insertAtStart(101);
    cll.insertAtStart(102);
    cll.insertAtStart(103);

    cll.displayElements();

    System.out.println(cll.getSize());

    //cll.getTailNode();

    cll.insertAtEnd(99);
    cll.insertAtEnd(98);

    cll.displayElements();

  }

}
