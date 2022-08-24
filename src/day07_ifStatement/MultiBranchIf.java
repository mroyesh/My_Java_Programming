package day07_ifStatement;

public class MultiBranchIf {
    public static void main(String[] args) {
        int num = 0;
        /*String result = "";
        if(num>0){
            result= "positive";
        }
        if (num<0){
            result=" Negative";
        }
        if (num == 0){
            result = " Zero";
        }
        System.out.println("result");*/
        System.out.println("-------------");
        String result2 = "";
        if (num > 0) {
            result2 =" positive";
        } else if (num < 0) {
                result2 = "negative";
        }else{
            result2 = "Zero";
            }
            System.out.println(result2);
    }
}