package example.codeclan.com.top10moviesapp;

public class Rankings {
    private Movie[] topten;

    public Rankings(){
        this.topten = new Movie[10];
    }

    public void addMovie(Movie movie){
        int index = movie.getRanking() -1;
        this.topten[index] = movie;
    }

    public Movie getMovieByRank(int rank) {
        return this.topten[rank -1];
    }

    public void setLastMovie(String newTitle, String newGenre) {
        int newIndex = 9;
        topten[] = new Movie(newTitle, newGenre, newIndex);
    }
}
