public class Main {
  public static void main(String[] args) {
    LL lin = new LL();
    // lin.inserFirst(1);
    // lin.inserFirst(2);
    // lin.inserFirst(3);
    // lin.inserFirst(4);
    // lin.inserFirst(5);
    // lin.inserFirst(6);
    // lin.insertLast(1);
    // lin.display();
    int[] arr = { 2, 4, 6, 8 };
    lin.arraytoLinkedlist(arr);
    lin.display();
    System.out.println("Sui");
    int len = lin.lengthofLL();
    boolean isExists = lin.isThereinLL(1);
    System.out.println(isExists);

  }
}
