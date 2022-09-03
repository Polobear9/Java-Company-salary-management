package ManageMent;

import java.util.Scanner;


public class Companylaborcontract {
    private String Companylabor;
    private int LaborworkTime;
    private int RestTime;
    Scanner sc = new Scanner(System.in);

    public Companylaborcontract(String Companylabor) {

        //Set a work time & Rest time.
        this.Companylabor = Companylabor;

        //set a rest time auto. Full time ? Part-time?
        if (Companylabor == "Part-Time") {
            System.out.println("Input the Work time : ");
            int inputWorkTime = sc.nextInt();
            this.LaborworkTime = inputWorkTime;
        }
        if (Companylabor == "Full-Time") {
            this.LaborworkTime = 8;
        }

        if (LaborworkTime >= 8) {
            this.RestTime = 1;
        }

        if (LaborworkTime < 6) {
            double SetRestTime = 0.45;
            this.RestTime = (int) SetRestTime;
        }
    }

    public String getCompanylabor() {
        return Companylabor;
    }

    public void setCompanylabor(String companylabor) {
        Companylabor = companylabor;
    }

    public int getLaborworkTime() {
        return LaborworkTime;
    }

    public void setLaborworkTime(int laborworkTime) {
        LaborworkTime = laborworkTime;
    }

    public int getRestTime() {
        return RestTime;
    }

    public void setRestTime(int restTime) {
        RestTime = restTime;
    }
}
