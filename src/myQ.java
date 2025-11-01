import javax.swing.*;

class Node{
    int data;
    Node prev;
    Node next;
    Node(int data){
        this.data=data;
        this.prev=null;
        this.next=null;
    }
}
public class myQ {
    Node rear;
    Node front;
    int size;
    public myQ(){
        rear=null;
        front=null;
        size=0;
    }
    public boolean isEmpty(){
        return rear == null && front == null;
    }
    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear == null){
            rear = front= newNode;
        }
        rear.next = newNode;
        if (front != null){
            newNode.prev = rear;
        }
        rear = newNode;
        size++;
    }
    public int dequeue() {
        if (isEmpty()){
            return -1;
        }
        int value = front.data;
        front = front.next;
        if (front == null){
            rear = null;
        }else{
            front.prev = null;
        }
        size--;
        return value;
    }
    public void print(){
        if (isEmpty()){ System.out.println("Queue is empty"); }
        Node temp = front;
        while (temp != null){
            System.out.print(temp.data);
            if (temp.next != null){
                System.out.print(" -> ");
            }
            temp = temp.next;
        }System.out.println();
    }
}
