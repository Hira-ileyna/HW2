public class PriorityQueue {
    private TreatmentQueue treatmentQueue = new TreatmentQueue();           //Create two objects of Treatmentqueue
    private TreatmentQueue priorityQueue = new TreatmentQueue();

    public PriorityQueue(TreatmentQueue treatmentQueue, TreatmentQueue priorityQueue) {
        this.treatmentQueue = treatmentQueue;
        this.priorityQueue = priorityQueue;
    }

    public void enqueue(TreatmentRequest request){
        if (request.isPriority()){                                          //We check if a request has priority using the priority attribute and the isPriority method that we added to the Treatment Request class.
            priorityQueue.enqueue(request);                                 /*If request has prioty , we added priortyQueue object.
                                                                             enqueue() method is method of TreatmentQueue class and we can use this method because our object created this class. */
        }else  {
            treatmentQueue.enqueue(request);                                //If request hasn't priorty, we added treatmentQueue object.
        }
    }
    public TreatmentRequest dequeue(){
        if(!priorityQueue.isEmpty()){
            return priorityQueue.dequeue();
        }
            return treatmentQueue.dequeue();
    }

}
