import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;
class TreeSetDemo{
	public static void main(String args[]){
		TreeSet<String> treeset=new TreeSet<>();
		treeset.add("Virat");
		treeset.add("Kohli");
		treeset.add("Hardik");
		treeset.add("Pandya");
		System.out.println("Treeset elements are: "+treeset);// [Hardik, Kohli, Pandya, Virat]
		System.out.println(treeset.contains("Rohit"));
		treeset.add("Sharma");
		treeset.add("Siraj");
		System.out.println("Treeset elements are: "+treeset);//[Hardik, Kohli, Pandya, Sharma, Siraj, Virat] 
	    treeset.remove("Sharma");
		System.out.println("Treeset elements are: "+treeset);//[Hardik, Kohli, Pandya, Siraj, Virat]
		System.out.println(treeset.size());//5
		Iterator<String> itr=treeset.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		System.out.println("First: " + treeset.first());
        System.out.println("Last: " + treeset.last());
		
		System.out.println("Higher than 'Kohli': " + treeset.higher("Kohli"));//Pandya
        System.out.println("Lower than 'Virat': " + treeset.lower("Virat"));//Siraj
        System.out.println("Ceiling of 'Pandya': " + treeset.ceiling("Pandya")); //Pandya
        System.out.println("Floor of 'Pandya': " + treeset.floor("Pandya"));// Pandya
		
		System.out.println("HeadSet (before 'Virat'): " + treeset.headSet("Virat"));// [Hardik, Kohli, Pandya, Siraj]
        System.out.println("TailSet (from 'Pandya'): " + treeset.tailSet("Pandya"));//[Pandya, Siraj, Virat]
        System.out.println("SubSet ('Hardik' to 'Virat'): " + treeset.subSet("Hardik", "Virat"));// [Hardik, Kohli, Pandya, Siraj]

		treeset.clear();
	    System.out.println("Treeset elements are: "+treeset); // []
	}
}