import java.util.Scanner;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class LinkedList{
    Node head;
    void addNode(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
        }
        else{
            Node current=head;
            while(current.next!=null){
                current=current.next;
            }
            current.next=newNode;
        }
    }
	
	 void addFirst(int data){
		Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;		
	 }
     void display(){
        Node current=head;
		System.out.println("Elements are:");
        while(current!=null){
            System.out.print(current.data+" ");
            current=current.next;
        }
        System.out.println("null");
    }
	void deleteNode(int data){
		Node current=head;
        if (head.data == data) {
        head = head.next;
        return;
        }
		while(current.next!=null && current.next.data!=data){
			current=current.next;
		}
		if(current.next!=null){
			current.next=current.next.next;
		}
		   
    }
	
	
}
class SingleLinkedListDemo{
    public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
        LinkedList list=new LinkedList();
		while(true)
		{
            System.out.println("\nEnter Your Choice:");
		    System.out.println("1.Add Node\n2.Delete Node\n3.Add First Node\n4.Display\n5.Exit");
		    int choice=sc.nextInt();
		    int data;
		    switch(choice){
		     	case 1:	System.out.println("Enter data to Add:");
			            data=sc.nextInt();
					    list.addNode(data);
						System.out.println(data+" Added to List!");
					    break;
			    case 2: System.out.println("Enter data to Delete:");
			            data=sc.nextInt();
					    list.deleteNode(data);
						System.out.println(data+" deleted From List!");
				     	break;
		        case 3: System.out.println("Enter data to AddFirst");
			            data=sc.nextInt();
					    list.addFirst(data);
						System.out.println(data+" Added at Front of List!");
					    break;
			    case 4: System.out.println("Displaying List Elements:");
			            list.display();
					    break;
			    case 5: System.out.println("Exiting...");
				        return ;
			    default: System.out.println("Invalid Choice!");
			}
		
			
		}
		
    }
}