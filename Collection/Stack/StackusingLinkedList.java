class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		next=null;
	}
	
}
class Stack{
	int size,top;
	Node head;
	Stack(int size){
		this.size=size;
		top=-1;
		this.head=null;
	}
	void push(int data){
	    if(isFull()){
			System.out.println("Stack OverFlow,can't insert "+data);
			return;
		}
		    Node newNode=new Node(data);
		    newNode.next=head;
			head=newNode;
			top++;
			System.out.println(data + " pushed into the stack!");
		
	}
	int pop(){
		if(isEmpty()){
			System.out.println("Stack Underflow!");
            return -1;
		}
		int value=head.data;
		head=head.next;
		top--;
		return value;
	}
	boolean isFull(){
		return top==size-1;
	}
	boolean isEmpty(){
		return top==-1;
	}
	int peek(){
		if(isEmpty()){
			 System.out.println("Stack is Empty!");
             return -1;
		}
		return head.data;
	}
	void display(){
		if (isEmpty()) {
            System.out.println("Stack is empty!");
            return ;
        }
		Node current=head;
		while(current!=null){
			 System.out.print(current.data + " ");
			 current = current.next;
		}
		System.out.println();
	}
	
}
class StackusingLinkedList{
	public static void main(String args[]){
		Stack stack=new Stack(5);
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.display();
		//stack.push(90);
		System.out.println(stack.peek());
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.display();
	}

}