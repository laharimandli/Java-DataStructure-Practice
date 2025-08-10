import java.util.Set;
import java.util.HashSet;
class HashSetDemo{
    public static void main(String args[]){
		Set<String> set=new HashSet<>();
		set.add("Virat");
		set.add("Kohli");
		set.add("Hardik");
		set.add("Pandya");
		System.out.println("set elements are: "+set); //[Pandya, Hardik, Kohli, Virat]
		System.out.println(set.contains("Rohit"));//false
		set.add("Sharma");
		set.add("Siraj");
		System.out.println("set elements are: "+set); //[Pandya, Sharma, Hardik, Kohli, Siraj, Virat]
	    set.remove("Sharma");
		set.add(null);
		System.out.println("set elements are: "+set); //[null, Pandya, Hardik, Kohli, Siraj, Virat]
		System.out.println(set.size());//6
		set.clear();
	    System.out.println("set elements are: "+set); // []
	}
}