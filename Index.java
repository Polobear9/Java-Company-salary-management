package ManageMent;


public class Index {
	
	public static void main(String[] args) {
		// Set the Member , Company Name , Member name , Member rank , Age
		Member member1 = new Member("Nexon", "Lee", "polobear", 2, 27);
		Companylaborcontract comlabor1 = new Companylaborcontract("Full-Time");
		
		System.out.print(member1.MemberFirstName + " " + member1.MemberLastName);
		
		System.out.println(comlabor1.RestTime + " " + comlabor1.LaborworkTime);

		System.out.println(member1.salary);
		
		int baseincome = (member1.salary / 22 / comlabor1.LaborworkTime);
		int Fullsalary = baseincome * 22;
		System.out.println("This Member is Fullsalary is " + Fullsalary + " Japan Yen.");
		System.out.println("This Member is Baseincome is " + baseincome + " Japan Yen.");
		System.out.println("This Member work " + comlabor1.LaborworkTime * 22 + " Hours.");
		
		
		
	}

}
