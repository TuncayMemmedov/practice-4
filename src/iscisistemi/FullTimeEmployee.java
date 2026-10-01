package iscisistemi;

public class FullTimeEmployee implements Employee{           //7

    private int monthlySalary;

    public FullTimeEmployee(int monthlySalary){
        this.monthlySalary = monthlySalary;
    }

    public int getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(int monthlySalary) {
        this.monthlySalary = monthlySalary;
    }


    @Override
    public double calculateSalary(){
        return getMonthlySalary();
    }

}
