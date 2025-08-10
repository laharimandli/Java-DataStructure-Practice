class Node{
	Node previous;
	int data;
	Node next;
	Node(int data){
		this.previous=null;
		this.data=data;
		this.next=null;
	}
	
}
class DLinkedList{
	Node head;
	void insertEnd(int data){
		Node newNode=new Node(data);
	    if(head==null){
	       head=newNode;
		   return;
	    }
			Node current=head;
			while(current.next!=null){
				current=current.next;
			}
			current.next=newNode;
			newNode.previous=current;
		
	}
	void insertBeginning(int data){
		Node newNode=new Node(data);
		if(head!=null){
		    newNode.next=head;
			head.previous=newNode;
		}
		head=newNode;
	}
	void deleteNode(int value){
		if(head==null){
			System.out.println("List is Empty!");
			return;
		}
		Node temp=head;
		if(temp.data==value){
			head=temp.next;
			if(head!=null){
				head.previous=null;
			}
			System.out.println("Deleted:"+value);
			return ;
		}
		//search for node to delete
		while(temp!=null && temp.data!=value){
			temp=temp.next;
		}
		
		if (temp == null) {
            System.out.println("Value Not Found in list");
            return;
        }
		//node found
		if(temp.previous!=null){
			temp.previous.next=temp.next;
		}
		if(temp.next!=null){
			temp.next.previous=temp.previous;
		}
		System.out.println("Deleted: " + value);
	}
	void displayForward(){
		System.out.println("Forward Display:");
		Node temp=head; 
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	
	void displayBackward(){
		System.out.println("Backward Display:");
		Node temp=head;
		if(temp==null){
			return;
		}
		//move to last
		while(temp.next!=null){
			temp=temp.next;
		}
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp=temp.previous;
		}
		System.out.println();
	}
	
}
class DoublyLinkedList{
	public static void main(String args[]){
		DLinkedList d1=new DLinkedList();
		d1.insertEnd(10);
		d1.insertEnd(20);
		d1.insertEnd(30);
		d1.insertEnd(50);
		d1.insertEnd(40);
		d1.insertEnd(100);
		d1.insertBeginning(111);
		d1.displayForward();
		d1.displayBackward();
		d1.deleteNode(50);
		d1.displayForward();
	}
}