package lab02_Tests;

public class AppleTask {
    public static void main(String[] args) {
        int apple1 = 10;
        int apple2 = 10;
        int apple3 = 10;
        int apple4 = 10;
        int apple5 = 500;
        int apple6 = 10;
        int apple7 = 20;
        int sum1 = apple1 + apple2 + apple3;
        int sum2 = apple4 + apple5 + apple6;
        if ( sum1 == sum2 ) {
            System.out.println("Apple 7 is (" + apple7 + "gr), and heaviest than others");
        } else if (sum1>sum2){
            if(apple1==apple2) {
                System.out.println("apple three is the heaviest");
            }else if(apple1>apple2) {
                System.out.println("apple one is the heaviest");
            }else {
                System.out.println("apple 2 is the heaviest");
            }
        }else if(sum2>sum1){
            if(apple4>apple5){
                System.out.println("apple four is the heaviest");
            }else if(apple5>apple4){
                System.out.println("apple five is hte heaviest");
            }else{
                System.out.println("apple six is the heaviest");
            }
        }
    }

}
