package management;


public class CompanyLaborContract {
    private String companyLabor;
    private int laborWorkTime;
    private double RestTime;

    private CompanyLaborContract() {}


    public static CompanyLaborContract makeEmployLaborInstance() {
        CompanyLaborContract worker = new CompanyLaborContract();
        calculateLaborAndWorkTime(worker);
        calculateRestTime(worker);
        return worker;
    }

    private static void calculateRestTime(CompanyLaborContract worker) {
        if (worker.getLaborWorkTime() > 8) {
            worker.setRestTime(1);
        }

        if (worker.getLaborWorkTime() <= 7) {
            worker.setRestTime(0.45);
        }
    }

    private static void calculateLaborAndWorkTime(CompanyLaborContract worker) {
        System.out.println("please enter the number of labor.");
        System.out.println("1.Full Time , 2.Part Time");
        System.out.print("--->");
        int companyLabor = Tools.getScannerInstance().nextInt();
        switch (companyLabor) {
            case 1:
                worker.setCompanyLabor("Full Time");
                worker.setLaborWorkTime(8);
                break;
            case 2:
                System.out.println("Please enter the working time.");
                System.out.print("--->");
                int workingTime = Tools.getScannerInstance().nextInt();
                worker.setCompanyLabor("Part Time");
                worker.setLaborWorkTime(workingTime);
                break;
        }
    }
    // ----->>>>> setter and getter <<<<<-----

    public String getCompanyLabor() {
        return companyLabor;
    }

    public void setCompanyLabor(String companyLabor) {
        this.companyLabor = companyLabor;
    }

    public int getLaborWorkTime() {
        return laborWorkTime;
    }

    public void setLaborWorkTime(int laborWorkTime) {
        this.laborWorkTime = laborWorkTime;
    }

    public double getRestTime() {
        return RestTime;
    }

    public void setRestTime(double restTime) {
        RestTime = restTime;
    }

    // ----->>>>> setter and getter <<<<<-----
}
