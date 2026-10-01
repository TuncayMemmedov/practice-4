package iscisistemi;

public class PartTimeEmployee implements Employee{          //7

    private String hours;
    private String hourlyRate;

    public PartTimeEmployee(String hours, String hourlyRate){
        this.hours = hours;
        this.hourlyRate = hourlyRate;
    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    public String getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(String hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {

        double hour = Double.parseDouble(hours);
        double rate = Double.parseDouble(hourlyRate);

        return hour * rate;
    }
}
