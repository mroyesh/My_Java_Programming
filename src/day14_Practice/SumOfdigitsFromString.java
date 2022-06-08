package day14_Practice;

public class SumOfdigitsFromString {
    public static void main(String[] args) {
        String input= "CH1245INA";
        int sumdigits=0;
        for (int i = 0; i <input.length() ; i++) { // 0==48 and so on it comes from ascii table
            if(input.charAt(i) >= 48 && input.charAt(i) <= 57){
                sumdigits+=input.charAt(i)-48;
            }
        }
        System.out.println("sumdigits = " + sumdigits);
    }
}
