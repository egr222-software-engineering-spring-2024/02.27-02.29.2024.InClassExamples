// A class to represent employees
public class Employee {

    private int yearsWorked;

    public int getYearsWorked() {
        return yearsWorked;
    }

    public Employee(int yearsWorked) {
        this.yearsWorked = yearsWorked;
    }

    public int getHours() {
        return 40;           // works 40 hours / week
    }

    public double getSalary() {
        return 52500.0;      // $50,000.00 / year
    }

    public int getVacationDays() {
        return 10 + 2 * yearsWorked;           // 2 weeks' paid vacation plus 2 days for every year worked
    }

    public String getVacationForm() {
        return "yellow";     // use the yellow form
    }
}