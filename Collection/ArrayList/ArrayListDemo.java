import java.util.List;
import java.util.ArrayList;
class ArrayListDemo{
	public static void main(String args[]){
		List<Integer> list=new ArrayList<>();
		list.add(10);// adding 
		list.add(30);
		list.add(20);
		list.add(80);
		System.out.println(list);
		System.out.println(list.get(2));//get value at index 2
		list.set(2,200);//replace 200 in index 2
		System.out.println(list);
		list.remove(2);//index
		System.out.println(list);
		list.add(0,222);//adding 222 at index 0
		System.out.println(list);
		System.out.println(list.size());//size
		list.contains(30);//checking
		list.clear();//clear
		System.out.println(list);
		
	}
}