public class Worker {
    public String name;
    public double baseSalary;
    public double complement;

    public Worker(String name, double baseSalary, double complement){
        this.name = name;
        this.baseSalary = baseSalary;
        this.complement = complement;
    }

    public double getTotalSalary(){
        return baseSalary + complement;
    }
}
