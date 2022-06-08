package day05_Operators;

public class SalaryCalculator {
    public static void main(String[] args) {
        int Hourlyrate = 40, Wklyrate = 45;
        double stateTaxRate = 4.6, fdralTxrate = 7.9;
        double salaryBforeTax = Hourlyrate * 45 * 52;
        double stattax = salaryBforeTax *stateTaxRate/100;
        double fdratax = salaryBforeTax*fdralTxrate/100;
        double totaltx = fdratax+stattax;
        double salaryaftertaxx = salaryBforeTax - totaltx;
        System.out.println("salaryBforeTax = " + salaryBforeTax);
        System.out.println("stattax = " + stattax);
        System.out.println("fdratax = " + fdratax);
        System.out.println("totaltx = " + totaltx);
        System.out.println("salaryaftertaxx = " + salaryaftertaxx);

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
                "\ntotal tax is: $" +totalTax+
                "\nNet income is: $" + salaryAfterTax);*/


    }



}
