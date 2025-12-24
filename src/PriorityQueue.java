public class PriorityQueue {
    private TreatmentQueue treatmentQueue = new TreatmentQueue();           //Create two objects of Treatment queue
    private TreatmentQueue priorityQueue = new TreatmentQueue();

    public PriorityQueue(TreatmentQueue treatmentQueue, TreatmentQueue priorityQueue) {
        this.treatmentQueue = treatmentQueue;
        this.priorityQueue = priorityQueue;
    }

    public void enqueue(TreatmentRequest request){                          //Time complexcity is O(1).
        if (request.isPriority()){                                          //We check if a request has priority using the priority attribute and the isPriority method that we added to the Treatment Request class.
            priorityQueue.enqueue(request);                                 /*If request has priority , we added priorityQueue object.
                                                                             enqueue() method is method of TreatmentQueue class and we can use this method because our object created this class. */
        }else  {
            treatmentQueue.enqueue(request);                                //If request hasn't priority, we added treatmentQueue object.
        }
    }
    public TreatmentRequest dequeue(){                                      //Time complexcity is O(1).
        if(!priorityQueue.isEmpty()){                                       //If priority gueue is not null
            return priorityQueue.dequeue();                                 //First, we remove it from the priority queue.
        }
            return treatmentQueue.dequeue();                                //If priority queue is null , we remove from treatment queue.
    }

    public void printPriorityQueue(){                                       //Time complexit is  O(n)
        System.out.println("Priority Queue: ");
        priorityQueue.printQueue();
        System.out.println("Treatment Queue: ");
        treatmentQueue.printQueue();
    }

}
