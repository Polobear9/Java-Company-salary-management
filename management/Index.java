package management;


public class Index {

    public static void main(String[] args) {
        Member member = Member.setupTheBasicProfiles();
        CompanyLaborContract companyLaborContract = CompanyLaborContract.makeEmployLaborInstance();
        member.calculateSalary(companyLaborContract);
    }

}
