public class EmployeeClient {
    public static void main(String[] args) {

//     Consider the following employee regulations:
//        Employees work 40 hours / week.
//                Employees make $40,000 per year, except legal secretaries who make $5,000 extra per year ($45,000 total), and marketers who make $10,000 extra per year ($50,000 total).
//                Employees have 2 weeks of paid vacation leave per year, except lawyers who get an extra week (a total of 3).
//        Employees should use a yellow form to apply for leave, except for lawyers who use a pink form.
//
//     Each type of employee has some unique behavior:
//        Lawyers know how to sue.
//                Marketers know how to advertise.
//        Secretaries know how to take dictation.
//        Legal secretaries know how to prepare legal documents.

        // do stuff using the Employee (and child classes) here...
        Employee Fred = new Employee(8);
        Secretary Joe = new Secretary();
        Lawyer Lisa = new Lawyer(20);
        Marketer Max = new Marketer(10);
        LegalSecretary Lois = new LegalSecretary();

        System.out.println("Fred vacation: " + Fred.getVacationDays());
        System.out.println("Joe vacation: " + Joe.getVacationDays());
        System.out.println("Lisa vacation: " + Lisa.getVacationDays());
        System.out.println("Max vacation: " + Max.getVacationDays());
        System.out.println("Lois vacation: " + Lois.getVacationDays());

        System.out.println("Fred vacation form: " + Fred.getVacationForm());
        System.out.println("Joe vacation form: " + Joe.getVacationForm());
        System.out.println("Lisa vacation form: " + Lisa.getVacationForm());
        System.out.println("Max vacation form: " + Max.getVacationForm());
        System.out.println("Lois vacation form: " + Lois.getVacationForm());

        System.out.println("Fred salary: " + Fred.getSalary());
        System.out.println("Joe salary: " + Joe.getSalary());
        System.out.println("Lisa salary: " + Lisa.getSalary());
        System.out.println("Max salary: " + Max.getSalary());
        System.out.println("Lois salary: " + Lois.getSalary());

        Joe.takeDictation("memo");
        Lisa.sue();
        Max.advertise();
        Lois.takeDictation("legal memo");
        Lois.fileLegalBriefs();
    }
}