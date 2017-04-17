package example.codeclan.com.top10moviesapp;

import java.util.ArrayList;

public class Movie {
    private String title;
    private String genre;
    private int ranking;

    public Movie (String title, String genre, int ranking){
        this.title = title;
        this.genre = genre;
        this.ranking = ranking;
    }

    public String getTitle(){
        return title;
    }

    public String getGenre(){
        return genre;
    }

    public int getRanking() {
        return ranking;
    }

    public void setTitle(String newTitle) {
        title = newTitle;
    }

    public void setGenre(String newGenre) {
        genre = newGenre;
    }

    public void setRanking(int newRanking) {
        ranking = newRanking;
    }

    public String allDetails() {
        return "Title: " + title + ", Genre: " + genre + ", Ranking: " + ranking;
    }
}
