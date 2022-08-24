package day30_inheritance.TaskSolutions.SportTask;

import java.time.LocalDate;

public class BaseBall extends Sport {
    private LocalDate firstPlayed;

    public BaseBall(String name, String rules, int numberOfPlayers, int getNumberOfReferre, String origen) {
        super(name, rules, numberOfPlayers, getNumberOfReferre, origen);
    }

    public LocalDate getFirstPlayed() {
        return firstPlayed;
    }

    public void setFirstPlayed(LocalDate firstPlayed) {

        this.firstPlayed = firstPlayed;
    }
}


