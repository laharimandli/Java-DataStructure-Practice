import java.util.Set;
import java.util.LinkedHashSet;
class LinkedHashSetDemo{
    public static void main(String args[]){
		Set<String> set=new LinkedHashSet<>();
		set.add("Virat");
		set.add("Kohli");
		set.add("Hardik");
		set.add("Pandya");
		System.out.println("set elements are: "+set); //[Virat, Kohli, Hardik, Pandya]
		System.out.println(set.contains("Rohit"));//false
		set.add("Sharma");
		set.add("Siraj");
		System.out.println("set elements are: "+set); //[Virat, Kohli, Hardik, Pandya, Sharma, Siraj]
	    set.remove("Sharma");
		set.add(null);
		System.out.println("set elements are: "+set); //[Virat, Kohli, Hardik, Pandya, Siraj, null]
		System.out.println(set.size());//6
		set.clear();
	    System.out.println("set elements are: "+set); // []
	}
}