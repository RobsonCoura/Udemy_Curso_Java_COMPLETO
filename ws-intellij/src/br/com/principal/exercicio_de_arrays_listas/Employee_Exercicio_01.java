package br.com.principal.exercicio_de_arrays_listas;

public class Employee_Exercicio_01 {

    //Atributos
    private Integer id;
    private String name;
    private Double salary;

    //Construtor padrao sem argumentos()
    public Employee_Exercicio_01(){
    }
    //Criação construtor com argumentos
    public Employee_Exercicio_01(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    //Gerando os Gets e Sets para pegar e recuperar os atributos meio de proteção

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
    //Metodo para aumentar o salario funcionario
    public void increasesalary(double percentage){
        //Operação para aumentar o salario do funcionario
        salary += salary * percentage / 100.0;
    }
}
