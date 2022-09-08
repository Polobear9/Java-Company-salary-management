package ManageMent;
import java.util.Scanner;

public class Member {



    private String ComName;
    private String MemberFirstName;
    private String MemberLastName;
    private int CompanyRank;
    private int Age;
    private int salary;

    Scanner sc = new Scanner(System.in);

    /**
     * this constructor is use a make user data.
     * when user add the data in the database.
     * and this class work lookalike database.
     */
    public Member() {
        this.setComName(sc.nextLine());
        this.setMemberFirstName(sc.nextLine());
        this.setMemberLastName(sc.nextLine());
        this.setAge(sc.nextInt());

        /**
         * this salary is almost people who work in the Japan avg
         * it can be changed and anytime we can change the value of this
         */
        switch (CompanyRank) {
            //Set Base Salary each rank.
            case 1:
                this.setSalary(350000);
                break;
            case 2:
                this.setSalary(250000);
                break;
            case 3:
                this.setSalary(200000);
                break;
            default:
                this.setSalary(180000);
                break;
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

    // ----->>>>> setter and getter <<<<<-----
}
