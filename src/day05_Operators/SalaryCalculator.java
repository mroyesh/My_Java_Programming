package day05_Operators;

public class SalaryCalculator {
    public static void main(String[] args) {
        int HourlyRate = 40, WklyRate = 45;
        double stateTaxRate = 4.6, federalTaxRate = 7.9;
        double salaryBeforeTax = HourlyRate * WklyRate * 52;
        double statTax = salaryBeforeTax *stateTaxRate/100;
        double fdratax = salaryBeforeTax*federalTaxRate/100;
        double totaltx = fdratax+statTax;
        double salaryaftertaxx = salaryBeforeTax - totaltx;
        System.out.println("salaryBforeTax = " + salaryBeforeTax);
        System.out.println("stat tax = " + statTax);
        System.out.println("federal tax = " + fdratax);
        System.out.println("total tax = " + totaltx);
        System.out.println("salary after tax = " + salaryaftertaxx);

        /*int hourlyRate= 55,weeklyHours = 45;
        double stateTaxRate= 7.5, federalTaxRate =24.5;
        double salaryBeforeTax = hourlyRate * weeklyHours * 52;
        double stateTax = salaryBeforeTax * stateTaxRate/100;
        double federalTax = salaryBeforeTax * federalTaxRate/100;
        double totalTax = stateTax + federalTax;
        double salaryAfterTax = salaryBeforeTax - totalTax;

        //System.out.println("Gross pay is: $" + salaryBeforeTax);
      //  System.out.println("Federal tax is: $" );

        System.out.println("----------------------------");
        System.out.println("Gross pay is: $ "+ salaryBeforeTax +
                "\nFederal tax is: $" + federalTax +
                "\nState tax is: $" + stateTax +
                "\n total tax is: $" +totalTax+
                "\nNet income is: $" + salaryAfterTax);*/


    }



}
