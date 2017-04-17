package example.codeclan.com.top10moviesapp;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class MovieTest {

    Movie film;

    @Before
    public void before() {
        film = new Movie("High Fidelity", "Indie", 3 );
    }

    @Test
    public void testMovieSetup(){
        assertEquals("High Fidelity", film.getTitle());
        assertEquals("Indie", film.getGenre());
        assertEquals(3, film.getRanking());
    }

    @Test
    public void testTileSet(){
        film.setTitle("Lion King 2");
        assertEquals("Lion King 2", film.getTitle());
    }

    @Test
    public void testGenreSet(){
        film.setGenre("PG");
        assertEquals("PG", film.getGenre());
    }

    @Test
    public void testRankingSet(){
        film.setRanking( 9 );
        assertEquals( 9, film.getRanking());
    }
}

