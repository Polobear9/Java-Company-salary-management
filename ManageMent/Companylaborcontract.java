package ManageMent;

import java.util.Scanner;


public class Companylaborcontract {
    private String Companylabor;
    private int LaborworkTime;
    private double RestTime;
    Scanner sc = new Scanner(System.in);

    public Companylaborcontract() {

        System.out.println("Enter the company LaborworkTime: ");
        System.out.println("1 : Part-Time , 2 : Full-Time");
        int Companylabor_Choose = sc.nextInt();


        /*
          before this switch sentence throw the null pointer exception
          need to check this code before we use this System,
          first now fix the null pointer exception.
          point --> Companylabor_Choose (Scanne)= 6 .. 7..--> null pointer exception
         */
        switch (Companylabor_Choose) {
            case 1:
                this.setCompanylabor("Part-Time");
                break;
            case 2:
                this.setCompanylabor("Full-Time");
                break;
            default:
                System.out.println("Try Again");
                System.exit(0);
        }
        //set a rest time auto. Full time ? Part-time?
        if (this.getCompanylabor().equals("Part-Time")) {
            System.out.println("Input the Work time : ");
            this.setLaborworkTime(sc.nextInt());
        }
        if (this.getCompanylabor().equals("Full-Time")) {
            this.setLaborworkTime(8);
        }

        if (this.getLaborworkTime() > 8) {
            this.setRestTime(1);
        }

        if (this.getLaborworkTime() <= 7) {
            this.setRestTime(0.45);
        }
    }

    // ----->>>>> setter and getter <<<<<-----

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

    // ----->>>>> setter and getter <<<<<-----
}
