package day08_ternaries_switch;

public class Elevator {
    public static void main(String[] args) {
        int floor = 13;
        String result = "";
        if ( floor >= 1 && floor <= 3 ) {
            if ( floor == 1 ) {
                result = "floor 1";
            } else if ( floor == 2 ) {
                result = "floor 2";
            } else
                result = "Floor 3";
        } else {
            result = "invalid floor plan";
        }
        System.out.println(result);

        



    }
}
