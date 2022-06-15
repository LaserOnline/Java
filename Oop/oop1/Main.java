
public class Main {
    
    public static void main(String[] args)
    {

      Employee ep1 = new Employee(
        "1", "John", 30000.0
      ); // * Create Object
      
      Employee ep2 = new Employee(
        "2", "James", 35000.0
      ); // * Create Object

      Employee ep3 = new Employee(); // * Create Object
        
        ep1.DisPlayEmployee();
        ep2.DisPlayEmployee();
        ep3.DisPlayEmployee();
    }
}
