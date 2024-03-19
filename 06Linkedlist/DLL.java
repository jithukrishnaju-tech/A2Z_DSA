public class DLL {
  Node head;
  Node tail;

  // deletion at front
  public void deleteathead() {
    if (head == null || head == tail) {
      return;
    }
    Node temp = head;
    head = temp.next;
    temp.next = null;
  }

  // delete before tail
  public void deletebeforetail() {
    if (head == null || head == tail) {
      return;
    }
    Node temp = head;
    while (temp.next != null) {
      temp = temp.next;
    }
    Node b = temp.back;
    tail = b;
    b.next = null;
    temp.back = null;
  }

  // delete at k
  public void deleteatk(int k) {
    Node temp = head;
    int count = 0;
    while (temp.next != null) {
      count++;
      if (count == k) {
        break;
      }
      temp = temp.next;
    }
    Node b = temp.back;
    Node f = temp.next;
    b.next = f;
    f.back = b;
    temp.next = null;
    temp.back = null;
  }

  public void arraytodll(int[] arr) {
    head = new Node(arr[0]);
    Node prev = head;
    for (int i = 1; i < arr.length; i++) {
      Node temp = new Node(arr[i], null, prev);
      prev.next = temp;
      temp.back = prev;
      prev = temp;
    }
  }

  public void display() {
    Node temp = head;
    while (temp != null) {
      System.out.println(temp.val);
      temp = temp.next;
    }
  }

  public class Node {
    int val;
    Node next;
    Node back;

    Node(int val) {
      this.val = val;
      this.back = null;
      this.next = null;
    }

    Node(int val, Node next, Node back) {
      this.val = val;
      this.next = next;
      this.back = back;
    }
  }
}
