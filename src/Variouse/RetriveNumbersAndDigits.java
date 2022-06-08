package Variouse;

public class RetriveNumbersAndDigits {
    public static void main(String[] args) {
        String input = "happy2022_programming@cydeo.com";
        String letters = "";
        String numbers = "";
        String specialChar = "";
        for (int i = 0; i < input.length(); i++) {
            if ( input.charAt(i) >= '0' && input.charAt(i) <= '9' ) {
                numbers += input.charAt(i);
            } else if ( input.charAt(i) >= 'a' && input.charAt(i) <= 'z'
                    || input.charAt(i) >= 'A' && input.charAt(i) <= 'Z' ) {
                letters += input.charAt(i);
            } else {
                specialChar += input.charAt(i);
            }
        }
            System.out.println("specialChar = " + specialChar);
            System.out.println("numbers = " + numbers);
            System.out.println("letters = " + letters);


        /*String str= "yasin2022_tawasulli@gmail.com";
        String digits ="";
        String letters="";
        String specialChar= "";
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i) >='1' && str.charAt(i) <= '9'){
                digits+=str.charAt(i);
            }else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z'
                    || str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
                letters+=str.charAt(i);
            }else{
                specialChar+=str.charAt(i);
            }
        }
        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);
        System.out.println("specialeChar = " + specialChar);*/
        }



    }

