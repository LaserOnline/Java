public class Main {
    
    public static void main(String[] args)
    {

        Employee e1 = new Employee(); // * Create Object
        Employee e2 = new Employee(); // * Create Object

        e1.setID("ID: "+"1");
        e1.setName("Name: "+"Jo Star");
        e1.setSalary(6000.0);

        e2.setID("ID: "+"2");
        e2.setName("Name: "+"JoJo Rabbit");
        e2.setSalary(4000.0);

        // * Get Method
        System.out.print("\n"+
            e1.getID()+"\n"+
            e1.getName()+"\n"+
            e1.getSalary()+"\n"
        );
        
        System.out.print("\n"+
            e2.getID()+"\n"+
            e2.getName()+"\n"+
            e2.getSalary()+"\n"
        );

    }
}
