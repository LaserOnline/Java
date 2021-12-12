class Person 
{
    // private field
    private int age;
    // getter method
    public int getAge()
    {
        return age;
    }
    // setter method
    public void setAge(int age)
    {
        this.age = age;
    }
}

class Ep_MainPerson
{
    public static void main(String[] args)
    {
        // create an object of Person
        Person p1 = new Person();
        // create age using setter
        p1.setAge(24);
        // access age using getter
        System.out.println("My Age is :" + p1.getAge());
    }
}
