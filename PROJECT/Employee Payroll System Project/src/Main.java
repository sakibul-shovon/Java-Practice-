import java.util.ArrayList;

abstract class Employee{
    private final String name;
    private final int id;

    public Employee(String name,int id){
        this.name = name;
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }

    public abstract double calculateSalary();
    @Override
    public String toString(){
        return "Employee[name="+name+" ,id = "+id+", salary="+calculateSalary()+"]";
    }
}


class FullTimeEmployee extends Employee{
    private final double monthlySalary;

    public FullTimeEmployee(String name,int id,double monthlySalary){
        super(name,id);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary(){
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee{
    private final int hoursWorked;
    private final double hourlyRate;

    public PartTimeEmployee(String name,int id,int hoursWorked,double hourlyRate){
        super(name,id);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;

    }
    @Override
    public double calculateSalary(){
        return  hoursWorked * hourlyRate;
    }
}




 class PayrollSystem {
    private static ArrayList<Employee> employeeList;

    public PayrollSystem(){
        employeeList = new ArrayList<>();
    }

    public static void addEmployee(Employee employee){
        employeeList.add(employee);
    }

    public void removeEmployee(int id){
        Employee employeeToRemove = null;
        for(Employee employee:employeeList){
            if(employee.getId() == id){
                employeeToRemove = employee;
                break;
            }


               if(employeeToRemove != null){
                   employeeList.remove(employeeToRemove);
               }

        }
    }

    public void displayEmployee(){
        for(Employee employee:employeeList){
            System.out.println(employee);
        }
    }

}





public class Main {
    public static void main(String[] args) {

        PayrollSystem payrollSystem = new PayrollSystem();
        FullTimeEmployee emp1 = new FullTimeEmployee("shovon",1,70000);
        PartTimeEmployee emp2 = new PartTimeEmployee("Zaward",2,40,100);
        PartTimeEmployee emp3 = new PartTimeEmployee("Rubayet",3,20,100);


        PayrollSystem.addEmployee(emp1);
        PayrollSystem.addEmployee(emp2);

        System.out.println("Employee List :");
        payrollSystem.displayEmployee();

        System.out.println("\nAfter Removing , Employee List :");
        payrollSystem.removeEmployee(3);




        }

}