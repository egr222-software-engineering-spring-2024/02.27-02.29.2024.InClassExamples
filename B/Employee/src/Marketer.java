public class Marketer extends Employee {
    public Marketer(int yearsWorked) {
        super(yearsWorked);
    }

    public double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary + 10000.0;      // $1,000.00 / year above base salary
    }

    public void advertise() {
        System.out.println("Act now while supplies last");
    }
}
