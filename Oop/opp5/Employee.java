public class Employee {
    
    
    private String id;
    private String name;
    private Double salary;

    public Employee() {
        System.out.println("I am Employee");
    }

    public Employee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
        DisPlayEmployee();
    }

    public void setID(String id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSalary(Double salary){
        this.salary = salary;
    }
    
    public void DisPlayEmployee(){
        System.out.println("Name: "+ this.name);
        System.out.println("Salary: "+ this.salary);
    }
}
