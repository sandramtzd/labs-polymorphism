import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MovieTest {

    Movie movie;

    @BeforeEach
    public void setUp(){
        movie = new Movie ("Barbie", "Movie", "Comedy", 2023, true, 5000, 9999, 114, "Warner Bros");
    }

    @Test
    public void canBeWatched(){
        boolean actual = movie.watch();
        assertThat(actual).isEqualTo(true);
    }

    @Test
    public void canBeRewound(){
        String actual = movie.rewind(100);
        assertThat(actual).isEqualTo("You rewound to minute 100");


    }


    //    GETTERS TEST

    @Test
    public void hasTitle(){
        assertThat(movie.getTitle()).isEqualTo("Barbie");
    }

    @Test
    public void hasType(){
        assertThat(movie.getType()).isEqualTo("Movie");
    }

    @Test
    public void hasGenre(){
        assertThat(movie.getGenre()).isEqualTo("Comedy");
    }

    @Test
    public void hasReleaseYear(){
        assertThat(movie.getReleaseYear()).isEqualTo(2023);
    }

    @Test
    public void isNew(){
        assertThat(movie.movieIsNew()).isEqualTo(true);
    }

    @Test
    public void hasCost(){
        assertThat(movie.getCost()).isEqualTo(5000);
    }

    @Test
    public void hasSellPrice(){
        assertThat(movie.getSellPrice()).isEqualTo(9999);

    }

    @Test
    public void hasDurationMin(){
        assertThat(movie.getDurationMin()).isEqualTo(114);
    }

    @Test
    public void hasStudiosName(){
        assertThat(movie.getStudiosName()).isEqualTo("Warner Bros");
    }

    //    SETTERS TEST

    @Test
    public void canSetTitle(){
        movie.setTitle("Awakenings");
        assertThat(movie.getTitle()).isEqualTo("Awakenings");


    }
    @Test
    public void canSetType(){
        movie.setType("Movie");
        assertThat(movie.getType()).isEqualTo("Movie");
    }

    @Test
    public void canSetGenre(){
        movie.setGenre("Drama");
        assertThat(movie.getGenre()).isEqualTo("Drama");
    }

    @Test
    public void canSetReleaseYear(){
        movie.setReleaseYear(1990);
        assertThat(movie.getReleaseYear()).isEqualTo(1990);
    }

    @Test
    public void canSetNewStatus(){
        movie.setNewStatus(false);
        assertThat(movie.movieIsNew()).isEqualTo(false);

    }

    @Test
    public void canSetCost(){
        movie.setCost(400);
        assertThat(movie.getCost()).isEqualTo(400);
    }

    @Test
    public void canSetSellPrice(){
        movie.setSellPrice(700);
        assertThat(movie.getSellPrice()).isEqualTo(700);
    }

    @Test
    public void canSetDurationMin(){
        movie.setDurationMin(121);
        assertThat(movie.getDurationMin()).isEqualTo(121);
    }

    @Test
    public void canSetStudiosName(){
        movie.setStudiosName("Columbia Pictures");
        assertThat(movie.getStudiosName()).isEqualTo("Columbia Pictures");
    }


}


