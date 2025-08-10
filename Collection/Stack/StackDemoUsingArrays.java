class Stack{
	int size;
	int top;
	int arr[];
	Stack(int size){
		this.size=size;
		arr=new int[size];
		top=-1;
	}
	void push(int value){
		if(isFull()){
			System.out.println("\nStack is Full,can't insert "+value);
		}
		else{
			arr[++top]=value;
			System.out.println(value +" pushed into the stack!");
		}
		
	}
	int pop(){
		if(isEmpty()){
			System.out.println("\nStack Under Flow!");
			return -1;
		}
		else{
			return arr[top--];
		}
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
		else{
			return arr[top];
		}
	}
	void display(){
	if (isEmpty()) {
        System.out.println("\nStack is empty!");
    } 
	else {
		for(int i=0;i<=top;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	}
	
}
class StackDemoUsingArrays{
	public static void main(String args[]){
		Stack stack=new Stack(5);
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.display();
		System.out.println(stack.peek());
		//stack.push(80);
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		//stack.pop();
		
	}
}