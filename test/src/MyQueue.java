public class MyQueue<E> {
    private Node<E> head;
    private Node<E> tail;

    public MyQueue() {
    }

    public void enqueue(E element) {
        Node<E> temp = new Node<>(element);
        if (tail == null) {
            tail = head = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
    }

    public Node<E> dequeue() {
        if (head == null) {
            System.out.println("null");
            return null;
        } else {
            Node temp = head;
            head = head.next;
            return temp;
        }
    }
    public Node<E> peek() {
        if (head == null) {
            System.out.println("null");
            return null;
        } else {
            return head;
        }
    }
    public void show(){
        Node<E> temp = head;
        while (temp != null){
            System.out.println(temp.key);
            temp = temp.next;
        }
    }

}
