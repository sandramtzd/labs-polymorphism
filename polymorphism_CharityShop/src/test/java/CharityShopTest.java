import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CharityShopTest {

    CharityShop charityShop;

    @BeforeEach

    public void setUp(){
        charityShop = new CharityShop("British Hearth Foundation");
    }

    @Test
    public void canCountMedia() {
        assertThat(charityShop.countMedia()).isEqualTo(0);
    }

    @Test
    public void canAddMedia(){
        Media media = new Book ("Prisoners of Geography", "Book", "Geopolitics", 2015, true, 877, 2000, "Elliot & Thompson Limited", "Tim Marshall");
        charityShop.addMediaToStock(media);
        assertThat(charityShop.countMedia()).isEqualTo(1);
    }

    @Test

    public void canCalculateProfit(){
        Media media = new Book ("Prisoners of Geography", "Book", "Geopolitics", 2015, true, 877, 2000, "Elliot & Thompson Limited", "Tim Marshall");
        charityShop.addMediaToStock(media);
        double result = charityShop.calculateProfit();
        assertThat(result).isEqualTo(2000);
    }

//    Getters & SETTERS TEST
    @Test
    public void tillStartsAtZero(){
        assertThat(charityShop.getTill()).isEqualTo(0);
    }

    @Test
    public void canSetTill (){
        charityShop.setTill(500);
        assertThat(charityShop.getTill()).isEqualTo(500);
    }

    







}
