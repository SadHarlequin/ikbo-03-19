package practice_11;

public class Test {
    public static void main(String[] args) {

        ArrayQueue<String> arrayQueue = new ArrayQueue<String>();
        arrayQueue.enqueue("first");
        arrayQueue.enqueue("second");
        System.out.println(arrayQueue);
        System.out.println(arrayQueue.size());
        System.out.println(arrayQueue.dequeue());
        System.out.println(arrayQueue);
        arrayQueue.clear();
        System.out.println(arrayQueue.isEmpty());
        System.out.println(arrayQueue);

        System.out.println();

        ArrayQueueADT arrayQueueADT = new ArrayQueueADT();
        ArrayQueueADT.enqueue(arrayQueueADT,1);
        ArrayQueueADT.enqueue(arrayQueueADT,2);
        System.out.println(arrayQueueADT);
        System.out.println(ArrayQueueADT.size(arrayQueueADT));
        System.out.println(ArrayQueueADT.isEmpty(arrayQueueADT));
        System.out.println(ArrayQueueADT.element(arrayQueueADT));
        System.out.println(ArrayQueueADT.dequeue(arrayQueueADT));
        System.out.println(arrayQueueADT);
        ArrayQueueADT.clear(arrayQueueADT);
        System.out.println(ArrayQueueADT.isEmpty(arrayQueueADT));
        System.out.println(arrayQueueADT);

        System.out.println();

        ArrayQueueModule arrayQueueModule = new ArrayQueueModule();
        ArrayQueueModule.enqueue(1.f);
        ArrayQueueModule.enqueue(2.f);
        System.out.println(arrayQueueModule);
        System.out.println(ArrayQueueModule.size());
        System.out.println(ArrayQueueModule.isEmpty());
        System.out.println(ArrayQueueModule.dequeue());
        System.out.println(arrayQueueModule);
        arrayQueueModule.clear();
        System.out.println(ArrayQueueModule.size());
        System.out.println(ArrayQueueModule.isEmpty());
        System.out.println(arrayQueueModule);
    }
}
