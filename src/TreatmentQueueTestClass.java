public class TreatmentQueueTestClass {
    public static void main(String[] args) {
        TreatmentQueue treatmentQueue = new TreatmentQueue();
        treatmentQueue.enqueue(new TreatmentRequest(1, true));
        treatmentQueue.enqueue(new TreatmentRequest(2,true));
        treatmentQueue.enqueue(new TreatmentRequest(3,true));
        treatmentQueue.enqueue(new TreatmentRequest(4,true));
        treatmentQueue.enqueue(new TreatmentRequest(5,false));
        treatmentQueue.enqueue(new TreatmentRequest(6,false));
        treatmentQueue.enqueue(new TreatmentRequest(7,false));
        treatmentQueue.enqueue(new TreatmentRequest(8,false));

        treatmentQueue.dequeue();
        treatmentQueue.dequeue();
        treatmentQueue.dequeue();

        treatmentQueue.printQueue();
    }
}
