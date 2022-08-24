package day30_inheritance.TaskSolutions.SportTask;

import day30_inheritance.TaskSolutions.SportTask.BaseBall;
import day30_inheritance.TaskSolutions.SportTask.BasketBall;
import day30_inheritance.TaskSolutions.SportTask.FootBall;

public class TestSportObject {
    public static void main(String[] args) {

        BasketBall team1= new BasketBall(" LA lakers", " five people each side in two teams", 5, 2, "United States");

        BaseBall team2= new BaseBall("England Eagle", "two teams compete together", 9, 2, "British");

        FootBall team3= new FootBall(" Real Madrid", " touching the ball is not allowed with hand", 11, 1, "Brazil" );

        System.out.println(team1);
        System.out.println(team2);
        System.out.println(team3);
    }



}
