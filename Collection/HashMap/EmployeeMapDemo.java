import java.util.*;
class Employee {
    int empId;
    String name;
    String department;
    public Employee(int empId, String name, String department) {
        this.empId = empId;
        this.name = name;
        this.department = department;
    }
    public String display() {
        return "Employee [ID=" + empId + ", Name=" + name + ", Dept=" + department + "]";
    }
}
public class EmployeeMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, Employee> empMap = new HashMap<>();
        empMap.put(101, new Employee(101, "Alice", "HR"));
        empMap.put(102, new Employee(102, "Bob", "IT"));
        empMap.put(103, new Employee(103, "Charlie", "Finance"));
        int searchId = 102;
        if (empMap.containsKey(searchId)) {
            System.out.println("Employee Found: " + empMap.get(searchId).display());
        } else {
            System.out.println("Employee ID not found.");
        }
        empMap.remove(101);
        System.out.println("\nAll Employees:");
        for (Map.Entry<Integer, Employee> entry : empMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " -> " + entry.getValue().display());
        }
    }
}
