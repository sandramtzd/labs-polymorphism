import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class VideogameTest {

    Videogame videogame;

    @BeforeEach
    public void setUp(){
        videogame = new Videogame("Zelda: Majora's Mask", "Videogame", "Adventure", 2000, false, 199, 499, "Nintendo", "Nintendo 64");

    }
    @Test
    public void canBePlayed(){
        boolean actual = videogame.play();
        assertThat(actual).isEqualTo(true);


    }

    @Test
    public void canShowLevel(){
        String actual = videogame.level(6);
        assertThat(actual).isEqualTo("You are on level 6");
    }

    //    GETTERS TEST

    @Test
    public void hasTitle(){
        assertThat(videogame.getTitle()).isEqualTo("Zelda: Majora's Mask");
    }

    @Test
    public void hasType(){
        assertThat(videogame.getType()).isEqualTo("Videogame");
    }

    @Test
    public void hasGenre(){
        assertThat(videogame.getGenre()).isEqualTo("Adventure");
    }

    @Test
    public void hasReleaseYear(){
        assertThat(videogame.getReleaseYear()).isEqualTo(2000);
    }

    @Test
    public void isNew(){
        assertThat(videogame.videogameIsNew()).isEqualTo(false);
    }

    @Test
    public void hasCost(){
        assertThat(videogame.getCost()).isEqualTo(199);
    }

    @Test
    public void hasSellPrice(){
        assertThat(videogame.getSellPrice()).isEqualTo(499);

    }

    @Test
    public void hasSoftwareHouse(){
        assertThat(videogame.getSoftwareHouse()).isEqualTo("Nintendo");
    }

    @Test
    public void hasPlatform(){
        assertThat(videogame.getPlatform()).isEqualTo("Nintendo 64");
    }

    //    SETTERS TEST

    @Test
    public void canSetTitle(){
        videogame.setTitle("Kingdom Hearts");
        assertThat(videogame.getTitle()).isEqualTo("Kingdom Hearts");


    }
    @Test
    public void canSetType(){
        videogame.setType("Videogame");
        assertThat(videogame.getType()).isEqualTo("Videogame");
    }

    @Test
    public void canSetGenre(){
        videogame.setGenre("Fantasy");
        assertThat(videogame.getGenre()).isEqualTo("Fantasy");
    }

    @Test
    public void canSetReleaseYear(){
        videogame.setReleaseYear(2002);
        assertThat(videogame.getReleaseYear()).isEqualTo(2002);
    }

    @Test
    public void canSetNewStatus(){
        videogame.setNewStatus(false);
        assertThat(videogame.videogameIsNew()).isEqualTo(false);

    }

    @Test
    public void canSetCost(){
        videogame.setCost(600);
        assertThat(videogame.getCost()).isEqualTo(600);
    }

    @Test
    public void canSetSellPrice(){
        videogame.setSellPrice(900);
        assertThat(videogame.getSellPrice()).isEqualTo(900);
    }

    @Test
    public void canSetSoftwareHouse(){
        videogame.setSoftwareHouse("Square Enix");
        assertThat(videogame.getSoftwareHouse()).isEqualTo("Square Enix");
    }

    @Test
    public void canSetPlatform(){
        videogame.setPlatform("Playstation 2");
        assertThat(videogame.getPlatform()).isEqualTo("Playstation 2");
    }










}
