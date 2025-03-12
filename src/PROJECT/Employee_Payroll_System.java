package PROJECT;


import java.util.ArrayList;

abstract  class Employee
{
    private String name;
    private  int id;

    public Employee(String name, int id)
    {
        this.name= name;
        this.id= id;
    }
 public String getNAme()
 {
     return name;
 }
 public int getId()
 {
     return id;
 }

 public abstract  double calculatesalery();
    @Override
    public String toString()
    {
        return  "Employee [name="+name+", id="+id+", salary= "+calculatesalery()+"]";
    }
}
class FullTimeEmployee extends Employee
{
    private double monthlySalary;

    public FullTimeEmployee(String name, int id , double monthlySalary)
    {
        super(name,id);
        this.monthlySalary=monthlySalary;
    }

    @Override

    public double calculatesalery() {
       return monthlySalary;

    }
}

class partTimeEmployee extends Employee{
    private  int hoursWorked;
    private double hourlyRate;

    public partTimeEmployee(String name, int id , int hoursWorked , double hourlyRate){
       super(name,id);
       this.hoursWorked=hoursWorked;
       this.hourlyRate=hourlyRate;
    }

    @Override
    public double calculatesalery(){
        return hourlyRate*hoursWorked;
    }
}

class PayrollSystem{
    private ArrayList<Employee>employeeList;
    public PayrollSystem(){
        employeeList= new ArrayList<>();
    }

    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }

    public void  removeEmployee(int id){
       Employee employeeToRemove=null;
       for(Employee employee: employeeList){
           if(employee.getId()== id){
               employeeToRemove=employee;
               break;
           }
       }
       if(employeeToRemove != null){
           employeeList.remove(employeeToRemove);
       }
    }

    public void displayEmployee(){
        for(Employee employee: employeeList){
            System.out.println(employee);
        }
    }
}

public class Employee_Payroll_System {
    public static void main(String[] args) {
       PayrollSystem payrollSystem= new PayrollSystem();
       FullTimeEmployee emp1= new FullTimeEmployee("Ramjee",1,70000);
       partTimeEmployee emp2= new partTimeEmployee("Razz",2,40,100);

       payrollSystem.addEmployee(emp1);
       payrollSystem.addEmployee(emp2);
        System.out.println("Initial Employee Details: ");
        payrollSystem.displayEmployee();
        System.out.println("Removing Employees: ");
        payrollSystem.removeEmployee(2);
        System.out.println("Remaining Employee Details: ");
        payrollSystem.displayEmployee();
    }
}
