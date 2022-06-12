package ManageMent;


public class Index {

	public static void main(String[] args) {
		Member member1 = new Member("Nexon", "Lee", "Hyonseong", 5, 27);
		Companylaborcontract comlabor1 = new Companylaborcontract("full-time", 8);
		
		System.out.print(member1.MemberFirstName + " " + member1.MemberLastName);
		
		System.out.println(comlabor1.RestTime + " " + comlabor1.LaborworkTime);

		System.out.println(member1.salary);
	}

}
