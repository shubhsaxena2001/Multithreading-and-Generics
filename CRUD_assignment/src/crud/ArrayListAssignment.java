package crud;
import java.util.*;

class Employee {
    int empID;
    String empName;
    double salary;
    
    public Employee(int empID, String empName, double salary) {
        super();
        this.empID = empID;
        this.empName = empName;
        this.salary = salary;
    }
    
    public int getEmpID() {
        return empID;
    }
    
    public void setEmpID(int employeeId) {
        this.empID = employeeId;
    }
    
    public String getEmpName() {
        return empName;
    }
    
    public void setEmpName(String employeeName) {
        this.empName = employeeName;
    }
    
    public double getSalary() {
        return salary;
    }
    
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
}

public class ArrayListAssignment {

    List<Employee> empRecord = new ArrayList<Employee>();

    ArrayListAssignment()
    {
        this.empRecord = new ArrayList<Employee>();
    }

    void insert(Scanner sc)
    {
        System.out.println("Enter Employee ID : ");
        int id = sc.nextInt();
        System.out.println("Enter Employee Name : ");
        String name = sc.next();
        System.out.println("Enter Employee Salary : ");
        double salary = sc.nextDouble();
        Employee e = new Employee(id, name, salary);
        empRecord.add(e);
        System.out.println("Added successfully.");
    }

    void display(Scanner sc)
    {
        for(Employee emp : empRecord)
        {
            System.out.println("Employee ID : " + emp.getEmpID());
            System.out.println("Employee Name : " + emp.getEmpName());
            System.out.println("Employee Salary : " + emp.getSalary());
        }
    }

    void search(Scanner sc)
    {
        System.out.println("Enter Employee id : ");
        int id = sc.nextInt();
        for(Employee emp : empRecord)
        {
            if(emp.getEmpID() == id)
            {
                System.out.println("Employee ID : " + emp.getEmpID());
                System.out.println("Employee Name : " + emp.getEmpName());
                System.out.println("Employee Salary : " + emp.getSalary());
                return;
            }
        }
        System.out.println("Id not found.");
    }

    void delete(Scanner sc)
    {
        System.out.println("Enter Employee ID : ");
        int id = sc.nextInt();
        for(Employee emp : empRecord)
        {
            if(emp.getEmpID() == id)
            {
                empRecord.remove(emp);
                System.out.println("Deleted successfully.");
                return;
            }
        }
        System.out.println("ID not found.");
    }

    void update(Scanner sc)
    {
        System.out.println("Enter Employee ID : ");
        int id = sc.nextInt();
        for(Employee emp : empRecord)
        {
            if(emp.getEmpID() == id)
            {
                System.out.println("Enter Name : ");
                emp.setEmpName(sc.next());
                System.out.println("Enter Salary : ");
                emp.setSalary(sc.nextDouble());
                System.out.println("Updated Successfully.");
                return;
            }
        }
        System.out.println("ID not found.");
    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        ArrayListAssignment arr = new ArrayListAssignment();
        while(true) {
            System.out.println("Select operation: ");
            System.out.println("1. Insert \n2. Display\n3. Search\n4. Delete\n5. Update\n6. Exit");

            int userResponse = sc.nextInt();

            switch(userResponse)
            {
                case 1: arr.insert(sc);
                    break;
                case 2: arr.display(sc);
                    break;
                case 3: arr.search(sc);
                    break;
                case 4: arr.delete(sc);
                    break;
                case 5: arr.update(sc);
                    break;
                case 6: return; 
                default: System.out.println("Enter a valid choice");
                    break;

            }

        }
    }
}
