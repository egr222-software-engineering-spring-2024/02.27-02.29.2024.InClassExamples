// A class to represent lawyers.
public class Lawyer extends Employee {
    public Lawyer(int years) {
        super(years);
    }

    public double getSalary() {
        return super.getSalary() + 5000.0 * getYears();      // base salary + $5,000.00 per year
    }

    public int getVacationDays() {
        return 15;           // 2 weeks' paid vacation
    }

    public String getVacationForm() {
        return "Pink";
    }

    public void sue() {
        System.out.println("I'll see you in court!");
    }
}