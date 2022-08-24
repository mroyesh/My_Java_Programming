package day25_constractors.PracticeTasks;

public class SalaryCalculator {


    public int hourlyRate;
    public int weeklyHours;
    public double stateTaxRate;
    public double federalTaxRate;

    public SalaryCalculator(int hourlyRate, int weeklyHours, double stateTaxRate, double federalTaxRate) {
        this.hourlyRate = hourlyRate;
        this.weeklyHours = weeklyHours;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;

    }
    public double salary(){
        double salary= hourlyRate*weeklyHours*52;
        return salary;
    }

    public double stateTax(){
        double stateTax= salary()*stateTaxRate/100;
        return stateTax;

    }
    public double federalTax(){
        double federalTax= salary()*federalTaxRate/100;
        return federalTax;

    }
    public double salaryAfterTax(){
        double totalTax= federalTax()+stateTax();
        double salaryAfterTax= salary()-totalTax;
        return salaryAfterTax;
    }

    public String toString() {
        return "SalaryCalculator{" +
                "hourlyRate= $" + hourlyRate +
                ", weeklyHours= $" + weeklyHours +
                ", stateTaxRate= $" + stateTaxRate +
                ", salary= $" + salary() +
                ", federal tax = $" + federalTax() +
                ", state tax= $" + stateTax()+
                ", salary after tax = $" + salaryAfterTax() +
                '}';
    }
    public static void main(String[] args) {

        SalaryCalculator storeManager = new SalaryCalculator(27, 45, 7, 4);
        System.out.println(storeManager);

        SalaryCalculator teamLeader = new SalaryCalculator(24, 40, 7, 3.75);
        System.out.println(teamLeader);
    }
}
