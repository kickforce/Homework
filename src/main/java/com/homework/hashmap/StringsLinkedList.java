package com.homework.hashmap;

public class StringsLinkedList {
  private Node first = new Node();
  private Node last = new Node();

  public void printAll() {
    Node currentElement = first.next;
    while ((currentElement) != null) {
      System.out.println(currentElement.value);
      currentElement = currentElement.next;
      System.out.println("213");
    }
  }

  public void add(String value) {

  }

  public static class Node {
    private Node prev;
    private String value;
    private Node next;
  }
}
