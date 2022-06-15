public class Main {
    
    public static void main(String[] args)
    {

        Employee e1 = new Employee(); // * Create Object
        Employee e2 = new Employee(); // * Create Object

        e1.setID("1");
        e1.setName("John");
        e1.setSalary(9000.0);
        
        e2.setID("2");
        e2.setName("JoJo");
        e2.setSalary(10000.0);

        e1.DisPlayEmployee();
        e2.DisPlayEmployee();
      
    }
}
