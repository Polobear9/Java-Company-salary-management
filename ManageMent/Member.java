package ManageMent;

public class Member {

    private String ComName;
    private String MemberFirstName;
    private String MemberLastName;
    private int CompanyRank;
    private int Age;
    private int salary;

    public Member(String ComName, String MemberFirstName, String MemberLastName, int CompanyRanks, int Age) {

        this.ComName = ComName;
        this.MemberFirstName = MemberFirstName;
        this.MemberLastName = MemberLastName;
        this.CompanyRank = CompanyRanks;
        this.Age = Age;

        switch (CompanyRank) {
            //Set Base Salary each rank.
            case 1:
                this.salary = 350000;
                break;
            case 2:
                this.salary = 250000;
                break;
            case 3:
                this.salary = 200000;
                break;
            default:
                this.salary = 180000;
                break;
        }
    }

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
}
