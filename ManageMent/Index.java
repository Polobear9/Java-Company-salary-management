package ManageMent;


public class Index {

	public static void main(String[] args) {
		// Set the Member , Company Name , Member name , Member rank , Age
		Member member1 = new Member("Nexon", "Lee", "polobear", 2, 27);
		Companylaborcontract comlabor1 = new Companylaborcontract("Full-Time");
		
		System.out.print(member1.MemberFirstName + " " + member1.MemberLastName);
		
		System.out.println(comlabor1.RestTime + " " + comlabor1.LaborworkTime);

		System.out.println(member1.salary);
	}

}
