import java.util.LinkedList;
class LinkedListEx{
	public static void main(String args[]){
		LinkedList<Integer> list=new LinkedList<>();
		list.add(10);//end 
		list.add(20);
		list.add(30);
		list.add(50);
		list.add(40);
		list.addFirst(200);//begining
		list.addLast(222);//end
		list.add(2,55);//index 2
		System.out.println(list);//[200,10,55,20,30,50,40,222]
		//remove elements
		list.removeFirst();
		list.removeLast();
		list.remove(Integer.valueOf(55));
		System.out.println(list);//[10,20,30,50,40]
		System.out.println(list.contains(10));//true
		System.out.println(list.get(0));//10
		System.out.println(list.size());//5
		list.set(1,111);//replace 111 at index 1
		System.out.println(list);//[10,111,30,50,40]
		list.clear();
		System.out.println(list);//[]
		
	}
}