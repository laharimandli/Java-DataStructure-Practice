import java.util.HashSet;
import java.util.Scanner;
public class CheckStudent {
public static void main(String[] args) {
HashSet<String>students = new HashSet<>();
students.add("John");
students.add("Anita");
students.add("Ravi");
Scanner sc = new Scanner(System.in);
System.out.print("Enter a name to search:");
String name = sc.nextLine();
if (students.contains(name)) {
System.out.println(name + " is present.");
} else {
System.out.println(name + "is not found.");
}
}
}