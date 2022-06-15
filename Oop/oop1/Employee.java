public class Employee {
    
    private String id;
    private String name;
    private Double salary;

    // * Default Constructor    

    public Employee() {
        System.out.print("No Data Employee");
    }

    public Employee(String id, String name){
        this.id = id;
        this.name = name;
        System.out.println("No Salary");
    }

    public Employee(String id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void DisPlayEmployee(){
        System.out.println("\n");
        System.out.println("ID: "+ this.id);
        System.out.println("Name: "+ this.name);
        System.out.println("Salary: "+ this.salary);
    }
    
}
