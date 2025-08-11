class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		next=null;
	}
}
class Queue{
	Node front,rear;
	int size;
	Queue(){
		this.front=this.rear=null;
		this.size=0;
	}
	
	void enQueue(int data){
		   Node newNode=new Node(data);
		   if(rear==null){
		    	front=rear=newNode;
		   }
		   else{
			     rear.next=newNode;
				 rear=newNode;
		   }
		   size++;
		   System.out.println(data+" enqueued!");
		
	}
	int deQueue(){
		if(isEmpty()){
			System.out.println("Queue is Empty!,cant delete ");
			return -1;
		}
			int val=front.data;
			front=front.next;
			if(front==null){
				rear=null;
			}
			size--;
			return val;
			
		
	}
	 boolean isEmpty() {
        return size == 0;
    }

	int peek(){
		if(isEmpty()){
			System.out.println("Queue is Empty!");
			return -1;
		}
		return front.data;
	}
	void display(){
		if(isEmpty()){
			System.out.println("Queue is Empty!");
			return;
		}
		System.out.println("Queue: ");
		Node current=front;
        while(current!=null){
			System.out.print(current.data+" <-");
			current=current.next;
		}
		System.out.println("null");
		}
		int getSize(){
			return size;
		}

}
class QueueusingLinkedList{
	public static void main(String args[]){
		Queue queue=new Queue();
		queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
        queue.display();
		System.out.println("Dequeued: " + queue.deQueue());
        queue.display();
        System.out.println("Front element: " + queue.peek());
		System.out.println("Queue size: " + queue.getSize());
		queue.enQueue(100);
		queue.enQueue(200);
		queue.display();
	}

}