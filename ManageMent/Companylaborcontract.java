package ManageMent;

public class Companylaborcontract {
	
	String Companylabor;
	int LaborworkTime;
	int RestTime;

	
	
	public Companylaborcontract(String Companylabor, int LaborworkTime) {
		
		this.Companylabor = Companylabor;
		this.LaborworkTime = LaborworkTime;
	
		if(LaborworkTime == 8) {
			this.RestTime = 1;
		}
	}

}
