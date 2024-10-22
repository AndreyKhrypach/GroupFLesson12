package app.models;

public class Employee extends Person{

    private String company;

    public Employee(String name, String company) {
        super(name);
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void work(){
        System.out.printf("%s works in %s \n", getName(), company);
    }

    public void display(){
        System.out.printf("Employee %s works in %s \n", super.getName(), company);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "company='" + company + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
