public class LL {
  public Node head;
  public Node tail;
  public int length;

  public void deleteatk(int k) {
    if (head == null || head == tail) {
      return;
    }
    Node temp = head;
    Node pre = null;
    int count = 0;
    while (temp != null) {
      count++;
      if (count == k) {
        pre.next = pre.next.next;
        break;
      }
      pre = temp;
      temp = temp.next;
    }
  }

  public void deleteFirst() {
    if (head == null) {
      return;
    }
    head = head.next;
  }

  public void deleteLast() {
    Node temp = head;
    while (temp.next.next != null) {
      temp = temp.next;
    }
    temp.next = null;
    tail = temp;
  }

  public void inserFirst(int value) {
    Node node = new Node(value);
    node.next = head;
    head = node;
    if (tail == null) {
      tail = head;
    }
  }

  public void arraytoLinkedlist(int[] arr) {
    Node node = new Node(arr[0]);
    head = node;
    for (int i = 1; i < arr.length; i++) {
      Node temp = new Node(arr[i]);
      node.next = temp;
      node = temp;
    }
  }

  public int lengthofLL() {
    Node temp = head;
    while (temp != null) {
      length++;
      temp = temp.next;
    }
    return length;
  }

  public void insertKthindex(int k, int val) {
    int count = 0;
    Node temp = head;
    while (temp != null) {
      count++;
      if (k == (count + 1)) {
        Node inserNode = new Node(val);
        inserNode.next = temp.next;
        temp.next = inserNode;
      }
      temp = temp.next;
    }
  }

  public boolean isThereinLL(int val) {
    Node temp = head;
    while (temp != null) {
      if (temp.value == val) {
        return true;
      }
      temp = temp.next;
    }
    return false;
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
