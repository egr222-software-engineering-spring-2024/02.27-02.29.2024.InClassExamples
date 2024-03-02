public class Marketer extends Employee {
    public Marketer(int years) {
        super(years);
    }

    public double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary + 10000.0;      // $10,000.00 / year more than base employee
    }

    public void advertise() {
        System.out.println("Act now while supplies last");
    }
}
