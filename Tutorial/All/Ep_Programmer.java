
class Employee
{
    float salary = 40000;
}

class Ep_Programmer extends Employee
{
    int bonus = 10000;
    public static void main (String args[])
    {
        Ep_Programmer p = new Ep_Programmer();
        System.out.println("Programmer Salary is:"+p.salary);
        System.out.println("Bonus of Programmer is:"+p.bonus);
    }
}
