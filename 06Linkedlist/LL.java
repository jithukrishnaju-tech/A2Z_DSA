public class LL {
  public Node head;
  public Node tail;
  public int length;

  public void inserFirst(int value) {
    Node node = new Node(value);
    node.next = head;
    head = node;
    if (tail == null) {
      tail = head;
    }
  }

  public void insertLast(int val) {
    Node node = new Node(val);
    tail.next = node;
    node = tail;
    if (head == null) {
      head = tail;
    }
  }

  public void display() {
    Node temp = head;
    while (temp != null) {
      System.out.println(temp.value);
      temp = temp.next;
    }
  }

  public class Node {
    public int value;
    public Node next;

    Node(int value) {
      this.value = value;
    }
  }
}
