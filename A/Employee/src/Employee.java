// A class to represent employees
public class Employee {
    private int years;

    public Employee (int years) {
        this.years = years;
    }

    public int getYears() {
        return years;
    }

    public int getHours() {
        return 40;           // works 40 hours / week
    }

    public double getSalary() {
        return 50000.0;      // $50,000.00 / year
    }

    public int getVacationDays() {
        return 10;           // 2 weeks' paid vacation
    }

    public String getVacationForm() {
        return "yellow";     // use the yellow form
    }
}