package entites;

public class Empresa{

    private String name;
    private Double salary;
    private Integer id;

    public Empresa(String name, Double salary, Integer id){
        this.name = name;
        this.salary = salary;
        this.id = id;
    }
    
    public Empresa(){
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void aumentoDeSalario(double porcentagem){
        this.salary += (porcentagem/100)*this.salary;
    }
    
}