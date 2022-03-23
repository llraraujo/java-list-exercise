package entities;

public class Employee {
    private Integer id;
    private String name;
    private Double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary(){
        return  this.salary;
    }



    public void increaseSalary(double percentage){
        this.salary *= (100 + percentage)/100;
    }

    public String toString(){
        return getId() + ", " + getName() + ", $ " + getSalary();
    }
}
