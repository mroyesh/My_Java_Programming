package day25_constractors.PracticeTasks;

import java.time.LocalDate;
import java.util.ArrayList;

public class Movie {
    public String country,title, genre, director;
    public LocalDate releaseDate;
    public ArrayList<String> casts;

    public Movie(String country, String title, String director, LocalDate releaseDate) {
        this.country = country;
        this.title = title;
        this.director = director;
        this.releaseDate = releaseDate;


}
}
