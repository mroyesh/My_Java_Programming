package day08_ternaries_switch;

public class Elevator {
    public static void main(String[] args) {
        int froor= 3;
        String result = "";
        if (froor>=1 && froor<=3){
            if(froor==1){
                result= "floor 1";
            } else if (froor==2) {
                result= "floor 2";
            }else
                result= "Floor 3";
        }else {
            result = "invalid floor plan";
        }
        System.out.println(result);

    }
}