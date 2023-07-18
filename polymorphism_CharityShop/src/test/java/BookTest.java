import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BookTest {

    Book book;

    @BeforeEach
    public void setUp(){
        book = new Book ("The 4-hour work week", "Book", "Self-help", 2007, true, 800, 1400, "Penguin Random House", "Tim Ferris");
    }

    @Test
    public void canBeRead(){
        boolean actual = book.read();
        assertThat(actual).isEqualTo(true);
    }

    @Test
    public void bookSigned(){
        boolean actual = book.signCopy();
        assertThat(actual).isEqualTo(false);
    }

    @Test
    public void canChangeChapter(){
        assertThat(book.changeChapter(3)).isEqualTo("Chapter 3");
    }

//    GETTERS TEST

    @Test
    public void hasTitle(){
        assertThat(book.getTitle()).isEqualTo("The 4-hour work week");
    }

    @Test
    public void hasType(){
        assertThat(book.getType()).isEqualTo("Book");
    }

    @Test
    public void hasGenre(){
        assertThat(book.getGenre()).isEqualTo("Self-help");
    }

    @Test
    public void hasReleaseYear(){
        assertThat(book.getReleaseYear()).isEqualTo(2007);
    }

    @Test
    public void isNew(){
        assertThat(book.bookIsNew()).isEqualTo(true);
    }

    @Test
    public void hasCost(){
        assertThat(book.getCost()).isEqualTo(800);
    }

    @Test
    public void hasSellPrice(){
        assertThat(book.getSellPrice()).isEqualTo(1400);

    }

    @Test
    public void hasPublisher(){
        assertThat(book.getPublisher()).isEqualTo("Penguin Random House");
    }

    @Test
    public void hasAuthor(){
        assertThat(book.getAuthor()).isEqualTo("Tim Ferris");
    }

    //    SETTERS TEST

    @Test
    public void canSetTitle(){
        book.setTitle("To kill a mockingbird");
        assertThat(book.getTitle()).isEqualTo("To kill a mockingbird");


    }
    @Test
    public void canSetType(){
        book.setType("Book");
        assertThat(book.getType()).isEqualTo("Book");
    }

    @Test
    public void canSetGenre(){
        book.setGenre("Mystery");
        assertThat(book.getGenre()).isEqualTo("Mystery");
    }

    @Test
    public void canSetReleaseYear(){
        book.setReleaseYear(1960);
        assertThat(book.getReleaseYear()).isEqualTo(1960);
    }

    @Test
    public void canSetNewStatus(){
        book.setNewStatus(true);
        assertThat(book.bookIsNew()).isEqualTo(true);



    }

    @Test
    public void canSetCost(){
        book.setCost(300);
        assertThat(book.getCost()).isEqualTo(300);
    }

    @Test
    public void canSetSellPrice(){
        book.setSellPrice(500);
        assertThat(book.getSellPrice()).isEqualTo(500);
    }

    @Test
    public void canSetPublisher(){
        book.setPublisher("Penguin");
        assertThat(book.getPublisher()).isEqualTo("Penguin");
    }

    @Test
    public void canSetAuthor(){
        book.setAuthor("Harper Lee");
        assertThat(book.getAuthor()).isEqualTo("Harper Lee");
    }






}
