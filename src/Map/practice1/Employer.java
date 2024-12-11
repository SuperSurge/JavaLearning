package Map.practice1;

public class Employer {
    private int id;
    private int salary;
    private String name;

    public Employer() {
    }

    public Employer(int id, int salary, String name) {
        this.id = id;
        this.salary = salary;
        this.name = name;
    }

    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return "Employer{" + name + "/" + id + "/" + salary + "}";
    }
}