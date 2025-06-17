import java.util.HashSet;
class Student {
    int rollNo;
    String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Student))
            return false;
        Student other = (Student) obj;
        return this.rollNo == other.rollNo && this.name.equals(other.name);
    }
    @Override
    public int hashCode() {
        return rollNo * 31 + name.hashCode(); 
    }
    @Override
    public String toString() {
        return "Roll No: " + rollNo + ", Name: " + name;
    }
}
public class HashSetWithObjects {
    public static void main(String[] args) {
        HashSet<Student> studentSet = new HashSet<>();
        studentSet.add(new Student(101, "Alice"));
        studentSet.add(new Student(102, "Bob"));
        studentSet.add(new Student(101, "Alice")); 
        System.out.println("Unique students:");
        for (Student s : studentSet) {
            System.out.println(s);
        }
    }
}
