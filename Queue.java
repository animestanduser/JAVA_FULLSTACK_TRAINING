import java.util.Scanner;

public class Queue {

    Node front;
    Node rear;

    int size = 0;

    public void enqueue(String s) {
        if (front == null && rear == null) {
            Node node = new Node(s);
            this.front = node;
            this.rear = node;
        }
        else{
            Node node = new Node( s , null , this.rear);
            this.rear.nextNode = node;
            this.rear = node;
        }
        this.size++;
    }

    public String dequeue( ) {
        String vv = this.front.value;

        this.front = this.front.nextNode;
        this.rear = this.rear.prevNode;
        this.size--;
        return vv;
    }

    public Node getFront(){
        return this.front;
    }

    public Node getRear(){
        return this.rear;
    }

    public int getSize(){
        return this.size;
    }

    public boolean isEmpty(){
        return this.size == 0;
    }

    public void iterator(){
        Node last = this.front;
        while ( last != null ){
            System.out.println(last.value);
            last = last.nextNode;
        }
    }

    public void cleanQueue(){
        int stop = size;
        for(int i = 0; i < stop; i++)
            dequeue();

    }

}

class Node {
    String value;
    Node prevNode;
    Node nextNode;


    public Node(String v) {
        this.value = v;
    }

    public Node ( String v , Node nxtNode , Node preNode){
        this.value = v;
        this.nextNode = nxtNode;
        this.prevNode = preNode;
    }
}