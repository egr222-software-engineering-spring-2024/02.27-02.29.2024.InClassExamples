public class LegalSecretary extends Secretary {

    public void fileLegalBriefs() {
        System.out.println("I could file all day!");
    }

    public double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary + 5000.0;      // $5,000.00 / year beyond a basic employee
    }

}
