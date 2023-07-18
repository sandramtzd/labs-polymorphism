import java.util.ArrayList;

public class CharityShop {

    private String name;

    private double till;
    private ArrayList<Media> stock;

    public CharityShop(String name){
        this.name = name;
        this.till = 0;
        this.stock = new ArrayList<>();


    }

    public double calculateProfit(){
        double total = 0;
        for (Media media : this.stock){
            total += media.getSellPrice();
        }
        return total;
    }

    public int countMedia(){
        return this.stock.size();
    }

    public void addMediaToStock(Media media) {
        this.stock.add(media);
    }

//    GETTERS & SETTERS

    public double getTill() {
        return till;
    }

    public void setTill(double till) {
        this.till = till;
    }



}
