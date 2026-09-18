import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Worker> workerList = new ArrayList<>();
        workerList.add(new Worker("Maria", 1500.0, 200.0));
        workerList.add(new Worker("Leo", 2300.0, 400.0));
        workerList.add(new Worker("Victor", 5000.0, 50.0));

        for (Worker worker : workerList) {
            System.out.println("Name: " + worker.name);
            System.out.println("Base Salary: " + worker.baseSalary);
            System.out.println("Complement: " + worker.complement);
            System.out.println("Total Salary: " + worker.getTotalSalary());
            System.out.println("------------------");
        }
    }
}