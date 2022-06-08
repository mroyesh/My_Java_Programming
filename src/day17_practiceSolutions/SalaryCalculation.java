package day17_practiceSolutions;

public class SalaryCalculation {

    public int hourlyRate;
    public int stateTaxRate;
    public int federalTaxRate;
    public int weeklyHours;

    public void setInfo(int hourlyRate, int stateTaxRate, int federalTaxRate, int weeklyHours) {
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
        this.weeklyHours = weeklyHours;
    }

    public double salary() {
        double salary = hourlyRate * weeklyHours * 52;
        return salary;
    }

    public double stateTax() {
        double stateTax = salary() * stateTaxRate / 100;
        return stateTax;
    }

    public double federalTax() {
        double federalTax = salary() * federalTaxRate / 100;
        return federalTax;


    }

    public double salaryAfterTax() {
        return salary() - (stateTax() + federalTax());
    }

    public String toString() {
        return "SalaryCalculation{" +
                "Hourly rate= $" + hourlyRate +
                ", weekly  hours= " + weeklyHours +
                ", State tax rate= " + stateTaxRate+"%" +
                ", Federal tax rate= " + federalTaxRate+"%" +
                ", Salary= $" + salary() +
                ", stat tax= $" + stateTax() +
                ", federal tax= $" + federalTax() +
                ", salary after tax= $" + salaryAfterTax() +
                '}';
    }
}




