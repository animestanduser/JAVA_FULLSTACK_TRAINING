import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class TestQueue {
    public static void main(String[] args){

        Queue q = new Queue();

        System.out.println("Is queue empty?" + q.isEmpty());

        System.out.println(q.front);
        System.out.println(q.rear);

        q.enqueue("1");

        System.out.println(q.front.value);
        System.out.println(q.rear.value);

        System.out.println(q.rear.prevNode);
        System.out.println(q.front.nextNode);

        q.enqueue("2");

        System.out.println(q.front.value);
        System.out.println(q.rear.value);

        System.out.println(q.rear.prevNode.value);
        System.out.println(q.front.nextNode.value);

        q.enqueue("3");

        System.out.println(q.front.value);
        System.out.println(q.rear.value);

        System.out.println(q.rear.prevNode.value);
        System.out.println(q.front.nextNode.value);

        q.enqueue("4");

        System.out.println(q.front.value);
        System.out.println(q.rear.value);

        System.out.println(q.rear.prevNode.value);
        System.out.println(q.front.nextNode.value);

        System.out.println("Size of the queue: " + q.size);

        System.out.println("Is queue empty?" + q.isEmpty());

        q.iterator();

        q.cleanQueue();

        System.out.println("Cleaned");

        System.out.println("Is queue empty?" + q.isEmpty());

        q.iterator();

        q.enqueue("1");

        q.iterator();

        Scanner sc = new Scanner(System.in);
        String s = "temp";
        while(!(s.length()==0)) {
            System.out.print("Enter a string: ");
            s = sc.nextLine();
            q.enqueue(s);
        }

        q.iterator();


        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(("d/m/y"));

        try {
            simpleDateFormat.parse("25/4/2022");
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }
}
