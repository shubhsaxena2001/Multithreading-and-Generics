package crud;
import java.util.*;

class Employee {
    int employeeId;
    String employeeName;
    double salary;
    public Employee(int employeeId, String employeeName, double salary) {
        super();
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
    }
    public int getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    public String getEmployeeName() {
        return employeeName;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
}

public class ArrayListAssignment {

    ArrayList<Employee> employeesData;

    ArrayListAssignment()
    {
        this.employeesData = new ArrayList<Employee>();
    }

    void insert(Scanner sc)
    {
        System.out.println("Enter id : ");
        int id = sc.nextInt();
        System.out.println("Enter name : ");
        String name = sc.next();
        System.out.println("Enter salary : ");
        double salary = sc.nextDouble();
        Employee e = new Employee(id, name, salary);
        employeesData.add(e);
        System.out.println("Added successfully.");
    }

    void display(Scanner sc)
    {
        for(Employee e : employeesData)
        {
            System.out.println("Employee ID : " + e.getEmployeeId());
            System.out.println("Employee Name : " + e.getEmployeeName());
            System.out.println("Salary : " + e.getSalary());
        }
    }

    void search(Scanner sc)
    {
        System.out.println("Enter id : ");
        int id = sc.nextInt();
        for(Employee e : employeesData)
        {
            if(e.getEmployeeId() == id)
            {
                System.out.println("Employee ID : " + e.getEmployeeId());
                System.out.println("Employee Name : " + e.getEmployeeName());
                System.out.println("Salary : " + e.getSalary());
                return;
            }
        }
        System.out.println("Id not found.");
    }

    void delete(Scanner sc)
    {
        System.out.println("Enter id : ");
        int id = sc.nextInt();
        for(Employee e : employeesData)
        {
            if(e.getEmployeeId() == id)
            {
                employeesData.remove(e);
                System.out.println("Deleted successfully.");
                return;
            }
        }
        System.out.println("Id not found.");
    }

    void update(Scanner sc)
    {
        System.out.println("Enter id : ");
        int id = sc.nextInt();
        for(Employee e : employeesData)
        {
            if(e.getEmployeeId() == id)
            {
                System.out.println("Enter Name : ");
                e.setEmployeeName(sc.next());
                System.out.println("Enter Salary : ");
                e.setSalary(sc.nextDouble());
                System.out.println("Updated Successfully.");
                return;
            }
        }
        System.out.println("Id not found.");
    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        ArrayListAssignment a = new ArrayListAssignment();
        while(true) {
            System.out.print("Pick on operation: ");
            System.out.println("1. Insert \n2. Display\n3. Search\n4. Delete\n5. Update\n6. Exit");

            int userResponse = sc.nextInt();

            switch(userResponse)
            {
                case 1: a.insert(sc);
                    break;
                case 2: a.display(sc);
                    break;
                case 3: a.search(sc);
                    break;
                case 4: a.delete(sc);
                    break;
                case 5: a.update(sc);
                    break;
                case 6: System.out.println("Exit!!");
                    return;
                default: System.out.println("SORRY!! The choice you've entered is not valid.");
                    break;

            }

        }
    }
}
