package ManageMent;


public class Index {

    public static void main(String[] args) {
        // Set the Member , Company Name , Member name , Member rank , Age
        Member member1 = new Member("Nexon", "Lee", "polobear", 2, 27);
        Companylaborcontract comlabor1 = new Companylaborcontract("Full-Time");

        System.out.println(member1.getMemberFirstName() + " " + member1.getMemberLastName());
        System.out.println(comlabor1.getRestTime() + " " + comlabor1.getLaborworkTime());

        int baseincome = (member1.getSalary() / 22 / comlabor1.getLaborworkTime());

        System.out.println("This Member is Fullsalary is " + member1.getSalary() + " Japan Yen.");
        System.out.println("This Member is Baseincome[for one Hours] is " + baseincome + " Japan Yen.");
        System.out.println("This Member work " + comlabor1.getLaborworkTime() * 22 + " Hours for Month.");


    }

}
