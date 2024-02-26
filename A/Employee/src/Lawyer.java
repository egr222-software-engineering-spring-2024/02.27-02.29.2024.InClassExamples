// A class to represent lawyers.
public class Lawyer extends Employee {

    public Lawyer(int initialYears) {
        super(initialYears);
    }

    public int getVacationDays() {
        return 10 * getYears();
    }

    public double getSalary() {
        return super.getSalary() + 5000.00;             // $45,000.00 / year
    }

    public void sue() {
        System.out.println("I'll see you in court!");
    }
}