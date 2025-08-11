class Queue{
	int arr[];
	int front,rear,size,capacity;
	Queue(int capacity){
		this.capacity=capacity;
		arr = new int[capacity];
		front=0;
		rear=-1;
		size=0;
	}
	void enQueue(int val){
		if(isFull()){
			System.out.println("Queue Overflow! Cannot enqueue " + val);
            return;
		}
		rear++;
		arr[rear]=val;
		size++;
		System.out.println(val + " enqueued");
	}
	boolean isFull(){
		return size==capacity;
	}
	boolean isEmpty(){
		return size==0;
	}
	int deQueue(){
		if(isEmpty()){
			System.out.println("Queue Underflow! Cannot dequeue");
            return -1;
		}
		int val=arr[front];
		for(int i=0;i<rear;i++){
			arr[i]=arr[i+1];
		}
		rear--;
		size--;
		return val;
	}
	int peek(){
		if(isEmpty()){
			System.out.println("Queue Underflow! Cannot dequeue");
            return -1;
		}
		return arr[front];
	}
	void display(){
		if(isEmpty()){
			System.out.println("Queue Underflow! Cannot dequeue");
            return;
		}
		System.out.print("Queue: ");
		for(int i=front;i<=rear;i++){
			System.out.print(arr[i]+"<-");
		}
		
	}
	

}
class QueueDemo{
	public static void main(String args[]){
		Queue queue=new Queue(5);
		 queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
        queue.display();
		 System.out.println("Dequeued: " + queue.deQueue());
        queue.display();
		 System.out.println("Front element: " + queue.peek());
		
	}
}