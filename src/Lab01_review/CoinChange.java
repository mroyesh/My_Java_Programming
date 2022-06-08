package Lab01_review;

public class CoinChange {
    public static void main(String[] args) {
        int priceInCent = 60;
        int change = 100 - priceInCent;
        int quarter = change/25;// 40- > 1 quarter
        int dime = (change%25)/10;// 15 - > 1 dime
        int nickles =((change%25)%10)/5; // 5 -> 1 nickle

        System.out.println("Quarter " + quarter + " Dime " + dime + " Nickle " + nickles );


    }
}
