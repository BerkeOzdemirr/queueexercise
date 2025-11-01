public class Main{
    public static void main(String[] args) {
        myQ q = new myQ();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.dequeue();
        q.print();
    }
}
