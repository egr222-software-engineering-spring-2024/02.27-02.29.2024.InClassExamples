// A class to represent lawyers.
public class Lawyer extends Employee {

    public Lawyer(int yearsWorked) {
        super(yearsWorked);
    }

    public double getSalary() {
        return super.getSalary() + 5000.0 * getYearsWorked();      // base + $5,000.00 per year worked
    }

    public int getVacationDays() {
        return super.getVacationDays() + 5;           // 1 weeks' paid vacation beyond base vacation
    }

    public String getVacationForm() {
        return "pink";     // use the pink form
    }

    public void sue() {
        System.out.println("I'll see you in court!");
    }
}