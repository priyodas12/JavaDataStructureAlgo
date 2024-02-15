package learn.algorithm.likedlist.impl;

public class Node {

  int value;
  Node nextNode;

  public Node() {
  }

  public Node(int value) {
    this.value = value;
  }

  public Node(int value, Node nextNode) {
    this.value = value;
    this.nextNode = nextNode;
  }
}
