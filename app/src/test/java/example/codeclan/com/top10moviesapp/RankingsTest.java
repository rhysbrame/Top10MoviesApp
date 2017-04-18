package example.codeclan.com.top10moviesapp;

import org.junit.Before;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;

public class RankingsTest {

    Rankings topten;
    Movie movie1;
    Movie movie2;
    Movie movie10;

    @Before
    public void before(){
        topten = new Rankings();
        movie1 = new Movie("High Fidelity", "Indie", 1);
        movie2 = new Movie("Xmen", "Adult", 2);
        movie10 = new Movie("Ten", "Noir", 10);
    }

    @Test
    public void testMovieNameByRanking(){
        topten.addMovie(movie1);
        Movie mymovie = topten.getMovieByRank(1);
        assertEquals("High Fidelity", mymovie.getTitle() );
    }

    @Test
    public void testReplaceLastMovie(){
        topten.addMovie(movie10);
        Movie mymovie = topten.setLastMovie("Eleven","Comedy");
        assertEquals("Eleven", mymovie.getTitle());
    }
}
