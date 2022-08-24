package day19_array;

public class DecimalFormat {

    public static void main(String[] args) {
        java.text.DecimalFormat df= new java.text.DecimalFormat("0.00");

        double d1= 5.98798778;
        System.out.println(df.format(d1));

    }
}
