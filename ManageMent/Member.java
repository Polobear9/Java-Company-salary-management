package ManageMent;

public class Member {
	

	String ComName;
	String MemberFirstName;
	String MemberLastName;
	int CompanyRank;
	int Age;
	int salary;
	
	public Member(String ComName, String MemberFirstName, String MemberLastName, int CompanyRanks, int Age) {
		this.ComName = ComName;
		this.MemberFirstName = MemberFirstName;
		this.MemberLastName = MemberLastName;
		this.CompanyRank = CompanyRanks;
		this.Age = Age;
		
		switch(CompanyRank) {
		//Set Base Salary each rank.
		case 1:
			this.salary = 350000;
			return;
		case 2:
			this.salary = 250000;
			return;
		case 3:
			this.salary = 200000;
		default:
			this.salary = 180000;
			return;
		
		}
	}
		
		
		
}
