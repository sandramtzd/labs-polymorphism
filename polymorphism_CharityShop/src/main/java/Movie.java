public class Movie extends Media{

    private int durationMin;

    private String studiosName;

    public Movie (String title, String type, String genre, int releaseYear, boolean isNew, double cost, double sellPrice, int durationMin, String studiosName){
        super(title, type, genre, releaseYear, isNew, cost, sellPrice);
        this.durationMin = durationMin;
        this.studiosName = studiosName;
    }

    public boolean watch(){
        return true;

    }

    public String rewind(int minuteRewound){
       return "You rewound to minute " + minuteRewound;
    }

    //    GETTERS

    public String getTitle(){
        return this.title;
    }

    public String getType(){
        return this.type;
    }

    public String getGenre(){
        return this.genre;
    }

    public int getReleaseYear(){
        return this.releaseYear;

    }

    public boolean movieIsNew(){
        return this.isNew;
    }

    public double getCost(){
        return this.cost;
    }

    public double getSellPrice(){
        return this.sellPrice;
    }

    public int getDurationMin(){
        return this.durationMin;
    }

    public String getStudiosName(){
        return this.studiosName;
    }

    //    SETTERS

    public void setTitle(String title){
        this.title = title;
    }

    public void setType(String type){
        this.type = type;
    }

    public void setGenre(String genre){
        this.genre = genre;

    }

    public void setReleaseYear(int releaseYear){
        this.releaseYear = releaseYear;
    }

    public void setNewStatus(boolean isNew){
        this.isNew = isNew;
    }

    public void setCost (double cost){
        this.cost = cost;
    }

    public void setSellPrice (double sellPrice){
        this.sellPrice = sellPrice;
    }

    public void setDurationMin (int durationMin){
        this.durationMin = durationMin;
    }

    public void setStudiosName (String studiosName){
        this.studiosName = studiosName ;
    }


}
