package ManageMent;
import java.util.Scanner;


public class Companylaborcontract {
	Scanner sc = new Scanner(System.in);
	String Companylabor;
	int LaborworkTime;
	int RestTime;

	
	
	public Companylaborcontract(String Companylabor) {
		//Set a work time & Rest time.
		
		this.Companylabor = Companylabor;
		
		if(Companylabor == "Part-Time") {
			System.out.println("Input the Work time : ");
			int inputWorkTime = sc.nextInt();
			this.LaborworkTime = inputWorkTime;
		}
		if(Companylabor == "Full-Time") {
			this.LaborworkTime = 8;
		}
		
		
		
		
		if(LaborworkTime >= 8) {
			this.RestTime = 1;

		}
		if(LaborworkTime < 6) {
			double SetRestTime = 0.45;
			this.RestTime = (int) SetRestTime;
			
		}
	}

}
