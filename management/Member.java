package management;

import java.time.LocalDateTime;

public class Member {

    private String ComName;
    private String MemberFirstName;
    private String MemberLastName;
    private int CompanyRank;
    private int Age;
    private int salary;
    private int companyJoinYear;
    private int basicIncome;
    private int workingYear;

    private static final LocalDateTime date = LocalDateTime.now();

    /**
     * this constructor is use a make user data.
     * when user add the data in the database.
     * and this class work lookalike database.
     */
    private Member() {
    }

    public static Member setupTheBasicProfiles() {

        Member worker = new Member();
        System.out.println("Company Name: ");
        worker.setComName(Tools.getScannerInstance().nextLine());
        System.out.println("Your First Name: ");
        worker.setMemberFirstName(Tools.getScannerInstance().nextLine());
        System.out.println("Your Last Name: ");
        worker.setMemberLastName(Tools.getScannerInstance().nextLine());
        System.out.println("Your Age");
        worker.setAge(Tools.getScannerInstance().nextInt());
        System.out.println("When[Year] you come this Company? ");
        worker.setCompanyJoinYear(Tools.getScannerInstance().nextInt());
        worker.setBasicIncome();
        worker.setWorkingYear((date.getYear() - worker.getCompanyJoinYear()) + 1);
        salarySet(worker);

        return worker;
    }

    private static void salarySet(Member worker) {
        double baseSalaryIncreasePercent = 1.15;

        if (worker.getWorkingYear() >= 10) {
            //Set Base Salary each rank.
            increaseIncome(worker, baseSalaryIncreasePercent);
            worker.setCompanyRank(1);
        } else if (worker.getWorkingYear() >= 5) {
            increaseIncome(worker, baseSalaryIncreasePercent);
            worker.setCompanyRank(2);
        } else if (worker.getWorkingYear() >= 3) {
            increaseIncome(worker, baseSalaryIncreasePercent);
            worker.setCompanyRank(3);
        } else {
            increaseIncome(worker, baseSalaryIncreasePercent);
            worker.setCompanyRank(4);
        }
    }

    private static void increaseIncome(Member worker, double baseSalaryIncreasePercent) {
        for(int i = 0; i < worker.getWorkingYear(); i++){
            worker.setSalary((int)(worker.getBasicIncome() * baseSalaryIncreasePercent));
        }
    }

    public void calculateSalary(CompanyLaborContract companyLaborContract) {
        double tax = 0.22;
        int workingDaysForOneMonth = 22;
        int yearCount = 12;

        System.out.println(this.getMemberFirstName() + " " + this.getMemberLastName());
        System.out.println(companyLaborContract.getRestTime() + " " + companyLaborContract.getLaborWorkTime());
        System.out.println("Age : " + this.getAge() + " " + "Company Rank : " + this.getComName() + " " + this.getCompanyRank());
        int baseIncome = (this.getSalary() / workingDaysForOneMonth / companyLaborContract.getLaborWorkTime());
        System.out.println("This Member is Next FullSalary for Month is " + this.getSalary() + " Japan Yen.");
        System.out.println("This Member is Next FullSalary for Year is " + this.getSalary() * yearCount + " Japan Yen.");
        System.out.println("This Member is BaseIncome[for one Hours] is " + baseIncome + " Japan Yen.");
        System.out.println("This Member work " + companyLaborContract.getLaborWorkTime() * workingDaysForOneMonth + " Hours for Month.");
        System.out.println("Your Tax Amount for Month is " + this.getSalary() * tax + " Japan Yen.");
        System.out.println("Your Tax Amount for Year is " + (this.getSalary() * tax) * yearCount + " Japan Yen.");
    }


    // ----->>>>> setter and getter <<<<<-----
    public String getComName() {
        return ComName;
    }

    public void setComName(String comName) {
        ComName = comName;
    }

    public String getMemberFirstName() {
        return MemberFirstName;
    }

    public void setMemberFirstName(String memberFirstName) {
        MemberFirstName = memberFirstName;
    }

    public String getMemberLastName() {
        return MemberLastName;
    }

    public void setMemberLastName(String memberLastName) {
        MemberLastName = memberLastName;
    }

    public int getCompanyRank() {
        return CompanyRank;
    }

    public void setCompanyRank(int companyRank) {
        CompanyRank = companyRank;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getCompanyJoinYear() {
        return companyJoinYear;
    }

    public void setCompanyJoinYear(int companyJoinYear) {
        this.companyJoinYear = companyJoinYear;
    }

    public int getBasicIncome() {
        return basicIncome;
    }

    public void setBasicIncome() {
        System.out.println("Please enter the your salary");
        this.basicIncome = Tools.getScannerInstance().nextInt();
    }

    public int getWorkingYear() {
        return workingYear;
    }

    public void setWorkingYear(int workingYear) {
        this.workingYear = workingYear;
    }

    // ----->>>>> setter and getter <<<<<-----
}
