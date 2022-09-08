package ManageMent;

import java.util.Scanner;


public class Companylaborcontract {
    private String Companylabor;
    private int LaborworkTime;
    private double RestTime;
    Scanner sc = new Scanner(System.in);

    public Companylaborcontract(String Companylabor) {

        //Set a work time & Rest time.
        this.Companylabor = Companylabor;

        //set a rest time auto. Full time ? Part-time?
        if (Companylabor.equals("Part-Time")) {
            System.out.println("Input the Work time : ");
            this.LaborworkTime = sc.nextInt();
        }
        if (Companylabor.equals("Full-Time")) {
            this.LaborworkTime = 8;
        }

        if (LaborworkTime >= 8) {
            this.RestTime = 1;
        }

        if (LaborworkTime < 6) {
            this.RestTime = this.getRestTime() * 0.45;
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

    public double getRestTime() {
        return RestTime;
    }

    public void setRestTime(double restTime) {
        RestTime = restTime;
    }
}
