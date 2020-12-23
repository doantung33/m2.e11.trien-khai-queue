public class Main {
    public static void main(String[] args) {
        MyLinkedListQueue myLinkedListQueue= new MyLinkedListQueue();
        myLinkedListQueue.enqueue(11);
        myLinkedListQueue.enqueue(12);
        myLinkedListQueue.enqueue(13);
        myLinkedListQueue.enqueue(14);
        myLinkedListQueue.enqueue(15);
        System.out.println("Dequeue iteam is: "+myLinkedListQueue.dequeue().key);
        System.out.println("Dequeue iteam is: "+myLinkedListQueue.dequeue().key);
    }
}
