package ManageMent;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Member {

    public Companylaborcontract companylaborcontract;

    private String ComName;
    private String MemberFirstName;
    private String MemberLastName;
    private int CompanyRank;
    private int Age;
    private int salary;
    private int company_Join_Year;
    private int basic_Income;
    private int working_Year;


    Scanner sc = new Scanner(System.in);
    LocalDateTime date = LocalDateTime.now();

    /**
     * this constructor is use a make user data.
     * when user add the data in the database.
     * and this class work lookalike database.
     */
    public Member(Companylaborcontract companylaborcontract) {
        this.companylaborcontract = companylaborcontract;
        this.setBasic_Income(150000);

        basicSet();

        System.out.println(this.getMemberFirstName() + " " + this.getMemberLastName());
        System.out.println(companylaborcontract.getRestTime() + " " + companylaborcontract.getLaborworkTime());
        System.out.println("Age : " + this.getAge() + " " + "Company Rank : " + this.getComName() + " " + this.getCompanyRank());
        int baseincome = (this.getSalary() / 22 / companylaborcontract.getLaborworkTime());
        System.out.println("This Member is Fullsalary is " + this.getSalary() + " Japan Yen.");
        System.out.println("This Member is Baseincome[for one Hours] is " + baseincome + " Japan Yen.");
        System.out.println("This Member work " + companylaborcontract.getLaborworkTime() * 22 + " Hours for Month.");
    }

    private void basicSet() {

        System.out.println("Company Name: ");
        this.setComName(sc.nextLine());
        System.out.println("Your First Name: ");
        this.setMemberFirstName(sc.nextLine());
        System.out.println("Your Last Name: ");
        this.setMemberLastName(sc.nextLine());
        System.out.println("Your Age");
        this.setAge(sc.nextInt());
        System.out.println("When[Year] you come this Company? ");
        this.setCompany_Join_Year(sc.nextInt());

        this.setWorking_Year(date.getYear() - this.getCompany_Join_Year());
        salarySet(this.getWorking_Year());

    }

    private void salarySet(int workingYearSet) {

        if (workingYearSet >= 10) {
            //Set Base Salary each rank.
            this.setSalary(400000);
            this.setCompanyRank(1);
        } else if (workingYearSet >= 5) {
            this.setSalary(350000);
            this.setCompanyRank(2);
        } else if (workingYearSet >= 3) {
            this.setSalary(250000);
            this.setCompanyRank(3);
        } else {
            this.setSalary(180000);
            this.setCompanyRank(4);
        }
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

    public int getCompany_Join_Year() {
        return company_Join_Year;
    }

    public void setCompany_Join_Year(int company_Join_Year) {
        this.company_Join_Year = company_Join_Year;
    }

    public int getBasic_Income() {
        return basic_Income;
    }

    public void setBasic_Income(int basic_Income) {
        this.basic_Income = basic_Income;
    }

    public int getWorking_Year() {
        return working_Year;
    }

    public void setWorking_Year(int working_Year) {
        this.working_Year = working_Year;
    }

    // ----->>>>> setter and getter <<<<<-----
}
