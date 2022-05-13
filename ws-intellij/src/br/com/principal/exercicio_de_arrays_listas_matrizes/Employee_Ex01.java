package br.com.principal.exercicio_de_arrays_listas_matrizes;

public class Employee_Ex01 {

    //Attributes
    private Integer id;
    private String name;
    private Double salary;

    //Default constructor with no arguments()
    public Employee_Ex01(){
    }
    //Constructor creation with arguments
    public Employee_Ex01(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    //Generating the Gets and Sets to get and recover the attributes means of protection

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
    //Method to increase employee salary
    public void increasesalary(double percentage){
        salary += salary * percentage / 100.0;
    }
    //Creating the toString method
    public String toString()
    {
        return id + ", " + name + ", " + String.format("%.2f", salary);
    }
}
